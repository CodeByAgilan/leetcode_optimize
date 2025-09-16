select d.name as  Department,
       e.name as Employee ,
       e.salary as Salary
from Employee e
join Department d
   on e.departmentId=d.id
WHERE (DepartmentId,Salary) in(SELECT DepartmentId, 
                                      MAX(Salary) 
                               FROM Employee 
                               group by DepartmentId);
