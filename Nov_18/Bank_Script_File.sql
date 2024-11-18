drop database if exists hexabank;

create database hexabank;

use hexabank;

Create Table Bank
(
   AccountNo INT primary key,
   FirstName varchar(30),
   LastName varchar(30),
   City varchar(30),
   State varchar(30),
   Amount double,
   CheqFacil varchar(10),
   AccountType varchar(20),
   Status varchar(10) default 'active',
   DateOfOpen TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

Create Table Trans
(
      AccountNo int,
      TransAmount numeric(9,2),
      TransDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      TransType varchar(10)
);