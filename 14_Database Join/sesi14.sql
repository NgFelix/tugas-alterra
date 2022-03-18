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
updated_at timestamp
);

create table product(
ID int auto_increment primary key,
product_type_id int,
operator_id int,
code varchar(50),
nama varchar(100),
status smallint,
created_at timestamp,
updated_at TIMESTAMP
);

create table product_types(
ID int not null auto_increment primary key,
name VARCHAR(255),
created_at timestamp,
updated_at TIMESTAMP
);

create table product_description(
ID int not null auto_increment primary key,
description TEXT,
created_at timestamp,
updated_at TIMESTAMP
);

create table operator(
ID int  not null auto_increment primary key,
name VARCHAR(255),
created_at TIMESTAMP,
updated_at TIMESTAMP
);

CREATE TABLE transaction(
ID int not null auto_increment primary key,
User_Id int,
Payment_Method_id int,
status varchar(10),
total_qty int(11),
total_price numeric(25,2),
created_at timestamp,
updated_at timestamp
);

CREATE TABLE transaction_detail(
ID int not null auto_increment primary key,
status varchar(10),
qty int(11),
price numeric(25,2),
created_at timestamp,
updated_at timestamp
);

CREATE TABLE payment_methods(
ID int not null auto_increment primary key,
name varchar(255),
status smallint,
created_at timestamp,
updated_at timestamp
);

