select empno, ename, job, sal, mgr
from Emp;

select E1.Empno 'Manager Id', E1.Ename 'Manager Name', 
E2.Empno 'Employ Id', E2.Ename 'Employ Name'
from Emp E1 INNER JOIN Emp E2 
ON E1.Empno = E2.Mgr
Order by E1.Empno;



