CREATE DATABASE `colonial_blog_db`;

USE `colonial_blog_db`;

CREATE TABLE `users`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`username` VARCHAR(30) NOT NULL UNIQUE,
`password` VARCHAR(30) NOT NULL,
`email` VARCHAR(50) NOT NULL
);

CREATE TABLE `categories`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`category` VARCHAR(30) NOT NULL
);

CREATE TABLE `articles`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`title` VARCHAR(50) NOT NULL,
`content` TEXT NOT NULL,
`category_id` INT,
CONSTRAINT `fk_articles_categories`
FOREIGN KEY `articles`(`category_id`)
REFERENCES `categories`(`id`)
);

CREATE TABLE `users_articles`(
`user_id` INT,
CONSTRAINT `fk_users_articles_users`
FOREIGN KEY `users_articles`(`user_id`)
REFERENCES `users`(`id`),
`article_id` INT,
CONSTRAINT `fk_users_articles_articles`
FOREIGN KEY `users_articles`(`article_id`)
REFERENCES `articles`(`id`)
);
 CREATE TABLE `comments`(
 `id` INT PRIMARY KEY AUTO_INCREMENT,
 `comment` VARCHAR(255) NOT NULL,
 `article_id` INT NOT NULL,
 CONSTRAINT `fk_comments_articles`
 FOREIGN KEY `comments`(`article_id`)
 REFERENCES `articles`(`id`),
 `user_id` INT NOT NULL,
 CONSTRAINT `fk_comments_users`
 FOREIGN KEY `comments`(`user_id`)
 REFERENCES `users`(`id`)
 );
 
 CREATE TABLE `likes`(
 `id` INT PRIMARY KEY AUTO_INCREMENT,
 `article_id` INT,
 CONSTRAINT `fk_likes_articles`
 FOREIGN KEY `likes`(`article_id`)
 REFERENCES  `articles`(`id`),
 `comment_id` INT,
 CONSTRAINT `fk_likes_comments`
 FOREIGN KEY `likes`(`comment_id`)
 REFERENCES `comments`(`id`),
 `user_id` INT NOT NULL,
 CONSTRAINT `fk_likes_users`
 FOREIGN KEY `likes`(`user_id`)
 REFERENCES `users`(`id`)
 );

#2 ⦁	Data Insertion
INSERT INTO `likes` (`article_id`, `comment_id`, `user_id`)
SELECT 
(SELECT CHAR_LENGTH(U.`username`) WHERE `id`%2 = 0) AS `article_id`,
(SELECT CHAR_LENGTH(U.`email`) WHERE `id`%2 <> 0) AS `comment_id`,
U.`id` AS `user_id`
FROM `users` AS U
WHERE U.`id` BETWEEN 16 AND 20;

#3 ⦁	Data Update
UPDATE `comments`
SET `comment` = 
CASE 
WHEN `id`%2 = 0 THEN 'Very good article.'
WHEN `id`%3 = 0 THEN 'This is interesting.'
WHEN `id`%5 = 0 THEN 'I definitely will read the article again.'
WHEN `id`%7 = 0 THEN 'The universe is such an amazing thing.'
ELSE `comment`
END
WHERE `id`  BETWEEN 1 AND 15;

#4 DELETE
DELETE FROM `articles`
WHERE `category_id` IS NULL;

#5 ⦁	Extract 3 biggest articles
SELECT A.`title`, CONCAT(SUBSTRING(A.`content`,1,20), '...') AS `summary`
FROM `articles` AS A
ORDER BY CHAR_LENGTH(`content`) DESC, `id`
LIMIT 3;

#7 ⦁	Extract categories
SELECT C.`category`, COUNT(A.`category_id`) AS `articles`, COUNT(L.`id`) AS `likes`
FROM `categories` AS C
JOIN `articles` AS A
ON C.`id` = A.`category_id`
JOIN `likes` AS L
ON A.`id` = L.`article_id`
GROUP BY A.`category_ID`
ORDER BY `likes` DESC, `articles` DESC, C.`id`;

#8 ⦁	Extract the most commented Social article
SELECT A.`title`, COUNT(COM.`id`) AS `comments`
FROM `articles` AS A
JOIN `categories` AS C
ON C.`id` = A.`category_id`
JOIN `comments` AS COM
ON COM.`article_id` = A.`id`
WHERE C.`category` = 'social'
GROUP BY A.`title`
ORDER BY `comments` DESC
LIMIT 1;

#9 ⦁	Extract the less liked comments
SELECT c.`id`, CONCAT(SUBSTRING(C.`comment`, 1, 20), '...') AS `summary`
FROM `comments` AS C
JOIN `likes` as L
ON C.`id` <> L.`comment_id`
WHERE C.`id` not IN (SELECT `comment_id` FROM `likes` group by  `comment_id`)
GROUP BY C.`comment`
ORDER BY C.`id` DESC;

# 10 ⦁	Get user’s articles count
DELIMITER $$
CREATE FUNCTION `udf_users_articles_count`(`username` VARCHAR(30))
RETURNS INT
BEGIN
RETURN (SELECT COUNT(UA.`user_id`)
FROM `users` AS U
JOIN `users_articles` as UA
ON UA.`user_id` = U.`id`
WHERE U.`username` = `username`);
END; $$
























