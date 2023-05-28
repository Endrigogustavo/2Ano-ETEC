
create database Departamento


use Departamento



CREATE TABLE Departamento (
ID Varchar(15) PRIMARY KEY ,
Loca VARCHAR (50),
Cargos VARCHAR (20),
Chorario Int,
Registro varchar (15) not null unique,
Defetivacao Varchar(20) not null,
Gastos Int,
Setor Varchar(55)

)