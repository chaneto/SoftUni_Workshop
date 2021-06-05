CREATE DATABASE `Project Management DB`;

USE `Project Management DB`;

CREATE TABLE `dients`(
`id` INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
`dient_name` VARCHAR(100) 
);

CREATE TABLE `projects`(
`id` INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
`client_id` INT(11),
`project_lead_id` INT(11)
);

CREATE TABLE `employees`(
`id` INT(11) AUTO_INCREMENT PRIMARY KEY  NOT NULL,
`first_name` VARCHAR(30),
`last_name` VARCHAR(30),
`project_id` INT(11)
);

ALTER TABLE `projects`
ADD CONSTRAINT `FK_clientID_id`
FOREIGN KEY (`client_id`)
REFERENCES `clients`(`id`);

ALTER TABLE `employees`
ADD CONSTRAINT `FK_project_employees`
FOREIGN KEY (`project_id`)
REFERENCES `projects`(`id`);

ALTER TABLE `projects`
ADD CONSTRAINT `FK_project_lead_employees`
FOREIGN KEY (`project_lead_id`)
REFERENCES `employees`(`id`);