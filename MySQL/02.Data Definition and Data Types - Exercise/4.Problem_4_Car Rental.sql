CREATE DATABASE `car_rental`;

USE `car_rental`;
#12
CREATE TABLE `categories`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`category` VARCHAR(50) NOT  NULL,
`daily_rate` DECIMAL(5.2),
`weekly_rate` DECIMAL(5.2),
`monthly_rate` DECIMAL(5.2),
`weekend_rate` DECIMAL(5.2)
);

INSERT INTO `categories`(`id`, `category`, `daily_rate`, `weekly_rate`, `monthly_rate`, `weekend_rate`)
VALUES
(1, 'ACTION', 5.2, 9.8, 6.5, 1.3),
(2, 'DRAMA', 6.2, 9.9, 6.5, 3.9),
(3, 'SAPUN', 5.8, 4.8, 6.5, 9.3);

CREATE TABLE `cars`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`plate_number` VARCHAR(30) NOT NULL,
`make` VARCHAR(20) NOT NULL,
`model` VARCHAR(20) NOT NULL,
`car_year` DATE NOT NULL,
`category_id` INT NOT NULL,
`doors` INT NOT NULL,
`picture` BLOB,
`car_condition` VARCHAR(20) NOT NULL,
`available` BIT
);
 INSERT INTO `cars`(`id`, `plate_number`, `make`, `model`
 , `car_year`, `category_id`, `doors`, `picture`, `car_condition`, `available`)
 VALUES
 (1, 'CT0624CZ', 'GERMANY', 'OPEL', '1999-03-03', 2, 5, NULL, 'NEW', 1),
 (2, 'CT2698CZ', 'GERMANY', 'BMV', '1986-03-09', 2, 5, NULL, 'NEW', 0),
 (3, 'CT9809CZ', 'GERMANY', 'AUDI', '1989-12-04', 2, 5, NULL, 'NEW', 1);


CREATE TABLE `employees`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`first_name` VARCHAR(30) NOT NULL,
`last_name` VARCHAR(30) NOT NULL,
`title` VARCHAR(30) NOT NULL,
`notes` TEXT
);
INSERT INTO `employees`(`id`, `first_name`, `last_name`, `title`, `notes`)
VALUES
(1, 'Petko', 'Doichev', 'worker', 'Good'),
(2, 'Pencho', 'Goshev', 'director', 'Good'),
(3, 'Gosho', 'Stoichev', 'hamalin', 'Good');

CREATE TABLE `customers`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`driver_licence_number` VARCHAR(30) NOT NULL,
`full_name, address` VARCHAR(50) NOT NULL,
`city` VARCHAR(30) NOT NULL,
`zip_code` INT NOT NULL,
`notes` TEXT
);
INSERT INTO `customers`(`id`, `driver_licence_number`, `full_name, address`, `city`, `zip_code`, `notes`)
VALUES
(1, 08975632, 'Stara Zagora ul.stoletov 9', 'Stara Zagora', 6000, 'very good'),
(2, 08635453, 'Stara Zagora ul.stoletov 9', 'Stara Zagora', 6000, 'very good'),
(3, 94675865, 'Stara Zagora ul.stoletov 9', 'Stara Zagora', 6000, 'very good');


CREATE TABLE `rental_orders`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`employee_id` INT NOT NULL,
`customer_id` INT NOT NULL,
`car_id` INT NOT NULL,
`car_condition` VARCHAR(30) NOT NULL,
`tank_level` DECIMAL(20,2) NOT NULL,
`kilometrage_start` INT,
`kilometrage_end` INT NOT NULL,
`total_kilometrage` INT,
`start_date` DATE NOT NULL,
`end_date` DATE NOT NULL,
`total_days` INT NOT NULL,
`rate_applied` VARCHAR(50),
`tax_rate` INT,
`order_status` VARCHAR(30) NOT NULL,
`notes` TEXT
);

INSERT INTO `rental_orders`(`id`, `employee_id`, `customer_id`, `car_id`, `car_condition`
, `tank_level`, `kilometrage_start`, `kilometrage_end`, `total_kilometrage`, `start_date`,
 `end_date`, `total_days`, `rate_applied`, `tax_rate`, `order_status`, `notes`)
 VALUES
 (1, 2, 3, 1, 'NEW', 38.2, 238, 9000, 9238, '1980-03-03', '1980-03-05', '5', 20, '56', 'GOOD', 'SHAME'),
 (2, 1, 2, 3, 'NEW', 59.5, 238, 9000, 9238, '1980-03-03', '1980-03-05', '5', 20, '56', 'GOOD', 'SHAME'),
 (3, 3, 3, 2, 'NEW', 25.6, 238, 9000, 9238, '1980-03-03', '1980-03-05', '5', 20, '56', 'GOOD', 'SHAME');








