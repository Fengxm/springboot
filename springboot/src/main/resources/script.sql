use test;

create table user(
	id int primary key not null,
	username varchar(20),
	create_date date,
	last_accessed date,
	is_active tinyint(1)
);

insert into user values(1,'zhangsan','2016-11-18','2016-11-18',1);

insert into user values(2,'lisi','2016-11-18','2016-11-18',1);