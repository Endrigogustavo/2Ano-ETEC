create database Produto


use Produto



CREATE TABLE produt(
CodigoProduto Varchar(15) PRIMARY KEY,
NomeProduto VARCHAR (30),
Materialproduto VARCHAR (20),
Cor Varchar(20),
Marca varchar (25) not null unique,
Quantidade int,
DatadeFabricação datetime,
Preço int

)