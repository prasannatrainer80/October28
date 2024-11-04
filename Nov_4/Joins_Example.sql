-- ---------------------- Example for Inner JOin -------------

select Dept.Deptno, Dname, Empno, Ename, JOb,Sal,Mgr
from Dept INNER JOIN Emp
ON Dept.Deptno = Emp.Deptno;

select D.Deptno, Dname, Empno, Ename, JOb,Sal,Mgr
from Dept D INNER JOIN Emp E
ON D.Deptno = E.Deptno;

SELECT A.AgentId, FirstName, LastName, City, State,
P.PolicyId, AppNumber,AnnualPremium,ModalPremium
FROM Agent A INNER JOIN AgentPolicy AP
ON A.AgentId = AP.AgentID
INNER JOIN Policy P ON 
P.PolicyID = AP.PolicyID;


-- -------------------------------------------------------------------------

-- ------------------------ Example for Left Outer Join -------------

select D.Deptno, Dname, Empno, Ename, JOb,Sal,Mgr
from Dept D LEFT JOIN Emp E
ON D.Deptno = E.Deptno;

SELECT A.AgentId, FirstName, LastName, City, State,
P.PolicyId, AppNumber,AnnualPremium,ModalPremium
FROM Agent A LEFT JOIN AgentPolicy AP
ON A.AgentId = AP.AgentID
LEFT JOIN Policy P ON 
P.PolicyID = AP.PolicyID;

-- ----------------------------------------------------------------------------------

--  ------------------- Example for Right Outer Join -------------------------------------------------------------------------

select D.Deptno, Dname, Empno, Ename, JOb,Sal,Mgr
from Dept D RIGHT JOIN Emp E
ON D.Deptno = E.Deptno;

SELECT A.AgentId, FirstName, LastName, City, State,
P.PolicyId, AppNumber,AnnualPremium,ModalPremium
FROM Agent A RIGHT JOIN AgentPolicy AP
ON A.AgentId = AP.AgentID
RIGHT JOIN Policy P ON 
P.PolicyID = AP.PolicyID;

select * from Dept cross join Emp;

select * from Agent Cross Join AgentPolicy;

select * from Policy cross join AgentPolicy;

