CREATE PROCEDURE habitatArea()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT ST_Area( ST_ConvexHull(ST_GeomFromText( CONCAT('MULTIPOINT(', 
            GROUP_CONCAT(x, " ", y), ')'
            )))) AS area
    FROM places;
END
    
    /*
    mysql> SET @g = 'MULTIPOINT(5 0,25 0,15 10,15 25)';
mysql> SELECT ST_AsText(ST_ConvexHull(ST_GeomFromText(@g)));
    */
