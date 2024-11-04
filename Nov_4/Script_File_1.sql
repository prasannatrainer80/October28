use batch1;

show tables;

-- Display info about Dept table 

desc Dept;

-- Display info about Emp table

desc Emp;

-- Display all records from Emp table 

select * from Emp;

-- Display Empno, ename, job, sal from Emp table 

select empno, ename, job, sal
from EMp;

-- Display info whose sal from 1000 to 2000

select * from Emp 
where sal between 1000 and 2000;

-- Display info whose sal not between 1000 and 2000

select * from Emp 
where sal NOT between 1000 and 2000;

-- Display info whose ename like 'SMITH' OR 'SCOTT' OR 'JAMES'

select * from Emp 
where ename IN('SMITH','SCOTT','JAMES');

-- Display info whose name starts with 'S' 

select * from Emp where ename like 'S%';

-- Display records based on job wise ascending order

select * from Emp 
order by job;

-- Display records based on job, ename wise in ascending order 

select * from Emp 
order by job, ename;

select empno, ename, job, sal, comm,
case 
  when comm is NULL THEN sal else sal+comm
end 'TakeHome'
from Emp;