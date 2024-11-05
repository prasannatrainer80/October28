select max(sal) from Emp where sal < (select max(sal) from Emp);

select max(sal) from emp where sal < (select max(sal) from emp where sal < (select max(sal) from Emp));

select max(sal) from emp E1 where  1-1 = (select count(distinct sal) from Emp E2 where e2.sal > e1.sal);

select max(sal) from emp E1 where  2-1 = (select count(distinct sal) from Emp E2 where e2.sal > e1.sal);


select max(sal) from emp E1 where  3-1 = (select count(distinct sal) from Emp E2 where e2.sal > e1.sal);

select sal from Emp;

