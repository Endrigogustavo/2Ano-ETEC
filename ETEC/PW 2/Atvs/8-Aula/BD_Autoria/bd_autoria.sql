-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 05-Jun-2023 às 04:02
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_autoria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `autor`
--

CREATE TABLE `autor` (
  `Cod_Autor` int(11) NOT NULL,
  `NomeAutor` varchar(30) NOT NULL,
  `Sobrenome` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `Nasc` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `autor`
--

INSERT INTO `autor` (`Cod_Autor`, `NomeAutor`, `Sobrenome`, `email`, `Nasc`) VALUES
(1, 'Machado', 'de Assis', 'machadossis@Hotmail.com', '1839-06-21'),
(2, 'Joanne', 'Rowling', 'joanne.row@gmail.com', '1965-07-31'),
(3, 'Willian', 'Sheakespeare', 'williansh@gmail.com', '1564-04-23'),
(4, 'Stephan', 'Perry', 'residentbevil@umbrella.com', '1970-03-14'),
(5, 'Alex ', 'Hirsch', 'alexdipper@gmail.com', '1985-06-18'),
(6, 'Tatsuki', 'Fujimoto', 'danrandan@yahoo.com.br', '1993-10-10'),
(7, 'Marlon', 'Marques Da Silva', 'marlon.silva52@etec.sp.gov.br', '1983-12-31');

-- --------------------------------------------------------

--
-- Estrutura da tabela `autoria`
--

CREATE TABLE `autoria` (
  `cod_livro` int(11) NOT NULL,
  `cod_autor` int(11) NOT NULL,
  `datalancamento` varchar(10) NOT NULL,
  `editoria` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `autoria`
--

INSERT INTO `autoria` (`cod_livro`, `cod_autor`, `datalancamento`, `editoria`) VALUES
(2, 1, ' 1601-02', 'Editora do Brasil S/'),
(3, 3, '1899', 'Editora do Brasil S/'),
(4, 7, '29 de jane', 'Editora do Brasil S/'),
(4, 7, '29 de jane', 'Editora do Brasil S/'),
(2, 3, ' 1601-02', 'Editora do Brasil S/'),
(1, 7, '1591 e 159', 'Editora do Brasil S/'),
(3, 1, '1899', 'Editora do Brasil S/'),
(1, 3, '1591 e 159', 'Editora do Brasil S/');

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `Cod_livro` int(11) NOT NULL,
  `Titulo` varchar(40) NOT NULL,
  `Categoria` varchar(30) NOT NULL,
  `ISBN` varchar(17) NOT NULL,
  `Idioma` varchar(30) NOT NULL,
  `QtdePag` int(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `livro`
--

INSERT INTO `livro` (`Cod_livro`, `Titulo`, `Categoria`, `ISBN`, `Idioma`, `QtdePag`) VALUES
(1, 'As 48 leis do poder', 'Filosofia', '978-85-8302-040-0', 'Português', 120),
(2, 'O Diário Perdido de Gravity Falls', 'Fantasia', '965-98-4172-143-8', 'Português', 288),
(3, 'Espíritos De Fato Existem?', 'Filosofia', '923-08-8734-365-7', 'Português', 150),
(4, 'Harry Potter e a Pedra Filosofal', 'Fantasia', '875-54-9672-366-6', 'Português', 264),
(5, 'Resident Evil Code:Veronica', 'Terror', '167-23-2857-534-7', 'Português', 78);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
