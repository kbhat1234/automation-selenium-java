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

TRUNCATE TABLE cus_tbl;
DROP TABLE employee;

SHOW DATABASES;
drop table cus_tbl;

create or replace view customers as
select cus_id, cus_fname from cus_tbl;

select * from customers;

alter view customers as
select * from cus_tbl;

drop view customers1;

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

select address, count(*) from officers group by address;
select address, count(*) as "Count address" from officers group by address;

create table employee (emp_id int, emp_name varchar(30), working_date timestamp, working_hours mediumint);
desc employee;
select * from employee;
insert into employee (emp_id, emp_name, working_date, working_hours) values
(1,'karthik','2019-06-21 02:12:34',12),
(2,'rini','2019-06-21 09:11:23',9),
(3,'kaustubh','2019-06-21 21:00:25',7),
(4,'ishani','2019-06-21 22:30:22',13),
(1,'karthik','2019-06-21 02:12:34',5),
(2,'rini','2019-06-21 09:11:23',4),
(3,'kaustubh','2019-06-21 21:00:25',3),
(4,'ishani','2019-06-21 22:30:22',2);

select emp_name, SUM(working_hours) as "total no.of hours" from employee group by emp_name;
select emp_name, min(working_hours) as "Minimum working hours" from employee group by emp_name;
select emp_name, max(working_hours) as "Maximum working hours" from employee group by emp_name;
select emp_name, min(working_hours) as "Minimum working hours", max(working_hours) as "Maxximum working hours" from employee group by emp_name;
select emp_name, avg(working_hours) as "Average working hours" from employee group by emp_name;

select emp_name, sum(working_hours) as "total number of hours" from employee group by emp_name having (sum(working_hours)<5);
select emp_name, avg(working_hours) as "Average working hours" from employee group by emp_name having (avg(working_hours)<6);

truncate table employee;
drop table employee;