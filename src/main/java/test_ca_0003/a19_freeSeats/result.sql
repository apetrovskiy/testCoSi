CREATE PROCEDURE freeSeats()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    /*
    select f.flight_id, 
    case pur.seat_no
        when null then p.number_of_seats
        else (p.number_of_seats - pur.seat_no)
    end as free_seats
    from planes p
    join flights f on f.plane_id = p.plane_id
    right join purchases pur on f.flight_id = pur.flight_id
    ;*/
    --     SELECT flights.flight_id, CASE purchases.seat_no
    --                             WHEN NULL
    --                             THEN planes.number_of_seats
    --                             ELSE (planes.number_of_seats - purchases.seat_no)
    --                             END as free_seats
    -- FROM planes
    -- JOIN flights ON flights.plane_id = planes.plane_id
    -- RIGHT JOIN purchases ON flights.flight_id = purchases.flight_id
    -- GROUP BY flights.flight_id, flights.plane_id
    SELECT flight_id, free_seats FROM (
        SELECT flights.flight_id, CASE purchases.seat_no
                                WHEN NULL
                                THEN planes.number_of_seats
                                ELSE (planes.number_of_seats - count(purchases.seat_no))
                                END as free_seats
    FROM planes
    LEFT JOIN flights ON flights.plane_id = planes.plane_id
    RIGHT 
    JOIN purchases ON flights.flight_id = purchases.flight_id
    GROUP BY flights.flight_id, flights.plane_id

    UNION
    SELECT flights.flight_id, planes.number_of_seats as free_seats
    /*
    FROM 
    -- planes
    -- JOIN 
    flights 
    -- ON flights.plane_id = planes.plane_id
    -- RIGHT 
    JOIN purchases ON flights.flight_id <> purchases.flight_id
    LEFT JOIN planes ON flights.plane_id = planes.plane_id
    -- GROUP BY flights.flight_id, flights.plane_id
    -- WHERE planes.plane_id NOT IN ()
    */
    
    FROM planes
    JOIN flights ON flights.plane_id = planes.plane_id
    RIGHT JOIN purchases ON flights.flight_id <> purchases.flight_id
    WHERE flights.flight_id NOT IN (SELECT flight_id FROM purchases)
    ) as aaa
    ORDER BY 1
    ;
END
