CREATE PROCEDURE emptyDepartments()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT d.dep_name
    FROM departments d
    WHERE d.id NOT IN (SELECT e.department FROM employees e)
    ORDER BY d.id;
END
