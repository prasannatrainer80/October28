use hexapracticeoctober;
/* 
Dept(DeptCode,DeptHead)
Emp(Empno+,Ename,Gender,DeptCode-)
Project(ProjCode+,Hours,Empno-)
*/
drop table if exists project;
drop table if exists emp;

drop table  if exists dept;

Create Table Dept 
(
    DeptCode INT auto_increment,
    DeptHead varchar(30),
    constraint pk_dept_deptcode primary key(deptCode)
);

Insert into Dept(DeptHead) values('JAVA'),('Dotnet'),('Testing'),('SAP'),('Admin');

drop table if exists emp;

create table Emp
(
    Empno INT auto_increment,
    Ename varchar(20),
    Gender ENUM('MALE','FEMALE'),
    DeptCode INT,
    constraint fk_emp_deptcode foreign key(DeptCode) references Dept(Deptcode),
    constraint pk_emp_empno primary key(empno)
);

Insert into Emp(Ename,Gender,DeptCode) values('Sundhar Pandi','MALE',1),('Trisha','FEMALE',1),
('Archana','FEMALE',2),('Dilip','MALE',3),('Sarath','MALE',2),('Misbah','MALE',2),
('KalayVizi','FEMALE',3);

drop table if exists project;

create table Project
(
  ProjectCode INT,
  Hours INT,
  Empno INT,
  Constraint FK_Project_Empno Foreign Key(Empno) references Emp(Empno),
  constraint pk_project_pe primary key(ProjectCode,Empno)
);

Insert into Project(ProjectCode,Hours,Empno) 
values(1,90,1),(1,90,2),(2,111,3),(2,111,1),(2,111,5);

select * from Dept;
select * from Emp;
select * from project;