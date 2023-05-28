-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Maio-2023 às 19:39
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
-- Banco de dados: `bd_autoria`
--

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
