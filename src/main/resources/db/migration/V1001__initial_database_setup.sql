create database onlineshop;
CREATE TABLE products (
                          id serial PRIMARY KEY,
                          category_id int NOT NULL,
                          name varchar(128) NOT NULL,
                          image varchar (450),
                          price float NOT NULL,
                          count int NOT NULL,
                          description varchar(280),
                          CONSTRAINT fk_category_id
                              FOREIGN KEY (category_id)
                                  REFERENCES categories(id)
                                  ON DELETE RESTRICT
                                  ON UPDATE CASCADE
);

CREATE TABLE categories (
                            id serial PRIMARY KEY,
                            name varchar(45) NOT NULL DEFAULT 'name category',
                            description varchar(128) DEFAULT NULL
);

INSERT INTO categories (name, description) VALUES ('Laptops', 'Ноутбуки');
INSERT INTO categories (name, description) VALUES ('Smartphones', 'Смартфоны');

INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Smartphones'),
        'Xiaomi Redmi 9A','https://www.technodom.kz/media/catalog/product/9/0/90b3a69db1be2e94f4c0ba5046e628489bdda091_228390_1.jpg',
        52000, 125, '32GB Grey');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Smartphones'),
        'Oppo A53','https://www.technodom.kz/media/catalog/product/9/5/95978ae012f9f351f4dcfbcef96a0252a8c2d499_227806_1.jpg',
        59500, 10, '128GB Mint Cream');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Smartphones'),
        'Vivo Y91C','https://www.technodom.kz/media/catalog/product/1/c/1cf847101fe024ad58ff204cea940efbc9285c06_212687_3.jpg',
        48900, 25, '32GB Fusion Black');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Smartphones'),
        'Samsung Galaxy J3','https://svetofor.info/images/detailed/153/smartfon-samsung-galaxy-j3-2016-sm-j320h-8-gb-ram-15-gb-dual-sim-rst-gold-5.jpg',
        61900, 45, 'SM-J320H 8 Gb (RAM 1,5 Gb) Dual Sim РСТ gold');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Laptops'),
        'Acer Swift 1 SF-113-31-C49D','https://alser.kz/products/41BvID2d/Qa7BcOyl/noutbuk-acer-sf-113-31-c49d-n3350-4gb-ssd-128gb-win10-520x325.jpg',
        181900, 4, 'Intel Celeron N3350/4Gb/128Gb');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Laptops'),
        'Lenovo Z50','https://stat-m7.ms-online.pl/media/cache/gallery/rc/xtwot7ir/images/99/998483/f1255a2bf7a325bc9a47408b10acb28c.jpg',
        161900, 12, 'A10-7300/4GB/1TB/M255DX 2Gb/W10K');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Laptops'),
        'HP 15-DW1013UR i5 1021OU','https://www.technodom.kz/media/catalog/product/d/a/daa69f6d18b01b3bb5135c499c42f4a4a4bec59d_229946_3.jpg',
        260000, 4, '4GB 1000HDD');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Laptops'),
        'HP Pavilion 15-bc527ur','https://nout.kz/upload/iblock/79a/res_f3a1044a7ade9eeb8b528ab2f3857483_full.jpg',
        299900, 6, 'Intel Core i5 9300H 2.4 ГГц, 8 GB RAM, 1000 GB HDD, Nvidia GeForce GTX 1650 + Intel UHD 630, DOS N');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Laptops'),
        'Acer Predator 17 G9-793','https://game-device.com/image/catalog/noutbook/acer/Acer_Predator_17_G9_793_72KS/Acer_Predator_17_G9_793_72KS.jpg',
        689000, 3, '1 Тб HDD, 128 Гб SSD');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Laptops'),
        'ASUS N552VW-FY252T','https://skidka-msk.ru/images/prodacts/sourse/66000/66000056_noutbuk-asus-n552vw-fy252t-15-6-intel-core-i5-6300hq-2-3ggts-12gb-2tb-128gb-ssd-nvidia-geforce-gtx-960m-2048-mb-dvd-rw-windows-10-seryiy-90nb0an1-m03140-90nb0an1-m03140.jpg',
        361900, 11, 'Intel Core i5 6300HQ 2.3ГГц 12Гб 2Тб 128Гб SSD nVidia GeForce GTX 960M - 2048 Мб DVD-RW');
INSERT INTO products (category_id, name, image, price, count, description)
VALUES ((SELECT id FROM categories where name='Laptops'),
        'Lenovo 15.6 ideadpad 320 N4200','https://nazya.com/anyimage/i.ebayimg.com/00/s/MTUwMFgxNTAw/z/Jy0AAOSwi7xd6zKa/$_57.JPG?set_id=8800005007',
        369900, 10, '4GB 1Tb win10');