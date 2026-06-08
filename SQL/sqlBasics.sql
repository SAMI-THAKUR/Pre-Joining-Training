 /*
NEED FOR DATABASE
Without Database:
- Data Redundancy
- Data Inconsistency
- Difficult Searching
Database Provides:
- Structured Storage
- Security
- Fast Retrieval
- Data Integrity
 */
 
 create database CollegeDB;
 use CollegeDB;
 
 create table department(
	deptId int primary key,
    deptName varchar(20)
 );
 
 create table student(
	id int primary key,
    name varchar(50),
    email varchar(20) unique,
    age int,
    city varchar(20) default "Mumbai",
    deptId int,
    
    foreign key (deptId) references department(deptId)
 );
 
insert into department values
 ( 101, 'AI&DS'),
 (102, "INFT"),
 (103, "CMPN");
 
 INSERT INTO Student (id, name, email, age, deptId) VALUES
(1, 'Sami','sami@gmail.com',21,101),
(4, 'Rohan','rohan@gmail.com',22,103),
(6, 'Chandler','chandler@gmail.com',20,102);

 INSERT INTO Student (id, name, email, age, deptId, city) VALUES
(2, 'Rahul','rahul@gmail.com',22,102, 'Pune'),
(3, 'Amit','amit@gmail.com',20,101, 'Pune'),
(5, 'Ankit','ankit@gmail.com',20,103, 'Pune');

 INSERT INTO Student (id, name, email, age, deptId, city) VALUES
(7, 'Rahul',NULL ,22,102, 'Pune'),
(8, 'Vinit',"vinit@gmail.com" ,22, 102, NULL)
 