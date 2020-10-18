CREATE PROCEDURE projectList()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    select project_name, team_lead, income
    from Projects
    order by internal_id;
END
