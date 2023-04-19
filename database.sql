
CREATE TABLE IF NOT EXISTS customer(
    customer_id INT NOT NULL PRIMARY KEY,
    customer_name varchar(20),
    customern_pwd varchar(100),
    phone varchar(20)
);


-- retailer and customer (booking from client)
CREATE TABLE IF NOT EXISTS sales(
sales_id char(10) NOT NULL,
customer_id varchar(20) NOT NULL,
sales_date_time timestamp NOT NULL,
recepient_addeess varchar(50),eerrress varchar(50),
recepient_phone varchar(20),
recepient_remark varchar(20),
is_showed boolean NOT NULL DEFAULT TRUE,
PRIMARY KEY(sales_id),
FOREIGN KEY(customer_id) REFERENCES customer(customer_id)
);


ALTER TABLE sales 
MODIFY sales_id INT NOT NULL AUTO_INCREMENT;

-- retailer
CREATE TABLE IF NOT EXISTS vendor (
    vendor_id int NOT NULL PRIMARY Key,
    vendor_name varchar(20),
    email varchar(50),
    contact varchar(20),
    bank_id varchar(20),
    bank_name varchar(20),
    bank_account varchar(20)
);

-- item 
CREATE TABLE IF NOT EXISTS item (
    item_id INT NOT NULL PRIMARY KEY,
    picture varchar(50),
    price INT NOT NULL,
    size varchar(20),
    color varchar(20),
    category_id INT,
    added_date date NOT NULL,
    is_on_sale boolean,
    description varchar(50),
    vendor_id int NOT NULL,
    FOREIGN KEY(vendor_id) REFERENCES vendor(vendor_id) on delete set NULL,
    FOREIGN KEY(category_id) REFERENCES category(category_id)
);

-- to use cateogry for search bar
CREATE TABLE IF NOT EXISTS category (
    category_id INT NOT NULL,
    category_name varchar(20),
    PRIMARY KEY(category_id)
);


CREATE TABLE IF NOT EXISTS admin (
    admin_id INT NOT NULL PRIMARY KEY,
    admin_name varchar(20),
    admin_pwd varchar(100)
);



