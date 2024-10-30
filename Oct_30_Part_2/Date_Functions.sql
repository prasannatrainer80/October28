-- Date Functions 

-- getdate() : used to display today's date 

select GETDATE()
GO

select CONVERT(varchar,getdate(),1) 
select CONVERT(varchar,getdate(),2) 
select CONVERT(varchar,getdate(),3)
select CONVERT(varchar,getdate(),4)
select CONVERT(varchar,getdate(),5) 
select CONVERT(varchar,getdate(),6)   
select CONVERT(varchar,getdate(),7) 
select CONVERT(varchar,getdate(),101) 

-- DatePart() : Display specific portion of the given date 

select DATEPART(dd,getdate())
select DATEPART(mm,getdate())
select DATEPART(yy,getdate())
select DATEPART(qq,getdate())
select DATEPART(dw,getdate())
select DATEPART(dy,getdate())
select DATEPART(wk,getdate())
select DATEPART(hh,getdate())
select DATEPART(mi,getdate())
select DATEPART(ss,getdate())
select DATEPART(ms,getdate())

-- Datename() : Used to dispaly in english word format 

select DATENAME(mm,getdate()) 
GO

select DATENAME(dw,getdate())
GO

-- DateAdd() : if you want to add no.of days or years or months to particular
date then we need the help of DateAdd

select DATEADD(dd,3,getdate())
GO

select DATEADD(mm,3,getdate())
GO

select DATEADD(yy,3,getdate())
GO

select DATEADD(mm,-3,getdate())
GO


select DATEDIFF(dd,'03-09-1980',getdate())
GO

select DATEDIFF(yy,'03-09-1980',getdate())
GO
