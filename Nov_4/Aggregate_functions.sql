-- Aggregate Functions 

-- sum() : Used to calc sum opeation on the given field

select sum(sal) from EMp;

-- avg() : Used to calc avg operation on the given field

select avg(sal) from Emp;

-- max() : used to display max value

select max(sal) from Emp;

-- min() : used to display min value

select min(sal) from Emp;

-- count : Display total no.of records for that values are not null

select count(comm) from Emp;

select comm from Emp;

select count(*) from Emp;
