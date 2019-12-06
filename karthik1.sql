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

select * from cus_tbl;

# will list customer names starting with "a"
select cus_id, cus_name from cus_tbl where cus_name like 'a%'; 

# will lsit customer names ends with "i"
select cus_id, cus_name from cus_tbl where cus_name like '%i';

# will list all customer names which have a substring "ust"
select cus_id, cus_name from cus_tbl where cus_name like '%ust%';

# will list all customer names that have "n" in 3rd position
select cus_id, cus_name from cus_tbl where cus_name like '__n%';

/*will list all customer names that start with "k"  and are atleast 3 characters in length*/
select * from cus_tbl where cus_name like 'k__%';

-- will list all customers names that start with "k" and end with "k"
select * from cus_tbl where cus_name like 'k%k';

select * from cus_tbl where cus_rating in (5,20,1);
select * from cus_tbl where cus_name in ('karthik','Ishani1','Rini','Kaustubh');
select * from cus_tbl where cus_name in ('karthik3','Ishani1','Rini3','K3austubh'); 

#mysql comments
select * from  #table name
cus_tbl  #comment here as
where cus_name=#karthik
"karthik";

-- mysql comments
select * from  -- table name
cus_tbl  -- customer table
where cus_name=-- karthik
"karthik";

/*mysql comments*/
select * from /*table name*/ cus_tbl
where /*where condition*/ cus_name=/*provide name*/'karthik';