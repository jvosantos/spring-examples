insert into AUTHOR(ID, FIRST_NAME, LAST_NAME, EMAIL) values (1, 'Vasco', 'Santos', 'jvosantos@gmail.com');

insert into POST(ID, TITLE, SLUG, TEASER, BODY, POSTED_ON, AUTHOR_ID) values (1, 'Spring Boot Rocks!', 'spring-boot-rocks', 'Post Teaser', 'Post Body', CURRENT_DATE(), 1);
insert into POST(ID, TITLE, SLUG, TEASER, BODY, POSTED_ON, AUTHOR_ID) values (2, 'REST is what all the cool kids are doing', 'rest-is-cool', 'REST Teaser', 'REST Body', CURRENT_DATE(), 1);
