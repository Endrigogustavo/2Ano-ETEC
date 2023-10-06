<?php
include_once 'Conectar.php';

//parte 1 - atributos

class Produto{
    private $id_autor;
    private $nome;
    private $sobre;
    private $email;
    private $nas;
    private $conn;

    // parte 2 - os getters e setters
    function getid_autor(){
        return $this->id_autor;
    } 
    function setid_autor($iid_autor){
        $this->id_autor = $iid_autor;
    }
    function getsobre(){
        return $this->sobre;
    } 
    function setsobre($sobre){
        $this->sobre = $sobre;
    }
    function getemail(){
        return $this->email;
    } 
    function setemail($emaill){
        $this->email = $emaill;
    }
    function getnas(){
        return $this->nas;
    } 
    function setnas($nass){
        $this->nas = $nass;
    }
    function getname(){
        return $this->nome;
    } 
    function setname($nomee){
        $this->nome = $nomee;
    }
    
    
    // parte 3 - métodos

    function salvar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("insert into autor values (null,?,?,?,?)");
            @$sql->bindParam(1, $this->getid_autor(), PDO::PARAM_STR);
            @$sql->bindParam(2, $this->getsobre(), PDO::PARAM_STR);
            @$sql->bindParam(3, $this->getemail(), PDO::PARAM_STR);
            @$sql->bindParam(4, $this->getnas(), PDO::PARAM_STR);
            if($sql->execute() == 1){
                return "Registro salvo com sucesso!";
            }
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao salvar o Registro. " . $exc->getMessage();
        }
    }
    function listar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->query("Select * from autor order by NomeAutor");
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao executar consulta. " . $exc->getMessage();
        }
    }
    function exclusao(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("delete from autor where Cod_Autor = ?");
            @$sql-> bindParam(1, $this->getid_autor(), PDO::PARAM_STR);
            if($sql->execute() == 1){
                return "Excluido com sucesso!";
            }
            else{
                return "Erro ao excluir";
            }
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao excluir o Registro. " . $exc->getMessage();
        }
    }
    

    function consultar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("Select * from autor where NomeAutor like ?");
            @$sql-> bindParam(1, $this->getsobre(), PDO::PARAM_STR);
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao consultar. " . $exc->getMessage();
        }
    }


    function alterar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("Select * from autor where Cod_Autor = ?");
            @$sql-> bindParam(1, $this->getid_autor(), PDO::PARAM_STR);
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao alterar. " . $exc->getMessage();
        }
    }

    function alterar2(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("update autor set NomeAutor = ?, Nasc = ?, email = ? where Cod_Autor = ?");
            @$sql-> bindParam(1, $this->getname(), PDO::PARAM_STR);
            @$sql-> bindParam(2, $this->getnas(), PDO::PARAM_STR);
            @$sql-> bindParam(3, $this->getemail(), PDO::PARAM_STR);
            @$sql-> bindParam(4, $this->getid_autor(), PDO::PARAM_STR);
            $sql->execute();
            if($sql->execute() == 1){

                return "Registro alterado com sucesso!";

            }
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao alterar registro. " . $exc->getMessage();
        }
    }


}
?>
