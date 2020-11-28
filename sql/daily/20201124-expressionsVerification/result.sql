CREATE PROCEDURE expressionsVerification()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT *
    FROM expressions
    WHERE c = CASE operation
    WHEN '+' THEN a + b
    WHEN '-' THEN a - b
    WHEN '*' THEN a * b
    WHEN '/' THEN a / b
    END
    ORDER BY id;
END
