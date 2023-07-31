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

//parte 3 - métodos

function salvar()
{
    try{
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("insert into autor values (null,?,?,?,?)");
        @$sql->bindParam(1, $this->getNomeAutor(), PDO::PARAM_STR);
        @$sql->bindParam(2, $this->getSobrenome(), PDO::PARAM_STR);
        @$sql->bindParam(3, $this->getemail(), PDO::PARAM_STR);
        @$sql->bindParam(4, $this->getNasc(), PDO::PARAM_STR);
        if($sql->execute() == 1){
            return "Registro salvo com sucesso!";
        }
        $this->conn = null;
    }
    catch(PDOException $exc)
    {
   echo "Erro ao salvar o Registro. " . $exc->getMessage();
    }
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