CREATE TABLE users (

      id INTEGER(11) NOT NULL AUTO_INCREMENT,
      name VARCHAR(50) NOT NULL,
      email VARCHAR(100) NOT NULL UNIQUE,
      photo VARCHAR(100),

      PRIMARY KEY (id)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;