
create database fornecedor


use fornecedor



CREATE TABLE fornecedor (
ID Varchar(15) PRIMARY KEY,
MEI VARCHAR (20) not null unique,
CNPJ varchar(25) not null unique,
Codigodoproduto varchar (28)not null unique,
Telefone Varchar(15),
Peso varchar(20),
Nempresa Varchar(30),
Endereço varchar(55),
Preço int not null
)