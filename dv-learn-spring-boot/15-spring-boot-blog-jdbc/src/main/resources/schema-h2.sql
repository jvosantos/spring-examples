drop table if exists AUTHOR;

create table AUTHOR (
  ID bigint not null,
  FIRST_NAME varchar(100),
  LAST_NAME varchar(100),
  EMAIL varchar(100),
  primary key (ID)
);

drop table if exists POST;

create table POST (
  ID bigint not null,
  TITLE varchar(100),
  SLUG varchar(100),
  TEASER varchar(4000),
  BODY varchar(4000),
  POSTED_ON timestamp,
  AUTHOR_ID bigint,
  primary key(ID)
);
