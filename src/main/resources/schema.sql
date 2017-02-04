CREATE TABLE Addresses(
	id bigint primary key auto_increment,
	street varchar(40) not null,
	city varchar(40) not null,
	);
	
	CREATE TABLE Students(
	id int primary key auto_increment,
    name varchar(50) not null,
    surname varchar(50) not null,
    course varchar(50) not null,
    address_id bigint unique not null,
    phone_number int,
    email varchar(40),
    
	foreign key (address_id) references Addresses(id)
    );
	
CREATE TABLE Books (
	id bigint primary key auto_increment,
	title varchar(40) not null,
	author varchar(40) not null,
	student_id int,
	
	foreign key (student_id) references Students(id)
	
);

CREATE TABLE Courses(
	id bigint primary key auto_increment,
	title varchar(40) not null,
	hour_time int not null
);

CREATE TABLE Students_Courses(
	student_id bigint,
	course_id bigint,
	
	foreign key (student_id) references Students(id),
	foreign key (course_id) references Courses(id)
);
	



