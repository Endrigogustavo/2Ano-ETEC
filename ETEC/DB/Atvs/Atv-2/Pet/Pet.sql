--criacao de banco de dados
create database ExercBD01

--abrindo um canco de dados
use ExercBD01

--criando um tabela

CREATE TABLE pet (
NUMregistro int,-- campo nome
Nome VARCHAR (80), --campo inserçao de registro
Especie VARCHAR (50), -- campo especie
Raça varchar (30), -- campo raça
cor varchar (40),-- campo cor
nascimento datetime,-- campo0 especie
sexo varchar(1)-- campo0 especie

)

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (1,'danilo','cachorro','pincher','marrom','11/02/1800','F');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (2,'alex','cachorro','salsicha','branco','16/10/1980','F');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (3,'pedro','cachorro','dalmata','preto','1/09/1890','F');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (3,'nickolas','papagaio','arara','laranja','30/02/2000','M');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (4,'endrigo','gato','siames','marrom','19/12/2000','M');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (5,'felix','gato','europeu','cinza','01/01/1800','M');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (6,'thor','cachorro','rothiler','preto','26/04/2007','F');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (7,'bruno','raposa','neves','branco','11/02/1901','M');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (8,'dandan','gato','siames','marrom','11/02/1800','F');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (9,'paulinho','gato','persa','rosa','11/02/1800','F');

insert into pet (NUMregistro, Nome, Especie, Raça, cor ,nascimento ,sexo)
values (10,'leandro','cachorro','viralata','laranja','16/12/2014','M');
SELECT *from pet
