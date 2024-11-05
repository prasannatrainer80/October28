drop database if exists hexapracticeoctober;

create database hexapracticeoctober;

use hexapracticeoctober;

Create Table Employ
(
    Empno INT AUTO_INCREMENT PRIMARY KEY,
    Name varchar(20) NOT NULL,
    Gender ENUM('MALE','FEMALE'),
	Dob Date,
    Dept varchar(20) NOT NULL,
    Desig varchar(20) NOT NULL,
    Salary numeric(9,2), -- total 9 digits number in that 2 decimals as 7 for main and 2 for decimals
    comm numeric(9,2)
);

Insert into Employ(Name,Gender,Dob,Dept,Desig,Salary,Comm) values('Vignesh','MALE','2000-10-12','Java','Expert',88824,100),
('Pranav','MALE','1999-12-19','Dotnet','Expert',88882,NULL),
('Varsha','FEMALE','2000-10-22','Java','Manager',88855,200),
('Sundhar Pandi','MALE','2000-01-15','Sql','Expert',88888,300),
('Dhanu','FEMALE','1999-10-27','Sql','Manager',88811,222),
('Raj Bharath','MALE','2000-10-10','Java','Expert',99922,222),
('Kayalvizi','FEMALE','2000-12-22','Sql','DBA',99999,NULL);

select * from Employ;

Create Table LeaveHistory
(
   LeaveId INT auto_increment Primary Key,
   Empno INT references Employ(empno),
   leaveStartDate Date,
   leaveEndDate Date,
   noOfDays INT,
   leaveReason varchar(30),
   leaveStatus ENUM('PENDING','ACCEPTED','REJECTED') default 'PENDING',
   leaveType ENUM('EL','PL','ML'),
   managerComments varchar(30)
);

Insert into LeaveHistory(Empno,LeaveStartDate,LeaveEndDate,LeaveReason,LeaveType)
values(1,'2024-11-11','2024-11-12','Going Home','EL'),
	   (2,'2025-01-01','2025-01-10','Exams','PL'),
       (3,'2024-10-10','2024-10-13','Visit','PL'),
       (1,'2024-10-10','2024-10-10','Tournment','EL'),
       (4,'2025-10-10','2025-10-12','Visit','EL');
       
select * from LeaveHistory;