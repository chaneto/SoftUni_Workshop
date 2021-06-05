CREATE DATABASE `PROBLEM_6`;

USE `PROBLEM_6`;

CREATE TABLE `subjects`(
`subject_id` INT PRIMARY KEY,
`subject_name` VARCHAR(50)
);

CREATE TABLE `majors`(
`major_id` INT PRIMARY KEY,
`name` VARCHAR(50)
);
 CREATE TABLE `students`(
 `student_id` INT PRIMARY KEY,
 `student_number` VARCHAR(12),
 `student_name` VARCHAR(50),
 `major_id` INT,
 CONSTRAINT `FK_students_majors`
 FOREIGN KEY `students`(`major_id`)
 REFERENCES  `majors`(`major_id`)
 );
 
 CREATE TABLE `payments`(
 `payment_id` INT PRIMARY KEY,
 `payment_date` DATE,
 `payment_amount` DECIMAL(8,2),
 `student_id` INT,
 CONSTRAINT `FK_payments_students`
 FOREIGN KEY `payments`(`student_id`)
 REFERENCES `students`(`student_id`)
 );
 
 CREATE TABLE `agenda`(
 `student_id` INT,
 `subject_id` INT,
 PRIMARY KEY (`student_id`, `subject_id`),
 CONSTRAINT `FK_agenda_students`
 FOREIGN KEY `agenda`(`student_id`)
 REFERENCES  `students`(`student_id`),
  CONSTRAINT `FK_agenda_subjects`
 FOREIGN KEY `agenda`(`subject_id`)
 REFERENCES  `subjects`(`subject_id`)
 );
 
 
 
 
 