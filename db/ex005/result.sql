CREATE PROCEDURE emptyDepartments()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    select dep_name
    from departments
    where id not in (select department from employees) order by id;
END
