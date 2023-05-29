<?php

include_once 'Conectar.php';

// parte 1 - atributos
class Autoria
{
    private $Cod_autor;
    private $Cod_livro;
    private $DataLancamento;
    private $Editora;
    private $conn;

// parte 2 - os gettes e setter

   public function getCod_autor() {
         return $this->cod_aut;
   }

   public function setCod_autor($codaut) {
    $this->cod_aut = $codaut;
   }

    public function getCod_livro() {
    return $this->cod_li;
    }

   public function setCod_livro($codli) {
   $this->cod_li = $codli; 
   }

   public function getDataLancamento() {
          return $this->datalan;
   }

   public function setDatalancamento($datal) {
    $this->datalan= $datal;
   }

   public function getEditora() {
    return $this->editora;
   }

    public function setEditora($edit) {
    $this->editora= $edit;
    }

   function listar()
   {
       try
       {
           $this-> conn = new Conectar();
           $sql = $this->conn->query("select * from autoria order by Editora");
           $sql->execute();
           return $sql->fetchAll();
           $this->conn = null;
       }
       catch(PDOException $exc)
       {
        echo "Erro ao executar consulta. " . $exc->getMessage();
       }
   }
} //encerramento ed classe Autor
?>