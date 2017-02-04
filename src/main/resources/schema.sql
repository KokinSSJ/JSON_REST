CREATE TABLE Addresses(
	id bigint primary key auto_increment,
	street varchar(40) not null,
	city varchar(40) not null,
	);
	
CREATE TABLE Persons(
	id int primary key auto_increment,
    name varchar(50) not null,
    surname varchar(50) not null,
    address_id bigint unique not null,
    phone_number int,
    email varchar(40),
    person_type varchar(30) not null,
    year int,
    degree varchar(30),
    salary int,
    
    
	foreign key (address_id) references Addresses(id)
    );
	
CREATE TABLE Books (
	id bigint primary key auto_increment,
	title varchar(40) not null,
	author varchar(40) not null,
	person_id int,
	
	foreign key (person_id) references Persons(id)
	
);

CREATE TABLE Courses(
	id bigint primary key auto_increment,
	title varchar(40) not null,
	hour_time int not null
);

CREATE TABLE Persons_Courses(
	person_id bigint,
	course_id bigint,
	
	foreign key (person_id) references Persons(id),
	foreign key (course_id) references Courses(id)
);
	



