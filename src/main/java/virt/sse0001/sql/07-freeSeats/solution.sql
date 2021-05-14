select distinct f.flight_id, p.number_of_seats - count(pch.seat_no) as free_seats
from purchases pch
right join flights f on pch.flight_id = f.flight_id
left join planes p on p.plane_id = f.plane_id
group by f.flight_id, p.plane_id, p.number_of_seats
order by f.flight_id;
