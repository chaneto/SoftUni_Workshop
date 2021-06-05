CREATE DATABASE `fsd`;
USE `fsd`;

CREATE TABLE `coaches`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`first_name` VARCHAR(10) NOT NULL,
`last_name` VARCHAR(20) NOT NULL,
`salary` DECIMAL(10,2) DEFAULT 0 NOT NULL,
`coach_level` INT DEFAULT 0 NOT NULL
);

CREATE TABLE `skills_data`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`dribbling` INT DEFAULT 0,
`pace` INT DEFAULT 0,
`passing` INT DEFAULT 0,
`shooting` INT DEFAULT 0,
`speed` INT DEFAULT 0,
`strength` INT DEFAULT 0
);

CREATE TABLE `countries`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL
);

CREATE TABLE `towns`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
`country_id` INT NOT NULL,
CONSTRAINT `fk_towns_countries`
FOREIGN KEY `towns`(`country_id`)
REFERENCES `countries`(`id`)
);

CREATE TABLE `stadiums`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
`capacity` INT NOT NULL,
`town_id` INT NOT NULL,
CONSTRAINT `fk_stadiums_towns`
FOREIGN KEY `stadiums`(`town_id`)
REFERENCES `towns`(`id`)
);

CREATE TABLE `teams`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
`established` DATE  NOT NULL,
`fan_base` BIGINT DEFAULT 0 NOT NULL,
`stadium_id` INT NOT NULL,
CONSTRAINT `fk_teams_stadiums`
FOREIGN KEY `teams`(`stadium_id`)
REFERENCES `stadiums`(`id`)
);

CREATE TABLE `players`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`first_name` VARCHAR(10) NOT NULL,
`last_name` VARCHAR(20) NOT NULL,
`age` INT DEFAULT 0 NOT NULL,
`position` CHAR(1) NOT NULL,
`salary` DECIMAL(10,2) DEFAULT 0 NOT NULL,
`hire_date` DATETIME,
`skills_data_id` INT NOT NULL,
CONSTRAINT `fk_players_skill_datas`
FOREIGN KEY `players`(`skills_data_id`)
REFERENCES `skills_data`(`id`),
`team_id` INT,
CONSTRAINT `fk_players_skill_teams`
FOREIGN KEY `players`(`team_id`)
REFERENCES `teams`(`id`)
);

CREATE TABLE `players_coaches`(
`player_id` INT,
CONSTRAINT `fk_players_coaches_players`
FOREIGN KEY `players_coaches`(`player_id`)
REFERENCES `players`(`id`),
`coach_id` INT,
CONSTRAINT `fk_players_coaches_coachs`
FOREIGN KEY `players_coaches`(`coach_id`)
REFERENCES `coaches`(`id`)
);

#2 ⦁	Insert
INSERT INTO `coaches`(`first_name`, `last_name`, `salary`, `coach_level`)
SELECT  P.`first_name`, P.`last_name`, P.`salary` * 2 , CHAR_LENGTH(P.`first_name`)
FROM `players` AS P
WHERE P.`age` >= 45;

#3 UPDATE
UPDATE `coaches`
SET `coach_level` = `coach_level` + 1
WHERE SUBSTRING(`first_name`,1,1) = 'A' AND `id` IN (SELECT `coach_id` FROM `players_coaches`);

# 4 DELETE
DELETE FROM `players`
WHERE `age` >= 45;


#5 PLAYERS
SELECT `first_name`, `age`, `salary`
FROM `players`
ORDER BY `salary` DESC;

#6 ⦁	Young offense players without contract
SELECT P.`id`, CONCAT(P.`first_name`, ' ', P.`last_name`) AS `full_name`,P. `age`, P.`position`, P.`hire_date`
FROM `players` AS P
JOIN `skills_data` AS SK
ON SK.`id` = P.`skills_data_id`
WHERE P.`position` = 'A' AND P.`age` < 23 AND P.`hire_date` IS NULL AND SK.`strength` > 50
ORDER BY P.`salary` , P.`age`;

#7 ⦁	Detail info for all teams
SELECT T.`name` AS `team_name`, T.`established`, T.`fan_base`, COUNT(P.`id`) AS `players_count`
FROM `teams` AS T
LEFT JOIN `players` AS P
ON P.`team_id`  = T.`id`
GROUP BY T.`id`
ORDER BY `players_count` DESC, T.`fan_base` DESC;

#8 ⦁	The fastest player by towns
SELECT  MAX(SK.`speed`) AS `max_speed`, TOWN.`name` AS `town_name`
FROM `towns` AS TOWN
LEFT JOIN `stadiums` AS STADIUM
ON STADIUM.`town_id` = TOWN.`id`
LEFT JOIN `teams` AS TEAM
ON STADIUM.`id` = TEAM.`stadium_id`
LEFT JOIN `players` AS P
ON TEAM.`id` = P.`team_id`
LEFT JOIN `skills_data` AS SK
ON SK.`id` = p.`skills_data_id`
WHERE TEAM.`name` != 'Devify'
GROUP BY  TOWN.`id`
ORDER BY `max_speed` DESC, `town_name`;

#9 ⦁	Total salaries and players by country
SELECT COUNTRY.`name`, COUNT(P.`id`)AS `total_count_of_players`, SUM(P.`salary`)  AS `total_sum_of_salaries`
FROM `countries` AS COUNTRY
LEFT JOIN `towns` AS TOWN
ON TOWN.`country_id` = COUNTRY.`id`
LEFT JOIN `stadiums` AS STADIUM
ON STADIUM.`town_id` = TOWN.`id`
LEFT JOIN `teams` AS TEAMS
ON TEAMS.`stadium_id` = STADIUM.`id`
LEFT JOIN `players` AS P
ON P.`team_id` = TEAMS.`id`
GROUP BY COUNTRY.`name`
ORDER BY `total_count_of_players` DESC, COUNTRY.`name`;

#10 ⦁	Find all players that play on stadium
DELIMITER $$
CREATE FUNCTION `udf_stadium_players_count` (`stadium_name` VARCHAR(30)) 
RETURNS INT
BEGIN
RETURN (SELECT COUNT(P.`id`)
FROM `players` AS p
JOIN `teams` AS TEAM
ON TEAM.`id` = P.`team_id`
JOIN `stadiums` AS S
ON S.`id` = TEAM.`stadium_id`
WHERE S.`name` = `stadium_name`);
END; $$

SELECT udf_stadium_players_count ('Jaxworks') as `count`; 

#11 ⦁	Find good playmaker by teams
DELIMITER $$
CREATE PROCEDURE `udp_find_playmaker`(`min_dribble_points` INT, `team_name` VARCHAR(45) )
BEGIN
SELECT CONCAT(P.`first_name`,' ', P.`last_name`) AS `full_name`, P.`age`, P.`salary`,
SK.`dribbling`, SK.`speed`, T.`name` AS `team_name`
FROM `skills_data` AS SK
JOIN `players` AS P
ON P.`skills_data_id` = SK.`id`
JOIN `teams` AS T
ON T.`id` = P.`team_id`
WHERE SK.`dribbling` > `min_dribble_points` AND
T.`name` = `team_name` AND
SK.`speed` > (SELECT AVG(`speed`) FROM `skills_data`)
ORDER BY SK.`speed` DESC
LIMIT 1;
END; $$

CALL udp_find_playmaker (20, 'Skyble');






