CREATE DATABASE raagab1002;
USE raagab502;
SHOW DATABASES;
DROP DATABASE raagab502;

CREATE TABLE cus_tbl(cus_id INT NOT NULL AUTO_INCREMENT, cus_fname VARCHAR(30) NOT  NULL, cus_lname VARCHAR(20) NOT NULL, PRIMARY KEY(cus_id));
SHOW TABLES;
DESC cus_tbl;
INSERT INTO cus_tbl VALUES (NULL,'kolte patil raaga','kaustubh','bhat');
SELECT * FROM cus_tbl;

ALTER TABLE cus_tbl
ADD address TEXT(100)
AFTER cus_id;

ALTER TABLE cus_tbl
DROP COLUMN maths;

ALTER TABLE cus_tbl
ADD salary DOUBLE(6,2);

ALTER TABLE cus_tbl
MODIFY cus_fname VARCHAR(50) NOT NULL;

ALTER TABLE cus_tbl
ADD cus_age INT NOT NULL;

SELECT * FROM cus_tbl;
DESC cus_tbl;

CREATE TABLE employee(id INT,fname VARCHAR(20),lname VARCHAR(20),address TEXT(300));
INSERT INTO employee VALUES (63,'karthik','bhat','kolte patil raaga');
USE raagab502;
DROP TABLE employee;
SELECT REGEXP_LIKE('aa','AA') FROM employee;

ALTER TABLE cus_tbl
ADD cus_salary DOUBLE(10,2)
AFTER salary,
ADD cus_incre DOUBLE(5,2)
AFTER address;

ALTER TABLE cus_tbl
MODIFY cus_lname VARCHAR(50) NULL;

ALTER TABLE cus_tbl
DROP COLUMN cus_incre;

ALTER TABLE cus_tbl
CHANGE COLUMN cus_address address
TEXT NULL;

ALTER TABLE cus_tbl
RENAME TO cus_table;

DESC cus_table;
SELECT * FROM cus_tbl;
DESC cus_table;

SHOW TABLES;

TRUNCATE TABLE cus_tbl;
DROP TABLE employee;

SHOW DATABASES;
drop table cus_tbl;

create or replace view customers as
select cus_id, cus_fname from cus_tbl;

select * from customers;

alter view customers as
select * from cus_tbl;

drop view customers1

insert into emp values (90,'abc','xyz');
insert into emp(cus_id,cus_firstname,cus_surname) values (77,'chaavi','kumar');
insert into emp(cus_id,cus_firstname,cus_surname)
values
(88,'karthik','pai'),
(101,'karthik','shenoy'),
(201,'karthik','nayak');
select * from emp;

create table officers 
(officer_id int auto_increment, officer_name varchar(30), officer_surname varchar(20), address text, primary key(officer_id));

desc officers;
insert into officers values
(9,'ashish','shenoy','');
select * from officers;

select * from officers where officer_id<5;
select * from officers where officer_surname='bhat' and address='kannur';
select * from officers where officer_surname='bhatt' or address='kannuru';
select * from officers where (address='jp nagar' and officer_name='ashish') or (officer_id<5);
select distinct officer_surname from officers;
select * from officers where (officer_id<5) or (address='jp nagar' or officer_name='ashish');

select distinct address, officer_name from officers;
select distinct officer_surname, address from officers;
select distinct officer_name,address from officers where officer_id<=5;


select * from officers where address='kannur' order by officer_name desc;
select * from officers where address='kannur' order by officer_name;
select * from officers where address='kannur' order by officer_name asc;
select officer_id from officers where address='kannur' order by officer_name;

select officer_id, officer_name, address from officers
where officer_id<5
order by officer_name desc, address asc;