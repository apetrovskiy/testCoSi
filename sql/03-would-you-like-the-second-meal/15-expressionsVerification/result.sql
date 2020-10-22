CREATE PROCEDURE expressionsVerification()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT * FROM expressions
    WHERE CASE
                WHEN operation = '+'
                THEN c = a + b
                WHEN operation = '-'
                THEN c = a - b
                WHEN operation = '*'
                THEN c = a * b
                WHEN operation = '/'
                THEN c = a / b
                END;
END
