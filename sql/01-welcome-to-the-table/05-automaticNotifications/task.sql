CREATE PROCEDURE automaticNotifications()
    SELECT email
    FROM users
    WHERE ... ("admin", "premium")

    ORDER BY email;
