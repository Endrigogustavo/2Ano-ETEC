
create database escola


use escola



CREATE TABLE escola (
Matricula Varchar(15) PRIMARY KEY,
NomeFuncionário  VARCHAR (50),
CargaH int,
Nasci date not null,
Telefone varchar (15)not null unique,
RG Varchar(20) not null unique,
CPF varchar(30) not null unique,
Endereço  Varchar(55) not null unique,
Diploma varchar(20) not null
)