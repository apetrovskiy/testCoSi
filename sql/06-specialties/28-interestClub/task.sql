CREATE PROCEDURE interestClub()
    SELECT name
    FROM people_interests
    WHERE interests & ... AND interests & ...
    ORDER BY name
