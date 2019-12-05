show databases;
use raagab502;
show tables;
drop table officers;

create table customers(cus_id int, cus_name varchar(30), cus_surname varchar(20), cus_rating int, cus_address text, cus_location varchar(30),gender char);

alter table customers
add cus_salary double(10,2) after cus_address, add cus_gstno int after cus_id;

alter table customers
modify cus_id int not null;

alter table customers
drop column cus_gstno;

alter table customers
change column gender cus_gender char;

alter table customers
rename cus_tbl;

desc customers;
select * from cus_tbl;

create or replace view customers as
select cus_id, cus_name, cus_salary, cus_location from cus_tbl where cus_gender='F';

alter view customers as
select * from cus_tbl where (cus_gender='F' or cus_gender='M') and cus_address like '%cola%';

drop view customers;

select * from customers;

insert into cus_tbl values 
(25,'Abhijhit','bose',6,'freelancer, bangalore-560087',6355536,'Bangalore','M');

select cus_name, cus_surname, gender from customers where (cus_rating>=5 and gender="M");

update customers
set cus_gstno=1444429, cus_salary=6520000
where cus_id=8;

update cus_tbl
set cus_salary=45526267
where cus_id=1; 

select * from cus_tbl;
select cus_id, cus_name, cus_salary from cus_tbl where cus_salary>655536.00 and cus_gender='M';
select cus_id, cus_name, cus_salary from cus_tbl where cus_salary>99999999999 or cus_gender='F';

select cus_id, cus_name, cus_salary from cus_tbl where ((cus_surname='bhat' and cus_rating<3) or (cus_gender='M')); 
select cus_id, cus_name, cus_salary from cus_tbl where ((cus_surname='bhat' and cus_rating<3) or (cus_id<8));

se