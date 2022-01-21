CREATE TABLE customers (
                           id SERIAL NOT NULL,
                           email varchar(128) NOT NULL,
                           password varchar(128) NOT NULL,
                           fullname varchar(128) NOT NULL default ' ',
                           enabled boolean NOT NULL default true,
                           role varchar(16) NOT NULL default 'USER',
                           PRIMARY KEY (id),
                           UNIQUE (email)
);