-- insert
-- operator
INSERT INTO operator (name, created_at, updated_at)
VALUES ('Telkomsel', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO operator (name, created_at, updated_at)
VALUES ('XL', '2022-03-20 17:00:01', '2022-03-20 18:01:01');
INSERT INTO operator (name, created_at, updated_at)
VALUES ('Indosat', '2022-03-20 17:00:02', '2022-03-20 18:01:02');
INSERT INTO operator (name, created_at, updated_at)
VALUES ('Smartfren', '2022-03-20 17:00:03', '2022-03-20 18:01:03');
INSERT INTO operator (name, created_at, updated_at)
VALUES ('Esia', '2022-03-20 17:00:04', '2022-03-20 18:01:04');

SELECT * FROM operator;

-- product type
INSERT INTO product_types (name, created_at, updated_at)
VALUES ('Promo', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_types (name, created_at, updated_at)
VALUES ('Kuota Malam', '2022-03-20 17:00:01', '2022-03-20 18:01:01');
INSERT INTO product_types (name, created_at, updated_at)
VALUES ('Kuota ketengan', '2022-03-20 17:00:02', '2022-03-20 18:01:02');

SELECT * FROM product_types;

-- 2 product dengan product type id = 1, op id  = 3
INSERT INTO product (product_type_id, operator_id, code, nama, status, created_at, updated_at)
VALUES ('1', '3', '1001', 'Promo harian', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, created_at, updated_at)
VALUES ('1', '3', '1002', 'Promo mingguan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- 3 product dengan product type id = 2, op id  = 1
INSERT INTO product (product_type_id, operator_id, code, nama, status, created_at, updated_at)
VALUES ('2', '1', '1003', 'Kuota malam harian', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, created_at, updated_at)
VALUES ('2', '1', '1004', 'Kuota malam mingguan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, created_at, updated_at)
VALUES ('2', '1', '1005', 'Kuota malam bulanan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- 3 product dengan product type id = 3, op id  = 4
INSERT INTO product (product_type_id, operator_id, code, nama, status, created_at, updated_at)
VALUES ('3', '4', '1006', 'Kuota ketengan harian', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, created_at, updated_at)
VALUES ('3', '4', '1007', 'Kuota ketengan mingguan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product (product_type_id, operator_id, code, nama, status, created_at, updated_at)
VALUES ('3', '4', '1008', 'Kuota ketengan bulanan', '01', '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- insert product desc pada setiap product
INSERT INTO product_description(description, created_at, updated_at)
VALUES('Promo harian harga terjangkau',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, created_at, updated_at)
VALUES('Promo mingguan harga terjangkau',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, created_at, updated_at)
VALUES('Promo kuota malam harian harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, created_at, updated_at)
VALUES('Promo kuota malam mingguan harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, created_at, updated_at)
VALUES('Promo kuota malam bulanan harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, created_at, updated_at)
VALUES('Promo kuota ketengan harian harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, created_at, updated_at)
VALUES('Promo kuota ketengan mingguan harga terjangkau',   '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO product_description(description, created_at, updated_at)
VALUES('Promo kuota ketengan bulanan harga terjangkau',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
SELECT * FROM product_description;


-- insert payment method
INSERT INTO payment_methods(name, status, created_at, updated_at)
VALUE('Gopay', 1,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO payment_methods(name, status, created_at, updated_at)
VALUE('Grab', 1, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO payment_methods(name, status, created_at, updated_at)
VALUE('Shopee', 1, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
SELECT * FROM payment_methods;

-- insert user
INSERT INTO users(Name, status, dob, gender, created_at, updated_at)
VALUES('leo', 1, '2001-4-4', 'M',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO users(Name, status, dob, gender, created_at, updated_at)
VALUES('jona', 1, '2000-3-2', 'M',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO users(Name, status, dob, gender, created_at, updated_at)
VALUES('felix', 1, '2001-5-7', 'M', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO users(Name, status, dob, gender, created_at, updated_at)
VALUES('aro', 1, '2001-7-9', 'M',  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO users(Name, status, dob, gender, created_at, updated_at)
VALUES('will', 1, '2001-2-8', 'M', '2022-03-20 17:00:00', '2022-03-20 18:01:00');
SELECT * FROM users;

-- INSERT  3 TRANSAKSI DI MASING" USER
-- TRANSACTION USER ID 1
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(1, 1, 1, 2, 30.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(1, 1, 1, 2, 20.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(1, 1, 1, 2, 20.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- TRANSACTION USER ID 2
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(2, 2, 1, 2, 20.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(2, 2, 1, 2, 20.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(2, 2, 1, 2, 20.000,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- TRANSACTION USER ID 3
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(3, 2, 1, 1, 50.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(3, 2, 1, 1, 50.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(3, 2, 1, 1, 10.000,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- TRANSACTION USER ID 4
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(4, 1, 1, 1, 40.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(4, 1, 1, 1, 40.000,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(4, 1, 1, 1, 40.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- TRANSACTION USER ID 5
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(5, 1, 1, 3, 50.000,  '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(User_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(5, 1, 1, 3, 50.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');
INSERT INTO transaction(UUser_ID, payment_methods_ID, status, total_qty, total_price, created_at, updated_at)
VALUES(5, 1, 1, 3, 50.000, '2022-03-20 17:00:00', '2022-03-20 18:01:00');

-- select
SELECT name , gender FROM users WHERE gender = 'M';
SELECT * FROM product WHERE ID = 3;
SELECT * FROM users WHERE created_at BETWEEN '2022-03-9 11:00:00' AND '2022-03-16 11:00:00' OR name LIKE '%a%';
SELECT name , gender FROM users WHERE gender = 'F';
SELECT * FROM users ORDER BY Name ASC;
select * from product where ID between 1 and 5;


-- update
-- 1
UPDATE product SET nama = 'product dummy' WHERE id = 1;
-- 2
UPDATE transaction_detail SET qty = 3 WHERE product_id = 1;

-- delete
--1 
DROP TABLE product WHERE id = 1;
DROP TABLE product WHERE product_type_id = 1;

-- join
-- 1
SELECT * FROM transaction WHERE user_id = 1 UNION SELECT * FROM transaction WHERE user_id = 2;
-- 2 
SELECT SUM(total_price) FROM transaction WHERE user_id = 1;
-- 3
SELECT COUNT(1) FROM transaction_detail WHERE product_id = 2;
--4
SELECT * FROM product INNER JOIN product type ON product.product_type id
= product_type. id
--5
SELECT t.*, product.nama, users.nama FROM transaction t INNER JOIN
trasaction detail d ON t.id = d. transaction id INNER JOIN product p ON p.id
d.product_id INNER JOIN users
u ON u.id = t.user id;

--6
DELIMITER $$
CREATE TRIGGER user delete BEFORE ON users FOR EACH ROW BEGIN
DELETE FROM product WHERE user id = old.id;
END$$
--7
DELIMITER $$
CREATE TRIGGER transaksi_details_delete
AFTER DELETE ON transaction_details FOR EACH ROW
BEGIN
UPDATE FROM transactions SET total_qty = total_qty - old.qty;
UPDATE FROM transactions SET total_price = total_price - old.price;
END$$