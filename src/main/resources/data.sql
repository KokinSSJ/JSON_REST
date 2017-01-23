insert into Addresses(id, street, city) values (1, 'filipa', 'krakow');
insert into Addresses(id, street, city) values (2, 'armii', 'krk');
insert into Addresses(id, street, city) values (3, 'armi1i', 'krk');


insert into Students(id, name, surname, course, address_id) values (1, 'Dom', 'Bog', 'JAVA',1);
insert into Students(id, name, surname, course, address_id) values (2, 'Dom2', 'Bog2', 'ENG',2);



insert into Books (id, title, author, student_id) values (1, 'walenrod', 'brzeczyk', 1);
insert into Books (id, title, author, student_id) values (2, 'druga ksiazka2', 'author', 1);

insert into Courses (title, hour_time) values ('ang', 10);
insert into Courses (title, hour_time) values ('java', 200);
insert into Courses (title, hour_time) values ('niem', 104);
insert into Courses (title, hour_time) values ('html', 10);


insert into Students_Courses (student_id, course_id) values (1, 2);
insert into Students_Courses (student_id, course_id) values (1,3);
insert into Students_Courses (student_id, course_id) values(1, 4);

insert into Students_Courses (student_id, course_id) values(2, 1);


