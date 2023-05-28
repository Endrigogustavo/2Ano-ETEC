--criacao de banco de dados
create database ExercBD02

--abrindo um canco de dados
use ExercBD02

--criando um tabela

CREATE TABLE departamento (
codfun int,-- campo codfun
NomeDepto VARCHAR (80), --campo depto

)

insert into departamento(codfun, NomeDepto)
values (224, 'Programaçao');

insert into departamento(codfun, NomeDepto)
values (675, 'Administraçao');

insert into departamento(codfun, NomeDepto)
values (253, 'Logistica');

insert into departamento(codfun, NomeDepto)
values (973, 'Recursos Humanos');

insert into departamento(codfun, NomeDepto)
values (315, 'Marketing');


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

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (123, 'endrigo', 224, 6363223, 10000000000000000, '27/03/2023', '26/03/2023', 'M');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (324, 'danilo', 315, 64829047, 2100, '12/09/2009', '26/03/2023', 'F');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (875, 'alex', 675, 6363223, 15555555555555555555555550005555555550, '27/12/2024', '26/01/2003', 'M');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (293, 'pedro', 253, 356749, 1000, '07/03/2002', '06/05/2020', 'M');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (967, 'nickolas', 224, 387455, 1, '09/03/2000', '08/05/1999', 'M');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (987, 'guilherme', 253, 9873645, 10000000000000000, '30/10/2007', '26/07/2003', 'M');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (765, 'bruno', 973, 400289, 800000000000000000000000, '06/08/1945', '11/09/1001', 'M');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (576, 'leandro', 675, 6872435, 2500, '29/05/2021', '26/03/2022', 'M');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (365, 'edna', 973, 6968723, 10000000000000000, '13/012/2000', '20/10/1990', 'F');

insert into funcionario(codfunc ,Nomefunc,codDepto,ramal,salario,dataadmissao, datacadastro, sexo)
values (543, 'igor', 315, 9723654, 10000000000000001, '20/04/1964', '25/12/1999', 'M');


SELECT *from departamento
SELECT *from funcionario