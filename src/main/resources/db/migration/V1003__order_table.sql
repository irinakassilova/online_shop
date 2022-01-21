CREATE TABLE baskets (
                         id serial PRIMARY KEY,
                         count INT,
                         product_id INT NOT NULL,
                         CONSTRAINT fk_product_id
                             FOREIGN KEY (product_id)
                                 REFERENCES products(id)
                                 ON DELETE  RESTRICT
                                 ON UPDATE  CASCADE

);

CREATE TABLE orders (
                        id serial PRIMARY KEY,
                        address VARCHAR(500) NOT NULL,
                        phone VARCHAR(128) NOT NULL,
                        basket_id INT NOT NULL,
                        CONSTRAINT fk_basket_id
                            FOREIGN KEY (basket_id)
                                REFERENCES baskets(id)
                                ON DELETE  RESTRICT
                                ON UPDATE  CASCADE

);
