if exists(select * from sysobjects where name='sqlpractice')
Drop Database sqlpractice
go

create database sqlpractice
go

use sqlpractice
go
if exists(select * from sysobjects where name='Employ')
Drop Table Employ
go


create table Employ
(
   Empno INT IDENTITY(1,1) Primary key,
   Name varchar(30),
   Gender varchar(30),
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2),
   Commission Numeric(9,2),
   MaritalStatus INT
)
Go

Insert into Employ(name,gender,dept,desig,basic,Commission,MaritalStatus) 
values('Vignesh','MALE','Java','Programmer',99999,1000,0),
('Jashwanth','MALE','Sql','Expert',99422,NULL,0),
('Varsha','FEMALE','Java','Manager',88223,NULL,0),
('Trisha','FEMALE','Sql','Expert',84211,900,0),
('Sundhara','MALE','Dotnet','Manager',88822,1200,0),
('Samyuktha','FEMALE','Sql','Expert',99922,NULL,0),
('KAYALVIJI','FEMALE','Sql','Manager',99999,300,0),
('Pranav','MALE','Java','Manager',99992,NULL,0),
('Rahul','MALE','Sql','Expert',99992,1000,0),
('Misbah','MALE','Sql','Expert',90000,1200,0),
('Prasanna','MALE','Sql','Expert',88888,NULL,1),
('Anil','MALE','Training','Manager',90000,1200,1),
('MG','MALE','Training','Manager',90000,1200,0)

GO

