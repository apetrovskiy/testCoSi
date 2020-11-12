select 1 as salary_diff
from employees;


select max(salary) as max_salary, min(salary) as min_salary from employees;

select sum(salary) as max_salary from employees where salary = (select max(salary) from employees);

select * --sum(e1.salary), 
--sum(e2.salary)--, sum(e1.salary) - sum(e2.salary)
from employees e1, employees e2 
where e1.salary = (select max(salary) from employees)
and e2.salary = (select min(salary) from employees);

-- this should work
--select if( exists (select count(*) from employees),
select if ( select (select count(*) from employees) > 0),
	(select cast(
(select ((select sum(e1.salary) from employees e1
	where e1.salary = (select max(salary) from employees))
	- (select sum(e2.salary) from employees e2
	where e2.salary = (select min(salary) from employees)))) as int)), 
0);

-- the working part
/*
(select cast(
(select ((select sum(e1.salary) from employees e1
	where e1.salary = (select max(salary) from employees))
	- (select sum(e2.salary) from employees e2
	where e2.salary = (select min(salary) from employees)))) as int))
;
*/
