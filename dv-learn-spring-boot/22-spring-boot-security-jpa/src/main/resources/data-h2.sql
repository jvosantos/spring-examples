insert into USER(ID, EMAIL, FULL_NAME, PASSWORD) values (1, 'jvosantos@gmail.com', 'Vasco Santos', 'password');

insert into ROLE(ID, ROLE) values (1, 'ROLE_USER');
insert into ROLE(ID, ROLE) values (2, 'ROLE_ADMIN');

insert into USER_ROLES(USER_ID, ROLE_ID) values (1, 1);
insert into USER_ROLES(USER_ID, ROLE_ID) values (1, 2);
