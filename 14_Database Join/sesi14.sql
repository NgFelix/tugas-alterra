-- CREATE DATABASE
CREATE DATABASE alta_online_shop;
USE alta_online_shop;

-- CREATE TABLE
create table users(
ID int not null auto_increment primary key,
Name varchar(255),
status smallint,
dob date,
gender char(1),
created_at timestamp,
update_at timestamp
);

create table product(
ID int auto_increment primary key,
product_type_id int,
operator_id int,
code varchar(50),
nama varchar(100),
status smallint,
create_at timestamp,
update_at TIMESTAMP
);

create table product_types(
ID int not null auto_increment primary key,
name VARCHAR(255),
create_at timestamp,
update_at TIMESTAMP
);

create table product_description(
ID int not null auto_increment primary key,
description TEXT,
create_at timestamp,
update_at TIMESTAMP
);

create table operator(
ID int  not null auto_increment primary key,
name VARCHAR(255),
create_at TIMESTAMP,
update_at TIMESTAMP
);

CREATE TABLE transaction(
ID int not null auto_increment primary key,
User_Id int,
Payment_Method_id int,
status varchar(10),
total_qty int(11),
total_price numeric(25,2),
created_at timestamp,
uptdae_at timestamp
);

CREATE TABLE transaction_detail(
ID int not null auto_increment primary key,
status varchar(10),
qty int(11),
price numeric(25,2),
created_at timestamp,
uptdae_at timestamp
);

CREATE TABLE payment_methods(
ID int not null auto_increment primary key,
name varchar(255),
status smallint,
created_at timestamp,
update_at timestamp
);

-- insert
-- operator
INSERT INTO operator (name, create_at, update_at)
VALUES ('Telkomsel', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO operator (name, create_at, update_at)
VALUES ('XL', '2022-03-20 17:00:01', '2022-03-20 18:01:01');
INSERT INTO operator (name, create_at, update_at)
VALUES ('Indosat', '2022-03-20 17:00:02', '2022-03-20 18:01:02');
INSERT INTO operator (name, create_at, update_at)
VALUES ('Smartfren', '2022-03-20 17:00:03', '2022-03-20 18:01:03');
INSERT INTO operator (name, create_at, update_at)
VALUES ('Esia', '2022-03-20 17:00:04', '2022-03-20 18:01:04');

SELECT * FROM operator;

-- product type
INSERT INTO product_types (name, create_at, update_at)
VALUES ('Promo', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_types (name, create_at, update_at)
VALUES ('Kuota Malam', '2022-03-20 17:00:01', '2022-03-20 18:01:01');
INSERT INTO product_types (name, create_at, update_at)
VALUES ('Kuota ketengan', '2022-03-20 17:00:02', '2022-03-20 18:01:02');

SELECT * FROM product_types;

-- 2 product dengan product type id = 1, op id  = 3
INSERT INTO product (product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES ('1', '3', '1001', 'Promo harian', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES ('1', '3', '1002', 'Promo mingguan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- 3 product dengan product type id = 2, op id  = 1
INSERT INTO product (product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES ('2', '1', '1003', 'Kuota malam harian', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES ('2', '1', '1004', 'Kuota malam mingguan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES ('2', '1', '1005', 'Kuota malam bulanan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- 3 product dengan product type id = 3, op id  = 4
INSERT INTO product (product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES ('3', '4', '1006', 'Kuota ketengan harian', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES ('3', '4', '1007', 'Kuota ketengan mingguan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, create_at, update_at)
VALUES ('3', '4', '1008', 'Kuota ketengan bulanan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- insert product desc pada setiap product
INSERT INTO product_description(description, create_at, update_at)
VALUES('Promo harian harga terjangkau',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, create_at, update_at)
VALUES('Promo mingguan harga terjangkau',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, create_at, update_at)
VALUES('Promo kuota malam harian harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, create_at, update_at)
VALUES('Promo kuota malam mingguan harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, create_at, update_at)
VALUES('Promo kuota malam bulanan harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, create_at, update_at)
VALUES('Promo kuota ketengan harian harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, create_at, update_at)
VALUES('Promo kuota ketengan mingguan harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, create_at, update_at)
VALUES('Promo kuota ketengan bulanan harga terjangkau',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
SELECT * FROM product_description;


-- insert payment method
INSERT INTO payment_methods(name, status, created_at, update_at)
VALUE('Gopay', 1,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO payment_methods(name, status, created_at, update_at)
VALUE('Grab', 1, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO payment_methods(name, status, created_at, update_at)
VALUE('Shopee', 1, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
SELECT * FROM payment_methods;

-- insert user
INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('leo', 1, '2001-4-4', 'M',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('jona', 1, '2000-3-2', 'M',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('felix', 1, '2001-5-7', 'M', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('aro', 1, '2001-7-9', 'M',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO users(Name, status, dob, gender, created_at, update_at)
VALUES('will', 1, '2001-2-8', 'M', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
SELECT * FROM users;

-- INSERT  3 TRANSAKSI DI MASING" USER
-- TRANSACTION USER ID 1
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(1, 1, 1, 2, 30.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(1, 1, 1, 2, 20.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(1, 1, 1, 2, 20.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- TRANSACTION USER ID 2
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(2, 2, 1, 2, 20.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(2, 2, 1, 2, 20.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(2, 2, 1, 2, 20.000,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- TRANSACTION USER ID 3
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(3, 2, 1, 1, 50.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(3, 2, 1, 1, 50.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(3, 2, 1, 1, 10.000,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- TRANSACTION USER ID 4
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(4, 1, 1, 1, 40.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(4, 1, 1, 1, 40.000,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(4, 1, 1, 1, 40.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- TRANSACTION USER ID 5
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(5, 1, 1, 3, 50.000,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(5, 1, 1, 3, 50.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(UUser_ID, payment_methods_ID, status, total_qty, total_price, created_at, update_at)
VALUES(5, 1, 1, 3, 50.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');



