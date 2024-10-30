-- Display list of tables available in current database 

select * from INFORMATION_SCHEMA.TABLES
GO

-- Display information about Employ Table 

sp_help Employ
GO

-- Display all records from Employ Table 

select * from Employ
Go

-- Display Empno, Name, Gender, Basic from Employ table 

select Empno, Name, Gender, Basic 
from Employ 
GO

-- Display all records whose Basic > 90000 

select * from Employ
WHERE Basic >= 90000
GO

-- Display all records whose Empno < 5 

select * from Employ 
where Empno < 5
GO

-- Display all records whose Gender is 'MALE' 

select * from Employ 
where Gender='MALE'
GO

-- Display info whose name is 'Sundhara' 

select * from Employ 
where name='Sundhara'
GO

-- Display all records whose Desig is 'Manager'

select * from Employ 
where desig='Manager'
GO

-- Display all records whose Dept is 'Java'

select * from Employ 
where Dept='Java'
GO

-- Between...AND : Used to display records from start to end range. 
-- Display all records whose basic from 80000 to 90000 range 

select * from Employ
Where Basic Between 80000 and 90000
GO

-- Display all records whose basic not between 80000 and 90000 range 

select * from Employ 
where basic not between 80000 and 90000
GO

-- In Clause : Used to show records w.r.t. Multiple values of particular column 

-- Display info whose dept is java or sql

select * from Employ
where dept in('Java','Sql')
GO

-- Display info  whose name is 'Vignesh' or 'Jashwanth' or 'Varsha' or 'Trisha'

select * from Employ 
where name in('Vignesh','Jashwanth','Varsha','Trisha') 
GO

-- Display info whose name not as 'Vignesh' or 'Jashwanth' or 'Varsha' or 'Trisha'

SELECT * FROM Employ 
WHERE name NOT IN('Vignesh','Jashwanth','Varsha','Trisha') 
GO

-- LIKE : Used to display records w.r.t. Wild cards 

-- Display all records whose name starts with 'J'

select * from Employ where name like 'J%'
GO

-- Display all records whose name ends with 'A'

select * from Employ where name like '%A'
GO

-- Display all records whose name contains 'ha' 

select * from Employ where name like '%ha%'
GO

-- Order By : Used to display records based on specific field(s) in ascending or descending order 

select Empno,name,gender,dept,desig,basic 
From Employ 
order by Name 
GO

select Empno,name,gender,dept,desig,basic 
From Employ 
order by Basic  
GO

select Empno,name,gender,dept,desig,basic 
From Employ 
order by Name DESC   
GO

select Empno,name,gender,dept,desig,basic 
From Employ 
order by Dept,Name    
GO

select Empno,name,gender,dept,desig,basic 
From Employ 
order by Dept,Desig,Name     
GO

select Empno,name,gender,dept,desig,basic 
From Employ 
order by Dept ASC,Name DESC    
GO

-- Distinct : Used to Eliminate duplicate entries at the time of display 

select distinct dept from Employ
GO

-- Top  : Display top most records based on the field 

select top 3 * from EMploy order by basic desc
Go




