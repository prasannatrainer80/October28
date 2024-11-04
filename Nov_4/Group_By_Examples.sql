select job, sum(sal)
from Emp Group By Job;

select job, avg(sal) 
from Emp group by job;

select job, max(sal) 
from Emp group by job;

select job, min(sal) 
from Emp group by job;

select job, count(*) 
from Emp group by job;

select job, sum(sal), avg(sal), max(sal), min(sal), count(*)
from Emp group by job;

-- Display info which job/dept contains more than one employ 

select job, sum(sal), avg(sal), max(sal), min(sal), count(*)
from Emp group by job
having count(*) > 1;

select job, sum(sal), avg(sal), max(sal), min(sal), count(*)
from Emp 
WHERE JOB IN('CLERK','MANAGER','SALESMAN')
group by job
having count(*) > 1
ORDER BY Job;


