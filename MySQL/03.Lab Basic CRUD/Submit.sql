CREATE DATABASE IF NOT EXISTS `hospital`; 
USE `hospital`;

CREATE TABLE departments (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50)
);

INSERT INTO departments(name) VALUES('Therapy'), ('Support'), ('Management'), ('Other');

CREATE TABLE employees (
	id INT PRIMARY KEY AUTO_INCREMENT,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	job_title VARCHAR(50) NOT NULL,
	department_id INT NOT NULL,
	salary DOUBLE NOT NULL,
	CONSTRAINT `fk_department_id` FOREIGN KEY (`department_id`) REFERENCES `departments` (`id`)
);

INSERT INTO `employees` (`first_name`,`last_name`, `job_title`,`department_id`,`salary`) VALUES
	('John', 'Smith', 'Therapist',1, 900.00),
	('John', 'Johnson', 'Acupuncturist',1, 880.00),
	('Smith', 'Johnson', 'Technician',2, 1100.00),
	('Peter', 'Petrov', 'Supervisor',3, 1100.00),
	('Peter', 'Ivanov', 'Dentist',4, 1500.23),
	('Ivan' ,'Petrov', 'Therapist',1, 990.00),
	('Jack', 'Jackson', 'Epidemiologist',4, 1800.00),
	('Pedro', 'Petrov', 'Medical Director',3, 2100.00),
	('Nikolay', 'Ivanov', 'Nutrition Technician',4, 1600.00);
	

	
CREATE TABLE rooms (
	id INT PRIMARY KEY AUTO_INCREMENT,
	occupation VARCHAR(30)
);

INSERT INTO rooms(`occupation`) VALUES('free'), ('occupied'),('free'),('free'),('occupied');

CREATE TABLE patients (
	id INT PRIMARY KEY AUTO_INCREMENT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	room_id INT NOT NULL
);

INSERT INTO patients(`first_name`,`last_name`,`room_id`) VALUES('Pesho','Petrov',1),('Gosho','Georgiev',3)
,('Mariya','Marieva', 2), ('Katya','Katerinova', 2), ('Nikolay','Nikolaev',3);

SELECT id, first_name, last_name, job_title 
FROM employees
ORDER BY id;

SELECT id,concat(first_name, ' ', last_name) AS full_name, job_title, salary
FROM employees
WHERE salary > 1000;

UPDATE `employees`
SET `salary` = `salary` * 1.1
WHERE `job_title` = 'Therapist';
#UPDATE `employees`
#SET `salary` = `salary` + 100
#WHERE `job_title` = 'Manager';
SELECT `salary` FROM `employees` ORDER BY `salary` ASC;

SELECT *
FROM `employees`
ORDER BY `salary` DESC
LIMIT 1;

SELECT *
FROM `employees`
WHERE `salary` >= 1600 AND `department_id` = 4
ORDER BY `id` ASC;

DELETE FROM `employees`
WHERE `department_id` = 1 OR `department_id` = 2;
SELECT *
FROM `employees`
ORDER BY `id` ASC;

CREATE VIEW `v_top_paid_employee`
AS
SELECT * FROM `employees` ORDER BY `salary`;
SELECT * FROM `v_top_paid_employee`;

CREATE VIEW `TOP_DEPARTMENT_ID`
AS
SELECT CONCAT(`first_name`, ' ' ,`last_name`) `full_name`, `job_title`, `department_id`, `salary`
FROM `employees`
WHERE `salary` > 1501
ORDER BY `department_id` ASC;
SELECT * FROM `TOP_DEPARTMENT_ID`;










