#6
CREATE TABLE `people`(
`id` INT(11) AUTO_INCREMENT PRIMARY KEY, 
`name` VARCHAR(200) NOT NULL,
`picture` BLOB(2048),
`height` FLOAT(3,2),
`weight` FLOAT(5,2),
`gender` CHAR(1) NOT NULL,
`birthdate` DATE NOT NULL,
`biography` TEXT
);

INSERT INTO `people`(`name`,`picture`,`height`,`weight`,`gender`, `birthdate`, `biography`)
VALUES
('Petkana', NULL, 1.55, 66.56, 'f', '1975-02-22', 'she is a good friend'),
('Gosho', NULL, 1.90, 106.56, 'm', '1985-07-30', 'he is a good friend'),
('Pencho', NULL, 1.80, 90.56, 'm', '1981-03-25', 'he is a good friend'),
('Vicho', NULL, 1.75, 95.56, 'm', '1982-02-22', 'he is a good friend'),
('Mocho', NULL, 1.96, 100.56, 'm', '1979-02-22', 'he is a good friend');

 #7
 CREATE TABLE `users`(
 `id` INT AUTO_INCREMENT PRIMARY KEY,
 `username` VARCHAR(30) UNIQUE NOT NULL,
 `password` VARCHAR(26) NOT NULL,
 `profile_picture` BLOB(900),
 `last_login_time` DATETIME,
 `is_deleted` BIT
 );
 
 INSERT INTO `users` ( `username`, `password`, `profile_picture`, `last_login_time`, `is_deleted`)
 VALUES
 ('Petko', '123', NULL, date(now()), 1),
 ('Metko', '345', NULL, date(now()), 0),
 ('Cetko', '678', NULL, date(now()), 1),
 ('Letko', '123', NULL, date(now()), 0),
 ('Yetko', '987', NULL, date(now()), 1);
 
 #8
 ALTER TABLE `users`
 MODIFY `id` INT;
 
 ALTER TABLE `users`
 DROP PRIMARY KEY;
 
 ALTER TABLE `users`
 ADD PRIMARY KEY (`id`, `username`);
 
 #9
 ALTER TABLE `users`
 MODIFY `last_login_time`  DATETIME DEFAULT CURRENT_TIMESTAMP;
 
 #10
ALTER TABLE `users` 
MODIFY `id` INT NOT NULL,
DROP PRIMARY KEY, 
ADD CONSTRAINT `pk_users` PRIMARY KEY(`id`), 
ADD CONSTRAINT `uq_username` UNIQUE (`username`);






