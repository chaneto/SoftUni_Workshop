CREATE DATABASE `PROBLEM_5`;

USE `PROBLEM_5`;

CREATE TABLE `item_types`(
`item_type_id` INT PRIMARY  KEY,
`name` VARCHAR(50)
);

CREATE TABLE `items`(
`item_id` INT PRIMARY KEY,
`name` VARCHAR(50),
`item_type_id` INT,
CONSTRAINT `FK_items_itemsTypes`
FOREIGN KEY `items`(`item_type_id`)
REFERENCES `item_types`(`item_type_id`)
);


CREATE TABLE `cities`(
`city_id` INT PRIMARY KEY,
`name` VARCHAR(50)
);

CREATE TABLE `customers`(
`customer_id` INT PRIMARY KEY,
`name` VARCHAR(50),
`birthday` DATE,
`city_id` INT,
CONSTRAINT `FK_customers_cities`
FOREIGN KEY `customers`(`city_id`)
REFERENCES `cities`(`city_id`)
);

CREATE TABLE `orders`(
`order_id` INT PRIMARY KEY,
`customer_id` INT,
CONSTRAINT `FK_orders_customers`
FOREIGN KEY `orders`(`customer_id`)
REFERENCES `customers`(`customer_id`)
);

CREATE TABLE `order_items`(
`item_id` INT,
`order_id` INT,
PRIMARY KEY (`item_id`, `order_id`),
CONSTRAINT `FK_orderItem_items`
FOREIGN KEY `order_items`(`item_id`)
REFERENCES `items`(`item_id`),
CONSTRAINT `FK_orderItem_orders`
FOREIGN KEY `order_items`(`order_id`)
REFERENCES `orders`(`order_id`)
);











