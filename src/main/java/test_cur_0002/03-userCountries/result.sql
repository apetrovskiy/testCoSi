CREATE PROCEDURE userCountries()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT users.id, CASE
                        WHEN users.city IS NULL THEN "unknown"
                        WHEN cities.city IS NULL THEN "unknown"
                        ELSE cities.country
                        END as country
    FROM users /*, cities*/
    /*WHERE users.city = cities.city OR cities.city IS NULL*/
    LEFT JOIN cities ON users.city = cities.city /*OR cities.city IS NULL*/
    /*cities.city IS NULL OR cities.city IN (SELECT city FROM users)*/
    ORDER BY users.id;
END
