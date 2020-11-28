CREATE PROCEDURE nullIntern()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT COUNT(*) as number_of_nulls 
    FROM departments
    WHERE description is NULL
    -- OR REGEXP_LIKE(description, '^\\s*([Nn][UuIi][Ll][Ll]?|\\-)\\s*$');
    OR REGEXP_LIKE(description, '^\\s*(NULL|nil|\\-)\\s*$');
END
