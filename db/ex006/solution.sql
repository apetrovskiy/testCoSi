-- not yet tested

    SELECT sa.actor, aa.age
    FROM starring_actors sa
    JOIN actor_ages aa ON aa.actor = sa.actor
    where sa.movie_name in (select m2.movie from movies m2 join (select m1.genre from movies m1 group by m1.genre order by count(m1.genre) desc limit 1) m3 on m2.genre = m3.genre)
    ORDER BY aa.age DESC;
