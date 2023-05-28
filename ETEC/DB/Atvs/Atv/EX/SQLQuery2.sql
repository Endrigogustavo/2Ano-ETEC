--criacao de banco de dados
create database ExercBD02

--abrindo um canco de dados
use ExercBD02

--criando um tabela

CREATE TABLE departamento (
codfun int,-- campo codfun
NomeDepto VARCHAR (80), --campo depto

)

CREATE TABLE funcionario (
codfunc int,-- campo codfunc
Nomefunc VARCHAR (50), --campo nomefunc
codDepto int, -- campo codDepto
ramal int NULL, -- campo ramal
salario float,-- campo salario
dataadmissao datetime,-- campoo data adimissao
datacadastro datetime,-- campoo data cadastro
sexo varchar(1)-- campo sexo

)