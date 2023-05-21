insert into user_details (id,birth_date,name) values (101,current_date,'Raj');
insert into user_details (id,birth_date,name) values (102,current_date,'Kumar');
insert into user_details (id,birth_date,name) values (103,current_date,'Mari');
insert into user_details (id,birth_date,name) values (104,current_date,'Muthu');

insert into post(id, description, user_id) values (201, 'AWS', 101);
insert into post(id, description, user_id) values (202, 'GCP', 101);
insert into post(id, description, user_id) values (203, 'Azure', 102);
insert into post(id, description, user_id) values (204, 'Devops', 103);
commit;