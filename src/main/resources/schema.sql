create table etl_pipline_history (
	id int not null,
	pipline_id int not null,
	execution_date date not null,
	status int not null,
	primary key(id)
);

create table etl_pipline (
	id int not null,
	source_database_id int not null,
	source_query varchar(1000) not null,
	target_database_id int not null,
	target_query varchar(1000) not null,
	active int not null,
	primary key(id)
);

create table etl_database (
	id int not null,
	name varchar(30) not null,
	url varchar(100) not null,
	username varchar(100) not null,
	password varchar(100) not null,
	primary key(id)
);