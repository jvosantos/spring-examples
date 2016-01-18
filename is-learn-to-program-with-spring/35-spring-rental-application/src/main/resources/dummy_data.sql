insert into RENTAL_LOCATION (ID, NAME, ADDRESS1, ADDRESS2, CITY, STATE, ZIP_CODE) values (1, 'Gas Station', 'some address', null, 'London', null, '0000-001');
insert into RENTAL_LOCATION (ID, NAME, ADDRESS1, ADDRESS2, CITY, STATE, ZIP_CODE) values (2, 'Shopping Mall', 'another address', null, 'London', null, '1234-321');
insert into RENTAL_LOCATION (ID, NAME, ADDRESS1, ADDRESS2, CITY, STATE, ZIP_CODE) values (3, 'Premium Club', 'yet another stree', null, 'London', null, '8875-546');
commit;

insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (1, 'Fight Club', 'BluRay', 200, 5, 1, TRUE);
insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (2, 'Fight Club', 'BluRay', 200, 5, 2, TRUE);
insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (3, 'Fight Club', 'BluRay', 200, 5, 3, TRUE);
insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (4, 'Lord of The Rings', 'BluRay', 200, 5, 1, TRUE);
insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (5, 'Lord of The Rings', 'BluRay', 200, 5, 2, TRUE);
insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (6, 'Pulp Fiction', 'BluRay', 200, 5, 3, TRUE);
insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (7, 'Django unchained', 'BluRay', 200, 5, 1, TRUE);
insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (8, 'The Hateful Eight', 'BluRay', 200, 5, 2, TRUE);
insert into MEDIA (ID, TITLE, FORMAT, LENGTH, RATING, RENTAL_LOCATION_ID, AVAILABLE) values (9, 'The colour of magic', 'BluRay', 200, 5, 3, TRUE);
commit;
