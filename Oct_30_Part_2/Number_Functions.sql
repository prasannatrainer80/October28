-- Sql Functions

-- Number Functions

-- abs() : Returns the absolute value 

select abs(-12)
Go

-- power(n,m) -> returns n power m value 

select power(2,3)
GO

-- sqrt(n) -> Returns sqrt value 

select sqrt(49)
GO

-- ceiling() : Returns greatest integer value 

select CEILING(12.00000001) 
GO

-- floor() : Returns smallest integer value 

select floor(12.999999999999999) 
GO

-- round() : Used to round the value to particular no.of digits 

select ROUND(8776.8687,3)
GO

select ROUND(8776.8687,2)
GO

select ROUND(8776.8687,1)
GO

select ROUND(8776.8687,0)
GO

select ROUND(8776.8687,-1)
GO

select ROUND(8776.8687,-2)
GO
