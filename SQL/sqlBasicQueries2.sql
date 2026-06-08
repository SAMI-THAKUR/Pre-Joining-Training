use CollegeDB;

/* JOINS */
select s.name, d.deptName
from student s
inner join department d
on s.deptId=d.deptId;

select * from student s
left join department d
on s.deptId=d.deptId;

select * from student s
right join department d
on s.deptId=d.deptId;

/* MYSQL doesnt support FULL JOIN directly*/
/* so do left join UNION right join */

/* Union */
select city from student
UNION
select deptName from department;

/* SELECT INTO (copies the data) */
/* sql server syntax */
select * into studentBackup
from student;

/* CREATE INDEX (improves search speed) */
create index idxName 
on student(name);