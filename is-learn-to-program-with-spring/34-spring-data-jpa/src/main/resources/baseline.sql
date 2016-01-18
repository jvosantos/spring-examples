drop table if exists MEDIA cascade;
drop table if exists RENTAL_LOCATION cascade;
drop table if exists RENTAL cascade;

create table if not exists MEDIA (
    ID int auto_increment,
    TITLE varchar(100),
    FORMAT varchar(45),
    LENGTH int,
    RATING int,
    RENTAL_LOCATION_ID int,
    AVAILABLE boolean
);

create table if not exists RENTAL_LOCATION (
    ID int auto_increment,
    NAME varchar(100),
    ADDRESS1 varchar(100),
    ADDRESS2 varchar(100),
    CITY varchar(45),
    STATE varchar(45),
    ZIP_CODE varchar(45)
);

create table if not exists RENTAL (
    ID int auto_increment,
    MEDIA_ID int,
    PICKUP_LOCATION_ID int,
    RETURN_LOCATION_ID int,
    PICKUP_DATE date,
    RETURN_DATE date,
    CUSTOMER_NAME varchar(100)
);

alter table MEDIA add constraint MEDIA_PK primary key (ID);
alter table RENTAL_LOCATION add constraint RENTAL_LOCATION_PK primary key (ID);
alter table RENTAL add constraint RENTAL_PK primary key (ID);

alter table RENTAL add constraint RENTAL_MEDIA_FK foreign key (MEDIA_ID) references MEDIA (ID) on delete no action on update no action;
alter table RENTAL add constraint RENTAL_PICKUP_LOCATION_FK foreign key (PICKUP_LOCATION_ID) references RENTAL_LOCATION (ID) on delete no action on update no action;
alter table RENTAL add constraint RENTAL_RETURN_LOCATION_FK foreign key (RETURN_LOCATION_ID) references RENTAL_LOCATION (ID) on delete no action on update no action;
