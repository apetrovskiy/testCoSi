You work for an airline, and you've been tasked with improving the procedure for reserving and buying seats.
You have the table seats, which describes seats in the airplane. It has the following columns:

seat_no - The unique number of the seat;
status - The status of the seat (0 indicates free, 1 indicates reserved, and 2 indicates purchased);
person_id - The ID of the person who reserved/purchased this seat (0 if the corresponding status is 0).
You also have the table requests, which contains the following columns:

request_id - The unique ID of the request;
request - The description of the request (1 indicates reserve, 2 indicates purchase);
seat_no - The number of the seat that the person want to reserve/purchase;
person_id - The ID of the person who wants to reserve/purchase this seat.
A person can reserve/purchase a free seat and can purchase a seat that they have reserved.

Your task is to return the table seats after the given requests have been performed.

Note: requests are applied from the lowest request_id; it's guaranteed that all values of seat_no in the table requests are presented in the table seats.

Example

For the given tables seats

seat_no	status	person_id
1	1	1
2	1	2
3	0	0
4	2	3
5	0	0
and requests

request_id	request	seat_no	person_id
1	1	3	4
2	2	2	5
3	2	1	1
the output should be

seat_no	status	person_id
1	2	1
2	1	2
3	1	4
4	2	3
5	0	0
The first request is completed because seat number 3 is free. The second request is ignored because seat number 2 is already reserved by another person. The third request is completed because seat number 1 was reserved by this person, so they can purchase it.

[execution time limit] 10 seconds (mysql)
MySQL
v8.0.21
1234
CREATE PROCEDURE airplaneSeats()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
END
TESTS
Run sample tests to see output
Formatting
Editor Mode
VS Code
Theme
Dark
Tab Size
Auto
Font Size
14px
Auto-brackets
Minimap
Code Completion
Error Highlighting
Hotkeys
CTRL/CMD + Enter
Submit
CTRL/CMD + R
Run
CTRL/CMD + S
Save
