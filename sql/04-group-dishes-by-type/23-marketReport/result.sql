CREATE PROCEDURE marketReport()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT IF(GROUPING(country), 'Total:', country) AS country, COUNT(competitor) AS competitors
    FROM foreignCompetitors
    GROUP BY country WITH ROLLUP;
END
