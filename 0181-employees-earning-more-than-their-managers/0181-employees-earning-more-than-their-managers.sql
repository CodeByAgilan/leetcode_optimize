/* Write your PL/SQL query statement below */
SELECT E.name as  Employee 
from Employee E
join Employee E1
on E.managerId=E1.id
where E.salary>E1.salary;