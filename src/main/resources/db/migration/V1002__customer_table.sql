CREATE TABLE customers (
                            id serial PRIMARY KEY,
                            name varchar(128) NOT NULL,
                            email varchar(128) NOT NULL,
                            password varchar(15) NOT NULL
);