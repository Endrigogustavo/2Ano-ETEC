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
}
?>
