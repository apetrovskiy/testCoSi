CREATE PROCEDURE gradeDistribution()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT Name, ID FROM Grades
    WHERE Final > Midterm1 * 0.5 + Midterm2 * 0.5
    AND Final > Final * 0.5 + Midterm1 * 0.25 + Midterm2 * 0.25
    ORDER BY SUBSTRING(Name, 1, 3), ID;
END
