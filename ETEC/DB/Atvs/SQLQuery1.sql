--criacao de banco de dados
create database teste

--abrindo um canco de dados
use teste

--criando um tabela

CREATE TABLE CLIENTE (
COD_CLI INT PRIMARY KEY NOT NULL,
NOME VARCHAR (50),
SOBRENOME VARCHAR (50)

)

-- criar telefone
alter table CLIENTE add TELEFONE varchar(20)


-- Excluindo uma tabela

drop table CLIENTE

--Excluir banco de dados

drop database teste
