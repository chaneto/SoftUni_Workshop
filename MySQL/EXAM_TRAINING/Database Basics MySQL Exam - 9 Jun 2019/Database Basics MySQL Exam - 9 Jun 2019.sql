CREATE DATABASE `ruk_database`;
USE `ruk_database`;

CREATE TABLE `branches`(
`id` INT Primary Key AUTO_INCREMENT,
`name` VARCHAR(30) NOT NULL,
UNIQUE KEY `name_UNIQUE` (`name`)
);

CREATE TABLE `employees`(
`id` INT Primary Key AUTO_INCREMENT,
`first_name` VARCHAR(20) NOT NULL,
`last_name` VARCHAR(20) NOT NULL,
`salary` DECIMAL(10,2) NOT NULL,
`started_on` DATE NOT NULL,
`branch_id` INT NOT NULL,
CONSTRAINT 	`fk_employees_branches`
FOREIGN KEY `employees`(`branch_id`)
REFERENCES `branches`(`id`)
);

CREATE TABLE `clients`(
`id` INT Primary Key AUTO_INCREMENT,
`full_name` VARCHAR(50) NOT NULL,
`age` INT NOT NULL
);

CREATE TABLE `employees_clients`(
`employee_id` INT, 
`client_id` INT ,
CONSTRAINT `fk_employees_clients_clients`
FOREIGN KEY `employees_clients`(`client_id`)
REFERENCES `clients`(`id`),
CONSTRAINT `fk_employees_clients_employees`
FOREIGN KEY `employees_clients`(`employee_id`)
REFERENCES `employees`(`id`)
);

CREATE TABLE `bank_accounts`(
`id` INT Primary Key AUTO_INCREMENT,
`account_number` VARCHAR(10) NOT NULL,
`balance` DECIMAL(10,2) NOT NULL,
`client_id` INT NOT NULL,
UNIQUE KEY `client_id_UNIQUE` (`client_id`),
CONSTRAINT `fk_bank_accounts_clients`
FOREIGN KEY `bank_accounts`(`client_id`)
REFERENCES `clients`(`id`)
);

CREATE TABLE `cards`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`card_number` VARCHAR(19) NOT NULL,
`card_status` VARCHAR(7) NOT NULL,
`bank_account_id` INT NOT NULL,
CONSTRAINT `fk_cards_bank_accounts`
FOREIGN KEY `cards`(`bank_account_id`)
REFERENCES `bank_accounts`(`id`)
);

#2 Data Manipulation Language 
INSERT INTO `cards` (`card_number`, `card_status`, `bank_account_id`)
SELECT 
REVERSE(`full_name`) AS `card_number`,
'Active' AS `card_status`,
`id` AS `bank_account_id`
FROM `clients`
WHERE `id` BETWEEN 191 and 200;

#3 ⦁	Update
UPDATE employees_clients as ec
JOIN
(SELECT ec1.employee_id, COUNT(ec1.client_id) AS 'count'
		FROM employees_clients as ec1 
		GROUP BY ec1.employee_id
		ORDER BY `count`, ec1.employee_id) AS s
SET ec.employee_id = s.employee_id
WHERE ec.employee_id = ec.client_id;

# 4 ⦁	Delete
DELETE FROM `employees`
WHERE `id` NOT IN(SELECT `employee_id` FROM `employees_clients`);

# 5 ⦁	Clients
SELECT `id`, `full_name`
FROM `clients`
ORDER BY `id`;

# 6 ⦁	Newbies
SELECT `id`, CONCAT(`first_name`, ' ', `last_name`) AS `full_name`, CONCAT('$', `salary`) AS `salary`, `started_on`
FROM `employees`
WHERE `salary` >= 100000 AND YEAR(`started_on`) >= 2018 AND DATE(`started_on`) >= 1 AND DAY(`started_on`) >= 1
ORDER BY `salary` DESC, `id` DESC;

# 7 ⦁	Cards against Humanity
SELECT C.`id`, CONCAT( C.`card_number`, ' : ', CL.`full_name`) AS `card_token`
FROM `cards` AS C
JOIN `bank_accounts` as BK
ON C.`bank_account_id` = BK.`id`
JOIN `clients` AS  CL
ON CL.`id` = BK.`client_id`
ORDER BY C.`id` DESC;

# 8 ⦁	Top 5 Employees
SELECT CONCAT(E.`first_name`, ' ', E.`last_name`) AS `name`, `started_on`, COUNT(EC.`employee_id`) AS `count_of_clients`
FROM `employees` AS E
JOIN `employees_clients` AS EC
ON E.`id` = EC.`employee_id`
GROUP BY EC.`employee_id`
ORDER BY `count_of_clients` DESC, E.`id`
limit 5;

# 9 ⦁	Branch cards
SELECT BRANCH.`name`, COUNT(CARDS.`id`) AS `count_of_cards`
FROM `branches` AS BRANCH
LEFT JOIN `employees` AS E
ON E.`branch_id` = BRANCH.`id`
LEFT JOIN `employees_clients` AS EC
ON EC.`employee_id` = E.`id`
LEFT JOIN `clients` AS CLIEN
ON CLIEN.`id` = EC.`client_id`
LEFT JOIN `bank_accounts` AS BANK
ON BANK.`client_id` = CLIEN.`id`
LEFT JOIN `cards` AS CARDS
ON CARDS.`bank_account_id` = BANK.`id`
GROUP BY BRANCH.`name`
ORDER BY `count_of_cards` DESC, BRANCH.`name`;

#10 
DELIMITER $$
CREATE FUNCTION `udf_client_cards_count`(`name` VARCHAR(30))
RETURNS INT
BEGIN
RETURN (SELECT COUNT(CARD.`id`) AS `cards`
FROM `clients` AS CLIEN
JOIN `bank_accounts` AS BANK
ON BANK.`client_id` = CLIEN.`id`
JOIN `cards` AS CARD
ON CARD.`bank_account_id` = BANK.`id`
WHERE CLIEN.`full_name` = `name`);
END; $$

SELECT c.full_name, udf_client_cards_count('Baxy David') as `cards` FROM clients c
WHERE c.full_name = 'Baxy David';

# 11 ⦁	Extract Client Info
DELIMITER $$
CREATE PROCEDURE `udp_clientinfo`(`full_name` VARCHAR(50))
BEGIN
SELECT CLIEN.`full_name`, `age`, BANK.`account_number`, CONCAT('$',BANK.`balance`) AS `balance`
FROM `clients` AS CLIEN
JOIN `bank_accounts` AS BANK
ON BANK.`client_id` = CLIEN.`id`
WHERE CLIEN.`full_name` = `full_name`;
END $$

CALL `udp_clientinfo`('Hunter Wesgate');

