-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 17-Abr-2023 às 20:35
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
-- Banco de dados: `bd_empresa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE `fornecedores` (
  `Cod_Fornecedor` int(11) NOT NULL,
  `Razao_Social` varchar(70) NOT NULL,
  `Nome_Fantasia` varchar(70) NOT NULL,
  `CNPJ` varchar(20) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Num` varchar(7) NOT NULL,
  `Bairro` varchar(25) NOT NULL,
  `Cidade` varchar(25) NOT NULL,
  `Fone` varchar(18) NOT NULL,
  `Nome_Contato` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Site` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`Cod_Fornecedor`, `Razao_Social`, `Nome_Fantasia`, `CNPJ`, `Endereco`, `Num`, `Bairro`, `Cidade`, `Fone`, `Nome_Contato`, `Email`, `Site`) VALUES
(1, 'Comercio de papeis yuki Ltda', 'Yuki Papéis', '03.847.655/0001-98', 'Rua das Ameixeiras', '21', 'Penha', 'São Paulo', '(11)2695-6398', 'Sr. Pedro ', 'yukiQprovedor.com.br', 'www.github.com/Youki'),
(2, 'Comércio de Papéis ABC Ltda', ' PapelajaABC ', '14.218.835/0001-27', 'Av. Iguapi ', '1690', 'Tatuapé', 'SãoPaulo', '(11) 2369-9685', 'Sra. Beta', 'ABCQprovedor.com.br', 'www.github.com/ABCP'),
(3, 'Distribuidora Kalunga S.A', 'Kalunga ', '23.222.835/0001-07', 'Av.Rio das Pedras', '1752', 'Itaquera', 'São Paulo', '(11) 2596-9656', 'Sr. Marcos ', 'kalungaGQprovedor.com.br', 'www.github.com/Marcos'),
(4, 'Indústria e Comércio Nobel SA', 'Nobel ', '07.256.898/0001-10', 'Rua das Bolhas', '900', 'ltaquera', 'São Paulo', '(11)2475-6598', 'Sr. Paulo', 'nobei&provedor.com.br', 'www.github.com/paulo'),
(5, 'Papelaria Americanas Ltda', 'Americanas ', '01.659.427/0001-04', 'Rua das Ovelhas', '21', 'Pari', 'São Paulo', '(11)2456-9874', 'Sr Antonio', 'americanasQprovedor.com.br', 'www.github.com/Antonio'),
(6, 'Distribuidora Brasileiras S.A.', 'Brasileiras ', '01.326.265/0001-04 ', 'Av. Brasil', '12', 'Brás', 'SãoPaulo', '(11)6598-6958', 'Sra. Paula ', 'brasileirasprovedor.com.br', 'www.github.com/Paula'),
(7, ' Ind e Comércios de Papéis Oi Ltda', 'Papéis Oi', '01.362.126/0001-04 ', 'Av. dos Trilhos', '1362', 'Pari', 'São Paulo', '(11)2365-2154', 'Sra.Ana ', 'PiGprovedor.com.br', 'www.github.com/Ana'),
(8, 'Armarinhos Fernando Ltda', 'Fernando ', '01.956.236/0001-04', 'Alameda Santos', '352', 'Centro', 'São Paulo', '(11)2362-3659', 'Sr Matheus ', 'fernandoQprovedor.com.br', 'www.github.com/Fernande'),
(9, 'Armarinhos Alegria S.A.', 'Alegria ', '14.632.326/0001-14', 'Rua das Fagulhas', '12 ', 'Cambuci', 'São Paulo', '(11) 2362-5487', 'Sr. Alegrete ', 'alegriaQprovedor.com.br', 'www.github.com/Alegrete'),
(10, 'Comércio de Papéis Tchau Ltda', 'Tchau ', '1.659.652/0001-04', 'Alameda dos Anhambiguacas', '326 ', 'Morumbi ', 'São Paulo', '(11) 3265-6958', 'Sr. Berto', 'tehauGQprovedor.com.br', 'www.github.com/Berto');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `Cod_Produto` int(11) NOT NULL,
  `Descricao` varchar(50) NOT NULL,
  `Unidade` varchar(2) NOT NULL,
  `Qtde_Estoque` double NOT NULL,
  `Caracteristica` varchar(50) NOT NULL,
  `Cod_Fornecedor` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`Cod_Produto`, `Descricao`, `Unidade`, `Qtde_Estoque`, `Caracteristica`, `Cod_Fornecedor`) VALUES
(1, 'Caneta', 'un', 100, 'Cor Azul', 2),
(2, 'Caneta', 'un', 85, 'Cor Vermelhor', 2),
(3, 'Caneta', 'un', 60, 'Cor Preta', 2),
(4, 'Lápis', 'un', 150, 'Sem Borracha', 3),
(5, 'Lápis', 'un', 100, 'Com Borracha', 4),
(6, 'Lápis de Cor', 'cx', 25, '12 Cores', 4),
(7, 'Lápis de Cor', 'cx', 50, '24 Cores', 4),
(8, 'Lápis de Cor', 'cx', 35, '36 Cores', 5),
(9, 'Borracha', 'dz', 35, 'Azul/Vermelha', 6),
(10, 'Borracha', 'dz', 25, 'Branca', 7),
(11, 'Papel Sulfite', 'pc', 100, 'Colorido', 8),
(12, 'Caderno Universitaria', 'pc', 25, '1 Materia', 9),
(13, 'Caderno Universitario', 'pc', 150, '10 Materias', 9),
(14, 'Régua', 'un', 250, 'Acrílica - 30 cm', 10),
(15, 'Lapiseira', 'pc', 86, 'Grafite 0.5', 10);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`Cod_Fornecedor`);

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`Cod_Produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  MODIFY `Cod_Fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `Cod_Produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
