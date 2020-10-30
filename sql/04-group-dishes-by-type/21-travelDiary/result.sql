CREATE PROCEDURE travelDiary()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT GROUP_CONCAT(DISTINCT country) as countries
    FROM diary
    ORDER BY country;
END
