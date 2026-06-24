# Write your MySQL query statement below
select (
    select DISTINCT(salary) from Employee
    order by salary desc  limit 1 OFFSET 1
) AS SecondHighestSalary;
