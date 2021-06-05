
CREATE DATABASE `Movies`;

USE `Movies`;
#11
CREATE TABLE `directors`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`director_name` VARCHAR(50) NOT NULL,
`notes` TEXT
);

INSERT INTO `directors`(`id`, `director_name`, `notes`)
VALUES
(1, 'Petko Stamov', 'Director'),
(2, 'Ivcho Karadimov', 'Director'),
(3, 'Pencho Penchev', 'Director'),
(4, 'Gosho Todorov', 'Director'),
(5, 'Milko Milkov', 'Director');

CREATE TABLE `genres`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`genre_name` VARCHAR(50) NOT NULL,
`notes` TEXT
);

INSERT INTO `genres`(`id`, `genre_name`, `notes`)
VALUES
(1, 'Petko Stamov', 'Director'),
(2, 'Ivcho Karadimov', 'Director'),
(3, 'Pencho Penchev', 'Director'),
(4, 'Gosho Todorov', 'Director'),
(5, 'Milko Milkov', 'Director');


CREATE TABLE `categories`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`category_name` VARCHAR(50) NOT NULL,
`notes` TEXT
);

INSERT INTO `categories`(`id`, `category_name`, `notes`)
VALUES
(1, 'Petko Stamov', 'Director'),
(2, 'Ivcho Karadimov', 'Director'),
(3, 'Pencho Penchev', 'Director'),
(4, 'Gosho Todorov', 'Director'),
(5, 'Milko Milkov', 'Director');

CREATE TABLE `movies`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`title` VARCHAR(30) NOT NULL,
`director_id` INT NOT NULL,
`copyright_year` YEAR NOT NULL,
`length` INT,
`genre_id` INT NOT NULL,
`category_id` INT NOT NULL,
`rating` INT,
`notes` TEXT
);

INSERT INTO `movies`(`id`, `title`, `director_id`, `copyright_year`, `length`
, `genre_id`, `category_id`, `rating`, `notes`)
VALUES
(1, 'Godzila', 2, 1980, 120, 3, 1, 5, 'NICE'),
(2, 'Terminator', 5, 1990, 129, 4, 1, 5, 'NICE'),
(3, 'Fake', 4, 1985, 122, 5, 1, 5, 'NICE'),
(4, 'Grand', 3, 1998, 124, 1, 1, 5, 'NICE'),
(5, 'Stolz', 1, 1936, 122, 2, 1, 5, 'NICE');


