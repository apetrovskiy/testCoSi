CREATE PROCEDURE volleyballResults()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    select * from results order by results.wins;
END
