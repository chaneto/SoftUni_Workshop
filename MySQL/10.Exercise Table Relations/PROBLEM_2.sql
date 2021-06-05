CREATE DATABASE `PROBLEM_2`;

USE `PROBLEM_2`;

CREATE TABLE `manufacturers`(
`manufacturer_id` INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
`name` VARCHAR(50),
`established_on` DATE
);
INSERT INTO `manufacturers`
VALUES
(1, 'BMW', '1916-03-01'),
(2, 'Tesla', '2003-01-01'),
(3, 'Lada', '1966-05-01');

CREATE TABLE `models`(
`model_id` INT PRIMARY KEY UNIQUE NOT NULL,
`name` VARCHAR(50),
`manufacturer_id` INT NOT NULL,
CONSTRAINT `FK_models_manufacturers`
FOREIGN KEY `models` (`manufacturer_id`)
REFERENCES `manufacturers`(`manufacturer_id`)
);
INSERT INTO `models`
VALUES
(101, 'X1', 1),
(102, 'i6', 1),
(103, 'Model S', 2),
(104, 'Model X', 2),
(105, 'Model 3', 2),
(106, 'Nova', 3);