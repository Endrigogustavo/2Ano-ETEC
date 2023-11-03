<?php
include_once 'Conectar.php';

//parte 1 - atributos

class Usuario{
    private $usu;
    private $senha;
  
    private $conn;

    // parte 2 - os getters e setters
    function getUsu(){
        return $this->usu;
    } 
    function setUsu($usuu){
        $this->usu = $usuu;
    }
    function getSenha(){
        return $this->senha;
    } 
    function setSenha($senha){
        $this->senha = $senha;
    }

    // parte 3 - métodos

    function logar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("Select * from user where login like ? and senha = ?");
            @$sql->bindParam(1, $this->getUsu(), PDO::PARAM_STR);
            @$sql->bindParam(2, $this->getSenha(), PDO::PARAM_STR);
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao executar consulta. " . $exc->getMessage();
        }
    }
}

 ?>