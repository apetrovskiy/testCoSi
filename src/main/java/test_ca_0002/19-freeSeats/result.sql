/* WRONG!!! */CREATE PROCEDURE freeSeats()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT flights.flight_id, CASE purchases.seat_no
                                WHEN NULL
                                THEN planes.number_of_seats
                                ELSE (planes.number_of_seats - purchases.seat_no)
                                END as free_seats
    FROM planes
    JOIN flights ON flights.plane_id = planes.plane_id
    RIGHT JOIN purchases ON flights.flight_id = purchases.flight_id
    GROUP BY flights.flight_id, flights.plane_id

    UNION
    SELECT flights.flight_id, planes.number_of_seats as free_seats
    FROM planes
    JOIN flights ON flights.plane_id = planes.plane_id
    RIGHT JOIN purchases ON flights.flight_id <> purchases.flight_id
    ;
END
