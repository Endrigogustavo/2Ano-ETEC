<?php

include_once 'Conectar.php';

// parte 1 - atributos
class Produto
{
    private $id;
    private $nome;
    private $estoque;
    private $conn;

// parte 2 - os gettes e setter

   public function getId() {
         return $this->id;
   }

   public function setId($iid) {
    $this->id = $idd;
   }

   public function getNome() {
          return $this->nome;
   }

   public function setNome ($name) {
    $this->nome= $name;
   }

   public function getEstoque() {
          return $this->estoque;
   }

   public function setEstoque($estoqui) {
    $this->estoque= $estoqui;
   }


   function listar()
   {
       try
       {
           $this-> conn = new Conectar();
           $sql = $this->conn->query("select * from produtos order by nome");
           $sql->execute();
           return $sql->fetchAll();
           $this->conn = null;
       }
       catch(PDOException $exc)
       {
        echo "Erro ao executar consulta. " . $exc->getMessage();
       }
   }
} //encerramento ed classe Produto
?>