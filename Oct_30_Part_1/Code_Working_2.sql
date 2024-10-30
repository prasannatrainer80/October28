

-- Row_Number() : Used to generate row_number on the field specified. The field to be specified in Over clause

select empno,name,gender,dept,desig,basic,
ROW_NUMBER() OVER(Order By Basic Desc) 'Rno'
From Employ 
GO

-- RANK() : Used to generate rank no on the field specified. The field to be specified must be in over clause

select Empno,Name,gender,Dept,Desig,Basic,
RANK() OVER(Order By Basic Desc) 'Rank'
from Employ 
GO

-- DENSE_RANK() : Used to generate sequential rank no on the field specified. The field to be specified 
-- must be in over clause 


select Empno,Name,gender,Dept,Desig,Basic,
DENSE_RANK() OVER(Order By Basic Desc) 'Rank'
from Employ 
GO
