DROP PROCEDURE IF EXISTS legsCount;
CREATE PROCEDURE legsCount()
    SELECT ... as summary_legs
    FROM creatures
    ORDER BY id;
