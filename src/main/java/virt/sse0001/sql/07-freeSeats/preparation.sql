drop table flights;
drop table planes;
drop table purchases;

create table flights(flight_id int not null unique, plane_id int not null);
create table planes(plane_id int not null unique, number_of_seats int not null);
create table purchases(flight_id int not null, seat_no int not null);

/*
flights:
flight_id: the unique flight id;
plane_id: the id of the plane making the flight.
planes:
plane_id: the unique plane id;
number_of_seats: the number of seats on the plane.
purchases:
flight_id: the flight id of the purchase;
seat_no: the seat number of the purchase.
*/

insert into planes (plane_id, number_of_seats) values (128, 5);
insert into planes (plane_id, number_of_seats) values (23, 7);
insert into planes (plane_id, number_of_seats) values (157, 4);
insert into planes (plane_id, number_of_seats) values (239, 2);

insert into purchases (flight_id, seat_no) values (111, 1);
insert into purchases (flight_id, seat_no) values (87, 1);
insert into purchases (flight_id, seat_no) values (87, 7);
insert into purchases (flight_id, seat_no) values (100, 5);

insert into flights (flight_id, plane_id) values (111, 128);
insert into flights (flight_id, plane_id) values (87, 157);
insert into flights (flight_id, plane_id) values (100, 23);
insert into flights (flight_id, plane_id) values (121, 23);
