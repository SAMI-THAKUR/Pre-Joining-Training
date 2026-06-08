use CollegeDB;

/* SELECT */
select * from student;
select name, email from student;

/* DISTINCT (returns unique values) */
select distinct email from student;

/* WHERE (adding conditions) */
select name, email
from student
where age>21;

/* AND OR */
select *
from student
where age>21 AND deptId=103;

select *
from student
where age>21 OR deptId=103;

/* ORDER BY (defaul ASC) */
select *
from student
order by name ASC;

select *
from student
order by name DESC;

/* UPDATE */
update student
set age=23
where id=2;

/* DELETE */
delete from student
where id=5;

/* LIKE (uses regular expression) */
/*
	% = any character
    _ = single character
*/
select * from student
where name like "S%";

select * from student
where name like "%i";

select * from student
where name like "%am%";

/* IN and BETWEEEN */
select * from student
where deptId in (101, 102);

select * from student
where age between 20 and 22;

/* ALIAS */
select name as studentName
from student;

select * from student
limit 3;




