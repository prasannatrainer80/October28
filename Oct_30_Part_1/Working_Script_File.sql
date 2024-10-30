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
   Basic numeric(9,2)
)
Go

Insert into Employ(name,gender,dept,desig,basic) 
values('Vignesh','MALE','Java','Programmer',48234),
('Jashwanth','MALE','Sql','Expert',99422),
('Varsha','FEMALE','Java','Manager',88223),
('Trisha','FEMALE','Sql','Expert',84211),
('Sudhara','MALE','Dotnet','Manager',88822),
('Samyuktha','FEMALE','Sql','Expert',99922),
('KAYALVIJI','FEMALE','Sql','Manager',99999),
('Pranav','MALE','Java','Manager',88822),
('Rahul','MALE','Sql','Expert',99992)
GO

