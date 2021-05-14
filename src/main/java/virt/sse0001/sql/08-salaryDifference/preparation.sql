drop table employees;

create table employees(id int not null unique, name text not null, salary int not null);

insert into employees(id, name, salary) values (1, 'John', 1200);
insert into employees(id, name, salary) values (2, 'Bill', 1000);
insert into employees(id, name, salary) values (3, 'Mike', 1300);
insert into employees(id, name, salary) values (4, 'Katy', 1200);
insert into employees(id, name, salary) values (5, 'Brendon', 1300);
insert into employees(id, name, salary) values (6, 'Amanda', 900);
