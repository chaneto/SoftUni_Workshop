CREATE DATABASE `minions`;
USE `minions`;
#1
CREATE TABLE `minions` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(45) NOT NULL,
    `age` INT
);

CREATE TABLE `towns`(
   `town_id` INT AUTO_INCREMENT PRIMARY KEY,
   `name` VARCHAR(45) NOT NULL
);

 ALTER TABLE `towns` 
CHANGE COLUMN `town_id`
 `id` INT NOT NULL AUTO_INCREMENT ;
 
 #2
ALTER TABLE `minions`
ADD COLUMN `town_id` INT,
ADD CONSTRAINT fk_minions_towns
FOREIGN KEY (`town_id`)
REFERENCES `towns` (`id`);

#3
INSERT INTO `towns`(`id`, `name`)
VALUES 
 (1, 'Sofia'),
 (2, 'Plovdiv'),
 (3, 'Varna');
INSERT INTO `minions` (`id`, `name`, `age`, `town_id`)
VALUES
(1, 'Kevin', 22, 1),
(2, 'Bob', 15, 3),
(3, 'Steward', NULL, 2);

#4
TRUNCATE `minions`;

#5
DROP TABLE `minions`;
DROP TABLE `towns`;

 
 