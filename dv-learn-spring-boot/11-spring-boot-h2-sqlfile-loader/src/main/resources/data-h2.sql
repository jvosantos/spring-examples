insert into author(id, first_name, last_name) values (1, 'Vasco', 'Santos');
insert into post(id, title, body, author_id, posted_on) values(1, 'Hello World', 'HELLO WORLD!!  HOW ARE YOU DOING???', 1, CURRENT_DATE());
insert into post(id, title, body, author_id, posted_on) values(2, 'Update do hello world', 'Are you ready??', 1, CURRENT_DATE());
