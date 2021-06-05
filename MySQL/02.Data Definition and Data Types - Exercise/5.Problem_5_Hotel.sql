CREATE DATABASE `hotel`;

USE `hotel`;

CREATE TABLE `employees`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`first_name` VARCHAR(50) NOT NULL,
`last_name` VARCHAR(50) NOT NULL,
`title` VARCHAR(30) NOT NULL,
`notes` TEXT
);

INSERT INTO `employees`(`id`, `first_name`, `last_name`, `title`, `notes`)
VALUES
(1, 'Petko', 'Petkov', 'hamalin', 'good worker'),
(2, 'Metko', 'Metkov', 'hamalin', 'good worker'),
(3, 'Cetko', 'Cetkov', 'hamalin', 'good worker');

CREATE TABLE `customers`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`account_number` INT,
`first_name` VARCHAR(30) NOT NULL,
`last_name` VARCHAR(30) NOT NULL,
`phone_number` INT,
`emergency_name` VARCHAR(30),
`emergency_number` INT,
`notes` TEXT
);
 
INSERT INTO `customers`(`id`, `account_number`, `first_name`,
 `last_name`, `phone_number`, `emergency_name`, `emergency_number`, `notes`)
 VALUES
 (1, 69, 'Petko', 'Petkov', 089, 'Gosho', 112, 'good'),
 (2, 69, 'Petko', 'Petkov', 089, 'Gosho', 112, 'good'),
 (3, 69, 'Petko', 'Petkov', 089, 'Gosho', 112, 'good');

CREATE TABLE `room_status`(
`room_status` BIT,
`notes` TEXT
);

INSERT INTO `room_status`(`room_status`,`notes`)
VALUES
(1, 'GOOD'),
(0, 'GOOD'),
(1, 'GOOD');

CREATE TABLE `room_types`(
`room_type` VARCHAR(20) NOT NULL,
`notes` TEXT
);

INSERT INTO `room_types`(`room_type`, `notes`)
VALUES
('MEZONET', 'SUPER'),
('MANSARDA', 'SUPER'),
('FLAT', 'SUPER');

CREATE TABLE `bed_types`(
`bed_type` VARCHAR(20) NOT NULL,
`notes` TEXT
);

INSERT INTO `bed_types`(`bed_type`, `notes`)
VALUES
('SPALNQ', 'PERFECT'),
('MATRAK', 'PERFECT'),
('SOLO', 'PERFECT');

CREATE TABLE `rooms`(
`room_number` INT UNIQUE,
`room_type` VARCHAR(20),
`bed_type` VARCHAR(20),
`rate` VARCHAR(20),
`room_status` VARCHAR(50),
`notes` TEXT
);

INSERT INTO `rooms`(`room_number`, `room_type`, `bed_type`, `rate`, `room_status`, `notes`)
VALUES
(1, 'MANSARDA', 'SPALNQ', 'SUPER', 'PERFECT', 'GOOD'),
(2, 'MANSARDA', 'SPALNQ', 'SUPER', 'PERFECT', 'GOOD'),
(3, 'MANSARDA', 'SPALNQ', 'SUPER', 'PERFECT', 'GOOD');

CREATE TABLE `payments`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`employee_id` INT,
`payment_date` DATE,
`account_number` INT,
`first_date_occupied` DATE,
`last_date_occupied` DATE,
`total_days` INT,
`amount_charged` FLOAT(2),
`tax_rate` FLOAT(2),
`tax_amount` FLOAT(2),
`payment_total` float(2),
`notes` TEXT
);

INSERT INTO `payments`(`id`, `employee_id`, `payment_date`, `account_number`, `first_date_occupied`, 
`last_date_occupied`, `total_days`, `amount_charged`, `tax_rate`, `tax_amount`, `payment_total`, `notes`)
VALUES
(1, 2, '1980-03-03', 5, '1980-03-05', '1980-12-03', 10, 5, 999.99, 333.33, 666.66, 'GOOD'),
(2, 2, '1980-03-03', 5, '1980-03-05', '1980-12-03', 10, 5, 999.99, 333.33, 666.66, 'GOOD'),
(3, 2, '1980-03-03', 5, '1980-03-05', '1980-12-03', 10, 5, 999.99, 333.33, 666.66, 'GOOD');

CREATE TABLE `occupancies`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`employee_id` INT,
`date_occupied` DATE,
`account_number` INT,
`room_number` INT,
`rate_applied` VARCHAR(30),
`phone_charge` BIT,
`notes` TEXT
);
INSERT INTO `occupancies`(`id`, `employee_id`, `date_occupied`, `account_number`, `room_number`,
`rate_applied`, `phone_charge`, `notes`)
VALUES
(1, 2, '1980-03-30', 987654321, 5, 'SUPER', 0, 'PERFECT'),
(2, 2, '1980-03-30', 987654321, 5, 'SUPER', 0, 'PERFECT'),
(3, 2, '1980-03-30', 987654321, 5, 'SUPER', 0, 'PERFECT');

UPDATE `payments` SET `tax_rate` = `tax_rate` - `tax_rate` * 0.03;
SELECT `tax_rate` FROM `payments`;

delete from `occupancies`;






