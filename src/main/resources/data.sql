insert into Addresses(id, street, city) values (1, 'filipa', 'krakow');
insert into Addresses(id, street, city) values (2, 'armii', 'krk');
insert into Addresses(id, street, city) values (3, 'armi1i', 'krk');


insert into Persons(id, name, surname, address_id, phone_number, email, person_type, year) values (1, 'Dom', 'Bog',1, 504, 'fdds@gma.com', 'student', 3);
insert into Persons(id, name, surname, address_id, phone_number, email, person_type, salary, degree) values (2, 'Dom2', 'Bog2',2,555555, 'dsadas@gma.com', 'teacher', 3000, 'Msc');



insert into Books (id, title, author, person_id) values (1, 'walenrod', 'brzeczyk', 1);
insert into Books (id, title, author, person_id) values (2, 'druga ksiazka2', 'author', 1);

insert into Courses (title, hour_time) values ('ang', 10);
insert into Courses (title, hour_time) values ('java', 200);
insert into Courses (title, hour_time) values ('niem', 104);
insert into Courses (title, hour_time) values ('html', 10);


insert into Persons_Courses (person_id, course_id) values (1, 2);
insert into Persons_Courses (person_id, course_id) values (1,3);
insert into Persons_Courses (person_id, course_id) values(1, 4);
insert into Persons_Courses (person_id, course_id) values(2, 1);

update Persons set phone_number = 060000 where id=1;


