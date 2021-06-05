CREATE DATABASE `PROBLEM_3`;

USE `PROBLEM_3`;

CREATE TABLE `students`(
`student_id` INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
`name` VARCHAR(50)
);
INSERT INTO `students`(`name`)
VALUES
('Mila'),
('Toni'),
('Ron');

CREATE TABLE `exams`(
`exam_id` INT PRIMARY KEY NOT NULL,
`name` VARCHAR(50)
);
INSERT INTO `exams`
VALUES
(101, 'Spring MVC'),
(102, 'Neo4j'),
(103, 'Oracle 11g');

CREATE TABLE `students_exams`(
`student_id` INT NOT NULL,
`exam_id` INT NOT NULL,
PRIMARY KEY (`student_id`, `exam_id`),
CONSTRAINT `FK_studentsExams_exams`
FOREIGN KEY `students_exams`(`exam_id`)
REFERENCES `exams`(`exam_id`),
CONSTRAINT `FK_studentsExams_students`
FOREIGN KEY `students_exams`(`student_id`)
REFERENCES `students`(`student_id`)
);

INSERT INTO `students_exams`
VALUES
(1, 101),
(1, 102),
(2, 101),
(3, 103),
(2, 102),
(2, 103);