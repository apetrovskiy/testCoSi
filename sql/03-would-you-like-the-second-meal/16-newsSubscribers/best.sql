/*Please add ; after each select statement*/
CREATE PROCEDURE newsSubscribers()
    SELECT DISTINCT subscriber
    FROM
    (
        SELECT *
        FROM full_year
            UNION
        SELECT *
        FROM half_year
    ) x
    WHERE newspaper LIKE "%Daily%"
    ORDER BY subscriber ASC;
