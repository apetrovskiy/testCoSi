CREATE PROCEDURE mischievousNephews()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT CASE DAYOFWEEK(mischief_date)
            WHEN 2 THEN 0
            WHEN 3 THEN 1
            WHEN 4 THEN 2
            WHEN 5 THEN 3
            WHEN 6 THEN 4
            WHEN 7 THEN 5
            WHEN 1 THEN 6
            END as weekday, mischief_date, 
    author, title
    FROM mischief
    ORDER BY weekday, CASE author
                        WHEN 'Huey'
                        THEN 1
                        WHEN 'Dewey'
                        THEN 2
                        WHEN 'Louie'
                        THEN 3
                        END,
    mischief_date, title;
END
