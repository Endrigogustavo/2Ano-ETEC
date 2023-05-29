<?php

include_once 'Conectar.php';

// parte 1 - atributos
class Autor
{
    private $Cod_Autor;
    private $NomeAutor;
    private $sobrenome;
    private $email;
    private $nasc;
    private $conn;

// parte 2 - os gettes e setter

   public function getCod_Autor() {
         return $this->cod_aut;
   }

   public function setCod_Autor($codaut) {
    $this->cod_aut = $codaut;
   }

   public function getNomeAutor() {
          return $this->nomeautor;
   }

   public function setNomeAutor ($nautor) {
    $this->nomeautor= $nautor;
   }

   public function getSobrenome() {
          return $this->sobrenome;
   }

   public function setSobrenome($sobre) {
    $this->sobrenome= $sobre;
   }

   public function getemail() {
    return $this->Email;
   }

    public function setemail($emal) {
    $this->Email= $emal;
    }
    
   public function getNasc() {
    return $this->nasc;
   }

    public function setNasc($nascimento) {
    $this->nasc= $nascimento;
    }

   function listar()
   {
       try
       {
           $this-> conn = new Conectar();
           $sql = $this->conn->query("select * from autor order by Cod_Autor");
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