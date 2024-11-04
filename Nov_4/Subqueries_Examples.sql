select max(sal) from Emp;

-- Display name of employ who is getting max. salary 

select ename from Emp where sal = max(sal);

select ename from Emp where sal = (select max(sal) from Emp);

-- Display second max salary from Emp table 

select max(sal) from Emp where sal < (select max(sal) from Emp);

-- Display the name of employ who is getting second max. salary

select ename from Emp 
where sal = (select max(sal) from Emp where sal < (select max(sal) from Emp));

select * from Dept where Deptno <> ALL(select Deptno From Emp);

select * from Dept where Deptno = ANY(select deptno from Emp);

-- Display Idle Agents (Who are in Agent table but not in AgentPolicy table) 

select * from Agent where agentID <> ALL(select agentId from AgentPolicy);

-- Display Agents who have relevant policy records 

select * from agent where AgentID = ANY(select AgentId from AgentPolicy);

-- Display Idle Policy Details (which is there in Policy Table, but not in AgentPolicy Table) 

select * from Policy where PolicyId <> ALL(select PolicyId from AgentPolicy);

-- Display Matching Policies from Policy and AgentPolicy Tables 

select * from Policy where PolicyId = ANY(select PolicyId from AgentPolicy);

