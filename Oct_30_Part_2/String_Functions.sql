
-- String Functions

-- charindex() : Display's the first occurrence of given char in a string 

select CHARINDEX('l','hello')
GO

select Name,CHARINDEX('a',Name) from Employ
GO

-- len() : used to find out length of string 

select len('Vignesh')
GO

select Name,len(Name) from Employ
Go

-- left() : Used to display no.of left-side chars 

select left('Jashwanth',4) 
GO

Select Name,left(name,4) from Employ
GO

-- Right() : used to display no.of right-side chars 

select Right('Varsha',4) 

select name,left(name,4),right(name,4) from Employ
GO

-- lower() : used to display in lower case

-- upper () : Used to display in upper case

select lower('Jansu'), Upper('Jansu') 
GO

select name,lower(name), upper(name) from Employ
Go

-- substring() : used to display part of the string 

select SUBSTRING('Sundhara',2,3) 
GO

select Name,SUBSTRING(name,2,4) from Employ
GO

-- Replace() : used to replace old char/string with new char/string in all occurrences 

select REPLACE('Java Training','Java','Sql') 
GO

