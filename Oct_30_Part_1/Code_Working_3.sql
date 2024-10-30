-- CASE  : Used to execute statements based on the condition 

select * from Employ
GO

-- Write a query ensure if maritalStaus is 0 then 'Unmarried' if 1 then 'Married' 

select Empno, Name,Gender,MaritalStatus,
case MaritalStatus 
	WHEN 0 THEN 'Unmarried'
	WHEN 1 THEN 'Married'
END 'Status'
from Employ
Go

select distinct dept from EMploy
GO


-- Write a query ensure display manager's name as 
-- for java Shyamala is manager 
-- for dotnet Divya is manager
-- for sql Sayooj is manager
-- for training Anil is manager 

select empno, name,gender,dept,desig,basic,
CASE Dept 
   WHEN 'Java' THEN 'Shyamala'
   WHEN 'Dotnet' THEN 'Divya'
   WHEN 'Sql' THEN 'Sayooj'
   WHEN 'Training' THEN 'Anil'
END 'Manager'
from Employ 
GO

select * from Employ
GO

select empno, name,gender,dept,desig,basic,commission,
case WHEN Commission IS NULL THEN Basic 
ELSE Basic + Commission 
END 'Take Home'
from Employ
Go

