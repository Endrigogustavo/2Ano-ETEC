<?php
include_once 'Conectar.php';

//parte 1 - atributos

class Produto{
    private $id;
    private $nome;
    private $estoque;
    private $conn;

    // parte 2 - os getters e setters
    function getId(){
        return $this->id;
    } 
    function setId($iid){
        $this->id = $iid;
    }
    function getNome(){
        return $this->nome;
    } 
    function setNome($name){
        $this->nome = $name;
    }
    function getEstoque(){
        return $this->estoque;
    } 
    function setEstoque($estoqui){
        $this->estoque = $estoqui;
    }
    
    // parte 3 - métodos
    function salvar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("insert into produto values (null,?,?)");
            @$sql->bindParam(1, $this->getNome(), PDO::PARAM_STR);
            @$sql->bindParam(2, $this->getEstoque(), PDO::PARAM_STR);
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
            $sql = $this->conn->query("Select * from produto order by nome");
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
            $sql = $this->conn->prepare("delete from produto where id = ?");
            @$sql-> bindParam(1, $this->getId(), PDO::PARAM_STR);
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
            $sql = $this->conn->prepare("Select * from produto where nome like ?");
            @$sql-> bindParam(1, $this->getNome(), PDO::PARAM_STR);
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao consultar. " . $exc->getMessage();
        }
    }


}
?>
