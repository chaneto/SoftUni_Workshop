CREATE DATABASE `colonial_journey_management_system_db`;
USE `colonial_journey_management_system_db`;

CREATE TABLE `planets`(
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
`name` VARCHAR(30) NOT NULL
);

CREATE TABLE `spaceports`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL,
`planet_id` INT,
CONSTRAINT `fk_spaceports_planets`
FOREIGN KEY `spaceports` (`planet_id`)
REFERENCES `planets`(`id`)
);

CREATE TABLE `spaceships`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL,
`manufacturer` VARCHAR(30) NOT NULL,
`light_speed_rate` INT DEFAULT NULL
);

CREATE TABLE `colonists`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`first_name` VARCHAR(20) NOT NULL,
`last_name` VARCHAR(20) NOT NULL,
`ucn` CHAR(10) NOT NULL UNIQUE,
`birth_date` DATE NOT NULL
);

CREATE TABLE `journeys`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`journey_start` DATETIME NOT NULL,
`journey_end` DATETIME NOT NULL,
`purpose` ENUM('Medical', 'Technical', 'Educational', 'Military'),
`destination_spaceport_id` INT,
CONSTRAINT `fk_ journeys_spaceports`
FOREIGN KEY `journeys`(`destination_spaceport_id`)
REFERENCES `spaceports`(`id`),
`spaceship_id` INT,
CONSTRAINT `fk_journeys_spaceships`
FOREIGN KEY `journeys`(`spaceship_id`)
REFERENCES `spaceships`(`id`)
);

CREATE TABLE `travel_cards`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`card_number` CHAR(10) NOT NULL UNIQUE,
`job_during_journey` ENUM ('Pilot', 'Engineer', 'Trooper', 'Cleaner', 'Cook'),
`colonist_id` INT,
CONSTRAINT `fk_travel_cards_colonists`
FOREIGN KEY `travel_cards`(`colonist_id`)
REFERENCES `colonists`(`id`),
`journey_id` INT,
CONSTRAINT `fk_travel_cards_journeys`
FOREIGN KEY `travel_cards`(`journey_id`)
REFERENCES `journeys`(`id`)
);

#1 	Data Insertion
INSERT INTO `travel_cards`(`card_number`, `job_during_journey`, `colonist_id`, `journey_id`)
SELECT
 (
CASE 
WHEN C.`birth_date`> '1980-01-01' THEN CONCAT(YEAR(C.`birth_date`), DAY(C.`birth_date`), SUBSTRING(C.`ucn`,1,4))
ELSE CONCAT(YEAR(`birth_date`), MONTH(`birth_date`), SUBSTRING(C.`ucn`, 7,10)) END
) AS `card_number`,
(CASE 
WHEN C.`id` %2 = 0 THEN 'Pilot'
WHEN C.`id` %3 = 0 THEN 'Cook'
ELSE 'Engineer' END ) AS `job_during_journey`,
(C.`id`) AS `colonist_id`,
(SUBSTRING(C.`ucn`, 1, 1)) AS `journey_id`
 FROM `colonists` AS C
    WHERE c.id between 96 AND 100;
    
#2 ⦁	Data Update
UPDATE `journeys`
SET `purpose` = (
CASE
WHEN `id` %2 = 0 THEN 'Medical'
WHEN `id` %3 = 0 THEN 'Technical'
WHEN `id` %5 = 0 THEN 'Educational'
WHEN `id` %7 = 0 THEN 'Military'
ELSE `purpose`
END
);

#3 ⦁	Data Deletion
DELETE FROM `colonists`
WHERE `id` NOT IN (SELECT TC.`colonist_id` FROM `travel_cards` AS TC);


#4 Extract all travel cards
SELECT `card_number`, `job_during_journey`
FROM `travel_cardS`
ORDER BY `card_number`;


#5 . Extract all colonists
SELECT `id`, CONCAT(`first_name`, ' ' ,`last_name`) AS `full_name`, `ucn`
FROM `colonists`
ORDER BY `first_name`, `last_name`, `id`;

#6 ⦁	Extract all military journeys
SELECT `id`, `journey_start`, `journey_end`
FROM `journeys`
WHERE `purpose` = 'Military'
ORDER BY `journey_start`;

#7 ⦁	Extract all pilots
SELECT C.`id`, CONCAT(C.`first_name`, ' ', C.`last_name`)
FROM `colonists` AS C
JOIN `travel_cards` AS T
ON T.`colonist_id` = C.`id`
WHERE T.`job_during_journey` = 'pilot'
ORDER BY C.`id`;
 
 #8 ⦁	Count all colonists that are on technical journey
 SELECT  COUNT(*) AS `count`
 FROM `colonists` AS C
 JOIN `travel_cards` AS T
 ON C.`id` = T.`colonist_id`
 JOIN `journeys` AS J
 ON T.`journey_id` = J.`id`
 WHERE J.`purpose` = 'Technical';

