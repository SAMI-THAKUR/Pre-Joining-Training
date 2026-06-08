use collegeDB;

/* ALTER */
alter table student
add phone varchar(15);

select * from student;

/* DROP */
drop table studentBackup;

/* VIEW (virtual table) */
create view studentView as
select name,age from student;

/* NULL */
select *
from student where email is NULL;

/* AGGREGATE FUNCTION */
SELECT COUNT(*) 
from student;

SELECT MAX(AGE)
from student;

select MIN(AGE)
from student;

select AVG(AGE)
from student;

select sum(age)
from student;

/* GROUP BY */
select city, count(*)
from student
group by city;

select deptId, count(*)
from student
group by deptId
having count(*)>2;

select ifnull(email, "NO EMAIL")
from student;

DELIMITER //

CREATE PROCEDURE GetStudent()
BEGIN
    SELECT * FROM student;
END //

DELIMITER ;

CALL GetStudent();
