-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Abr-2023 às 19:33
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_escola`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunos`
--

CREATE TABLE `alunos` (
  `Matricula` int(5) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Cidade` varchar(30) NOT NULL,
  `CodCurso` varchar(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `alunos`
--

INSERT INTO `alunos` (`Matricula`, `Nome`, `Endereco`, `Cidade`, `CodCurso`) VALUES
(10001, 'Marcos Moraes', ' Rua Pe Roque, 2057', 'Mogi Mirim', '01'),
(10002, 'Maria Conceição Lopes', 'Rua Araras, 23 ', 'Mogi Guaçu', '01'),
(10003, 'Ana Carina Lopes', 'Rua Peraltas, 222 ', 'Santos', ' 0'),
(10004, 'Carlos Aguiar', 'Rua Botafogo, 33', 'Santos', '01'),
(10005, 'André Luiz dos Santos', 'Rua Lopes Conte, 3343', 'Sapucaí', '01'),
(10006, 'Pedro Antonio Pimenta', 'Rua Altair Lopes, 33', 'Itapira', '02'),
(10007, 'Rita de Cássia da Silva', 'Rua Eletromais, 33', 'Itapira', '02'),
(10008, 'Caique dos Santos', 'Rua das Amoreiras, 55', 'Campinas', '02'),
(10009, 'Carlos Tavares', 'Rua Peixe, 99', 'Santos', '02'),
(10010, 'Antonio Carlos Caetano', 'Rua Josefina Alface, 987 ', 'Campinas', '02'),
(10011, 'Ricardo Moreira', 'Rua do Pinhal, 332 ', 'Aparecida', '03'),
(10012, 'Richardson S. P. Campeao ', 'Rua do Tricolor, 433', 'São Paulo', '03'),
(10013, 'Junior Camisa Seis', 'Rua do Morumbi, 433 ', 'São Paulo', '03'),
(10014, 'Carina Melo', 'Rua Osvaldo Ramos, 88', 'Mogi Guaçu', '03'),
(10015, 'Pedro Mello', 'Rua Itororó, 3999', 'Mogi Mirim', '03');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cursos`
--

CREATE TABLE `cursos` (
  `CodCurso` int(2) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Coddisc1` varchar(2) NOT NULL,
  `Coddisc2` varchar(2) NOT NULL,
  `Coddisc3` varchar(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cursos`
--

INSERT INTO `cursos` (`CodCurso`, `Nome`, `Coddisc1`, `Coddisc2`, `Coddisc3`) VALUES
(1, 'Auxiliar de Informática', '11', '12', '13'),
(2, 'Programador de computadores', '21', '22', '23'),
(3, 'Técnico de Informática', '31', '32', '33');

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `CodDisciplina` int(11) NOT NULL,
  `NomeDisciplina` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`CodDisciplina`, `NomeDisciplina`) VALUES
(11, 'Banco de dados'),
(12, 'Logística de programação'),
(13, 'Desenvolvedor de software 1'),
(21, 'Banco de dados 2'),
(22, 'Desenvolvedor de software 2'),
(23, 'Programação de computadores 1'),
(31, 'Banco de dados 2'),
(32, 'Programação de computadores 2'),
(33, 'Desenvolvimento de software 3');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`Matricula`);

--
-- Índices para tabela `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`CodCurso`);

--
-- Índices para tabela `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`CodDisciplina`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `alunos`
--
ALTER TABLE `alunos`
  MODIFY `Matricula` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10016;

--
-- AUTO_INCREMENT de tabela `cursos`
--
ALTER TABLE `cursos`
  MODIFY `CodCurso` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