#9 # 09.Extract the fastest spaceship
SELECT SH.`name` AS `spaceship_name`, SP.`name` AS `spaceport_name`
FROM `spaceships` AS SH
JOIN `journeys` AS J
ON J.`spaceship_id` = SH.`id`
JOIN `spaceports` AS SP
ON SP.`id` = J.`destination_spaceport_id`
ORDER BY SH.`light_speed_rate`  DESC
LIMIT 1;

# 10.Extract spaceships with pilots younger than 30 years
SELECT SH.`name`, SH.`manufacturer`
FROM `spaceships` AS SH
JOIN `journeys` AS J
ON SH.`id` = J.`spaceship_id`
JOIN `travel_cards` AS TC
ON TC.`journey_id` = J.`id`
JOIN `colonists` AS C
ON C.`id` = TC.`colonist_id` 
WHERE year(c.birth_date) > year(DATE_SUB('2019-01-01', INTERVAL 30 YEAR)) AND TC.`job_during_journey` = 'Pilot'
ORDER BY SH.`name`;

# 11. Extract all educational mission planets and spaceports
SELECT P.`name` AS `planet_name`, SP.`name` AS `spaceport_name`
FROM `planets` as P
JOIN `spaceports` AS SP
ON SP.`planet_id` = P.`id`
JOIN `journeys` AS J
ON SP.`id` = J.`destination_spaceport_id`
WHERE J.`purpose` = 'educational'
ORDER BY SP.`name` DESC;

# 12. Extract all planets and their journey count
SELECT P.`name` AS `planet_name`, COUNT(SP.`planet_id`) AS `journeys_count`
FROM `planets` AS P
JOIN `spaceports` AS SP
ON SP.`planet_id` = P.`id`
JOIN `journeys` AS J
ON J.`destination_spaceport_id` = SP.`id`
GROUP BY SP.`planet_id`
ORDER BY `journeys_count` DESC, P.`name`;

# 13.Extract the shortest journey
SELECT J.`id`, P.`name` AS `planet_name`, SP.`name` AS `spaceport_name`, J.`purpose` AS `journey_purpose`
FROM `journeys` AS J
JOIN `spaceports` AS SP
ON SP.`id` = J.`destination_spaceport_id`
JOIN `planets` AS P
ON P.`id` = SP.`planet_id`
ORDER BY (`journey_end` - `journey_start`) 
LIMIT 1;

# 14.Extract the less popular job
SELECT TC.`job_during_journey` AS `job_name`
FROM `travel_cards` AS TC
JOIN `journeys` AS J
ON J.`id` = TC.`journey_id`
ORDER BY (SELECT COUNT(TC.`job_during_journey`) FROM `travel_cards` AS TC GROUP BY  TC.`job_during_journey`LIMIT 1)
 DESC,
(J.`journey_end` - `journey_start`) DESC
LIMIT 1;

# Get colonists count
DELIMITER $$
CREATE FUNCTION `udf_count_colonists_by_destination_planet` (`planet_name` VARCHAR (30))
RETURNS INT
BEGIN
DECLARE `RESULT` INT;
SET `RESULT` := (SELECT COUNT(*)
FROM `planets` as p
JOIN `spaceports` AS SP
ON SP.`planet_id` = P.`id`
JOIN `journeys` AS J
ON J.`destination_spaceport_id` = SP.`id`
JOIN `travel_cards` AS TC
ON TC.`journey_id` = J.`id`
JOIN `colonists` AS C
ON C.`id` = TC.`colonist_id`
WHERE P.`name` = `planet_name`);
RETURN `RESULT`;
END $$

SELECT p.name, udf_count_colonists_by_destination_planet('Otroyphus') AS count
FROM planets AS p
WHERE p.name = 'Otroyphus';

# 16. Modify spaceship
DELIMITER $$
CREATE PROCEDURE `udp_modify_spaceship_light_speed_rate`(`spaceship_name` VARCHAR(50),
 `light_speed_rate_increse` INT)
 BEGIN
 IF(SELECT COUNT(*) FROM `spaceships` WHERE `name` = `spaceship_name`) > 0 THEN
 UPDATE `spaceships`  AS S
 SET S.`light_speed_rate` = S.`light_speed_rate` + `light_speed_rate_increse`
 WHERE `spaceship_name` = S.`name`;
 COMMIT;
 ELSE
 SIGNAL SQLSTATE '45000'
 SET MESSAGE_TEXT = 'Spaceship you are trying to modify does not exists.';
 ROLLBACK;
 END IF;
 END; $$
 
  CALL udp_modify_spaceship_light_speed_rate ('Na Pesho koraba', 1914);
SELECT name, light_speed_rate FROM spacheships WHERE name = 'Na Pesho koraba';

CALL udp_modify_spaceship_light_speed_rate ('USS Templar', 5);
SELECT name, light_speed_rate FROM spaceships WHERE name = 'USS Templar';































