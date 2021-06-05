CREATE DATABASE `soft_uni`;

USE `soft_uni`;

#13
CREATE TABLE `towns`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(30) NOT NULL
);

INSERT INTO `towns`(`id`, `name`)
VALUES
(1, 'Sofia'),
(2, 'Plovdiv'),
(3, 'Varna'),
(4, 'Burgas');

CREATE TABLE `addresses`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`address_text` VARCHAR(50),
`town_id` INT,
CONSTRAINT `FK_addresses_towns`
FOREIGN KEY (`town_id`)
REFERENCES `towns`(`id`)
);

INSERT INTO `addresses`(`id`, `address_text`, `town_id`)
VALUES
(1, 'HRISTO BOTEV 8', 4),
(2, 'MUSALA 5', 2),
(3, 'SAN STEFAN0 3', 1),
(4, 'KAPITAN PETKO 11', 3),
(5, 'RLA 10', 3);

CREATE TABLE `departments`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`name` varchar(20) NOT NULL
);

INSERT INTO `departments`(`id`, `name`)
VALUES
(1, 'Engineering'),
(2, 'Sales'),
(3, 'Marketing'),
(4, 'Software Development'),
(5, 'Quality Assurance');

CREATE TABLE `employees` (
`id` INT AUTO_INCREMENT PRIMARY KEY,
`first_name` VARCHAR(30) NOT NULL,
`middle_name` VARCHAR(30) NOT NULL,
`last_name` VARCHAR(30) NOT NULL,
`job_title` VARCHAR(50) NOT NULL,
`department_id` INT,
CONSTRAINT `FK_employees_departments`
FOREIGN KEY (`department_id`)
REFERENCES `departments`(`id`),
`hire_date` DATE NOT NULL,
`salary` DECIMAL(9.2) NOT NULL,
`address_id` INT,
CONSTRAINT `FK_employees_addresses`
FOREIGN KEY (`address_id`)
REFERENCES `addresses`(`id`)
);

INSERT INTO `employees`(`id`, `first_name`, `middle_name`, `last_name`, 
`job_title`, `department_id`, `hire_date`, `salary`, `address_id`)
VALUES
(1, 'Ivan', 'Ivanov', 'Ivanov', '.NET Developer', 4, '2013-02-01', 3500.00, 5),
(2, 'Petar', 'Petrov', 'Petrov', 'Senior Engineer', 1, '2004-03-02', 4000.00, 2),
(3, 'Maria', 'Petrova',  'Ivanova', 'Intern', 5, '2016-08-28', 525.25, 1),
(4, 'Georgi', 'Terziev', 'Ivanov', 'CEO', 2, '2007-12-09', 3000.00, 3),
(5, 'Peter', 'Pan', 'Pan', 'Intern', 3, '2016-08-28', 599.88, 4);

#14
SELECT * FROM `towns`;
SELECT * FROM `departments`;
SELECT * FROM `employees`;

#15
SELECT * FROM `towns` ORDER BY `name`;
SELECT * FROM `departments` ORDER BY `name`;
SELECT * FROM `employees` ORDER BY `salary` DESC;
 
 #16
SELECT `name` from  `towns` ORDER BY `name`;
SELECT `name` from  `departments` ORDER BY `name`;
SELECT `first_name`, `last_name`, `job_title`, `salary` from  `employees` ORDER BY `salary` DESC;

#17
UPDATE `employees`
SET `salary` = `salary` + ( `salary` * 0.10);
SELECT `salary` FROM `employees`;

#18
TRUNCATE `occupancies`;










