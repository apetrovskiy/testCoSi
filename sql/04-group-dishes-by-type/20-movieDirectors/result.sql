CREATE PROCEDURE movieDirectors()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT DISTINCT m.director
    FROM moviesInfo m
    WHERE /*year IS NOT NULL
    AND*/ year > 2000
    /*AND oscars IS NOT NULL
    AND oscars > 2
    AND director IS NOT NULL
    AND title IS NOT NULL*/
    GROUP BY m.director/*, m.year*//*, m.oscars*/
    /*HAVING MAX(m.oscars) > 2 AND MAX(m.year) > 2000*/
    HAVING SUM(m.oscars) > 2 /*AND m.year > 2000*/
    ORDER BY m.director ASC;
END
