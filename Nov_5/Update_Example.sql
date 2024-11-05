SELECT * FROM hexapracticeoctober.employ;

-- change the name to 'vignesh rajappa', dob to 2004-10-10 and dept as Angular for empno =1 

Update Employ set name='Vignesh Rajappa',Dob='2004-10-10',dept='Angular' WHERE Empno = 1;

-- Change the salary to 99999, comm as null, desig is 'President to dhanu 

Update Employ set salary=99999, comm=null,desig='President' Where empno = 5;

select * from Employ;