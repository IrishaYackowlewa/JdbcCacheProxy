# JdbcCacheProxy
Для запуска требуется предварительно создать БД H2 с именем test в папке пользователя и выполнить создание таблиц:

CREATE TABLE CACHABLE( id int not null auto_increment, name varchar not null, arg int not null, result int, primary key(id) );
