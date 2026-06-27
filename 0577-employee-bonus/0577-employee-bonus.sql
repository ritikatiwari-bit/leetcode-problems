# Write your MySQL query statement below
Select e.name , b.bonus 
from Employee e
Left join Bonus b
on b.empId = e.empId
where (b.bonus<1000 or b.bonus is null);