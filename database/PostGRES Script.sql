CREATE DATABASE project1;

CREATE SCHEMA projectgenius;


CREATE TABLE projectgenius.employee_info (
employee_id SERIAL NOT NULL,
employee_first_name VARCHAR(20) NOT NULL,
employee_last_name VARCHAR(20) NOT NULL,
phone_number NUMERIC(10) NOT NULL, 
email varchar(50) UNIQUE NOT NULL,
user_password varchar(20) NOT NULL
);

DROP TABLE projectgenius.employeeinfo;

CREATE TABLE projectgenius.employee_reimbursements(
reimb_id SERIAL,
reimb_amount NUMERIC (10, 2) NOT NULL,
submit_time TIMESTAMP
);


