insert into etl_database (id, name, url, username, password ) values (1, 'test_db', 'jdbc:postgresql://10.20.0.224:5432/report', 'postgres', 'tech@456');
insert into etl_pipline (id, source_database_id, source_query, target_database_id, target_query, active ) values (1, 1, 'test', 1, 'test', 1);
