insert into user_details(id, birth_date, name) 
values (1001, current_date(), 'LMD');
insert into user_details(id, birth_date, name) 
values (1002, current_date(), 'Lali');
insert into user_details(id, birth_date, name) 
values (1003, current_date(), 'Esteban');

insert into post(id, description, user_id)
values (2001, 'Are you want to learn AWS?', 1001);
insert into post(id, description, user_id)
values (2002, 'Are you want to learn Cloud Engineering?', 1001);
insert into post(id, description, user_id)
values (2003, 'Are you want to learn Excel?', 1002);
insert into post(id, description, user_id)
values (2004, 'Are you want to learn Kalbasztöltes?', 1003);