CREATE DATABASE `PROBLEM_4`;

USE `PROBLEM_4`;

CREATE TABLE `teachers`(
`teacher_id` INT PRIMARY KEY,
`name` VARCHAR(50),
`manager_id` INT,
CONSTRAINT `FK_teachers_teachers`
FOREIGN KEY (`manager_id`) 
REFERENCES `teachers`(`teacher_id`)
);

INSERT INTO `teachers`(`teacher_id`, `name`)
VALUES
(101, 'John'),
(102, 'Maya'),
(103, 'Silvia'),
(104, 'Ted'),
(105, 'Mark'),
(106, 'Greta');
UPDATE `teachers` SET `manager_id` = '106' WHERE (`teacher_id` = '102');
UPDATE `teachers` SET `manager_id` = '106' WHERE (`teacher_id` = '103');
UPDATE `teachers` SET `manager_id` = '105' WHERE (`teacher_id` = '104');
UPDATE `teachers` SET `manager_id` = '101' WHERE (`teacher_id` = '105');
UPDATE `teachers` SET `manager_id` = '101' WHERE (`teacher_id` = '106');