DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

DROP TABLE IF EXISTS db_test.user;
CREATE TABLE db_test.user (
  id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT 'PK',
  username VARCHAR(255) NOT NULL
  COMMENT '',
  password VARCHAR(255) NOT NULL
  COMMENT '',
  role VARCHAR(255) NOT NULL COMMENT 'admin; user'
);

INSERT INTO db_test.user VALUE (NULL, 'admin', '123', 'admin');
INSERT INTO db_test.user VALUE (NULL, 'user', '123', 'user');

SELECT *
FROM db_test.user;