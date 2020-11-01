CREATE PROCEDURE soccerPlayers()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    /*
    SELECT GROUP_CONCAT(players SEPARATOR "; ") AS players
    FROM (SELECT CONCAT(first_name, " ", surname, " #", player_number ORDER by players_number) AS players, player_number FROM soccer_team ORDER BY player_number) AS st
    ORDER BY player_number;
    */
    SELECT GROUP_CONCAT(CONCAT(first_name,  " ", surname, " #", player_number) ORDER BY player_number SEPARATOR "; ") AS players
    FROM soccer_team;
END
