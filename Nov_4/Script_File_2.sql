-- String Functions 

-- length() : Used to display the length of given string 

select length('Sundhara Pandi');

select ename, length(ename) from Emp;

-- instr() : Used to display first occurrence of given char in a string 

select instr('Sundhara','a');

select ename, instr(ename,'A') from Emp;

-- left() : Displays no.of left-side chars 

select ename, left(ename,4),right(ename,4) from EMp;

-- lower() : Displays in lower case

select ename, lower(ename), upper(ename) from EMp;

select concat('Sundhara',' ','Pandi');

select replace('Java Training','Java','Sql');
