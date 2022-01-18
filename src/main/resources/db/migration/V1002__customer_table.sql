CREATE TABLE customers (
                            id serial PRIMARY KEY,
                            email varchar(128) NOT NULL,
                            password varchar(15) NOT NULL
);