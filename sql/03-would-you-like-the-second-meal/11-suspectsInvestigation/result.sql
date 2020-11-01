CREATE PROCEDURE suspectsInvestigation()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT id, name, surname
    FROM Suspect
    WHERE height <= 170
    AND name LIKE 'b%'
    AND surname like 'gre_n'
    ORDER BY id;
END
