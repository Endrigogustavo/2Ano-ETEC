<?php

include_once 'Conectar.php';

// parte 1 - atributos
class Livro
{
    private $Cod_livro;
    private $Titulo;
    private $Categoria;
    private $ISBN;
    private $Idioma;
    private $QtdePag;
    private $conn;

// parte 2 - os gettes e setter

   public function getCod_Livro() {
         return $this->cod_li;
   }

   public function setCod_livro($codli) {
    $this->cod_li = $codli;
   }

   public function getTitulo() {
          return $this->titulo;
   }

   public function setTitulo ($title) {
    $this->titulo= $title;
   }

   public function getCategoria() {
          return $this->categoria;
   }

   public function setCategoria($catego) {
    $this->categoria= $catego;
   }

   public function getISBN() {
    return $this->Isbn;
   }

    public function setISBN($isbn) {
    $this->Isbn= $isbn;
    }
    
   public function getIdioma() {
    return $this->idioma;
   }

    public function setIdioma($idio) {
    $this->idioma= $idio;
    }
    
   public function getQtdePag() {
    return $this->Qtdepag;
   }

    public function setQtdePag($qtdepag) {
    $this->Qtdepag= $qtdepag;
    }

   function listar()
   {
       try
       {
           $this-> conn = new Conectar();
           $sql = $this->conn->query("select * from livro order by Cod_livro");
           $sql->execute();
           return $sql->fetchAll();
           $this->conn = null;
       }
       catch(PDOException $exc)
       {
        echo "Erro ao executar consulta. " . $exc->getMessage();
       }
   }
} //encerramento ed classe Livro
?>