create database athena_file;

use athena_file;

create table User (id int auto_increment primary key, username varchar(50), password varchar(20), created_at date , updated_at date);
create table Profile (id int auto_increment primary key, fullname varchar(50), date_of_birth date, avatar_url varchar(50), email varchar(50), user_id int, created_at date , updated_at date, FOREIGN KEY (user_id) REFERENCES User(id));


select *from User;