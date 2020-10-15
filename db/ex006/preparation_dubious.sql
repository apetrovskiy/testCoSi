/*drop table movies;
drop table starring_actors;
drop table actor_ages;
*/

create table movies(movie nvarchar(100) not null unique, genre text not null);
create table starring_actors(id int not null unique, movie_name text not null, actor nvarchar(100) not null unique);
create table actor_ages(actor nvarchar(100) not null unique, age int not null);

insert into movies(movie, genre) values ('Don''t Breathe', 'crime movie');
insert into movies(movie, genre) values ('Drive', 'crime movie');
insert into movies(movie, genre) values ('Enemy', 'thriller');
insert into movies(movie, genre) values ('Mullholland Drive', 'mistery');
insert into movies(movie, genre) values ('Nocturnal Animals', 'thriller');
insert into movies(movie, genre) values ('The Neon Demon', 'thriller');

insert into starring_actors(id, movie_name, actor) values (1, 'Drive', 'Ryan Gosling');
insert into starring_actors(id, movie_name, actor) values (2, 'Drive', 'Carey Mulligan');
insert into starring_actors(id, movie_name, actor) values (3, 'Don''t Breathe', 'Dylan Minnette');
insert into starring_actors(id, movie_name, actor) values (4, 'Enemy', 'Jake Gyllenhaal');
insert into starring_actors(id, movie_name, actor) values (5, 'Enemy', 'Sarah Gadon');
insert into starring_actors(id, movie_name, actor) values (6, 'Mullholland Drive', 'Naomi Watts');
insert into starring_actors(id, movie_name, actor) values (7, 'Mullholland Drive', 'Laura Harring');
insert into starring_actors(id, movie_name, actor) values (8, 'Nocturnal Animals', 'Amy Adams');
insert into starring_actors(id, movie_name, actor) values (9, 'Nocturnal Animals', 'Aaron Taylor-Johnson');
insert into starring_actors(id, movie_name, actor) values (10, 'Nocturnal Animals', 'Michael Shannon');
insert into starring_actors(id, movie_name, actor) values (11, 'The Neon Demon', 'Elle Fanning');
insert into starring_actors(id, movie_name, actor) values (12, 'The Neon Demon', 'Keanu Reeves');

insert into actor_ages(actor, age) values ('Aaron Taylor-Johnson', 26);
insert into actor_ages(actor, age) values ('Amy Adams', 42);
insert into actor_ages(actor, age) values ('Carey Mulligan', 31);
insert into actor_ages(actor, age) values ('Dylan Minnette', 19);
insert into actor_ages(actor, age) values ('Elle Fanning', 18);
insert into actor_ages(actor, age) values ('Jake Gyllenhaal', 36);

insert into actor_ages(actor, age) values ('Keanu Reeves', 52);
insert into actor_ages(actor, age) values ('Laura Harring', 52);
insert into actor_ages(actor, age) values ('Michael Shannon', 42);
insert into actor_ages(actor, age) values ('Naomi Watts', 48);
insert into actor_ages(actor, age) values ('Ryan Gosling', 36);
insert into actor_ages(actor, age) values ('Sarah Gadon', 29);

/*
select actor_ages.actor, actor_ages.age
from actor_ages, movies, starring_actors
where actor_ages.actor = starring_actors.actor
and starring_actors.movie_name = movies.movie
and movies.genre in (select genre from movies
group by genre
order by count(genre) desc
limit 1)
order by actor_ages.age desc, actor_ages.actor;
*/

/*
select genre from movies
group by genre
order by count(genre) desc
limit 1;
*/
/*
select genre from movies
where genre in (select max(count(genre)) from movies group by genre)
--group by genre
order by count(genre) desc;
*/

select genre
from movies group by genre
having count(genre) as count = max(count)
order by count(genre) desc;
/*

SELECT       `column`,
             COUNT(`column`) AS `value_occurrence` 
    FROM     `my_table`
    GROUP BY `column`
    ORDER BY `value_occurrence` DESC
    LIMIT    1;

*/
