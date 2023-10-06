<?php
include_once 'Conectar.php';

//parte 1 - atributos

class Produto{
    private $cod_autor;
    private $cod_livro;
    private $datalancamento;
    private $editoria;
    private $conn;

    // parte 2 - os getters e setters
    function getcod_autor(){
        return $this->cod_autor;
    } 
    function setcod_autor($ccod_autor){
        $this->cod_autor = $ccod_autor;
    }
    function getcod_livro(){
        return $this->cod_livro;
    } 
    function setcod_livro($ccod_livro){
        $this->cod_livro = $ccod_livro;
    }
    function getdatalancamento(){
        return $this->datalancamento;
    } 
    function setdatalancamento($datalancamentoo){
        $this->datalancamento = $datalancamentoo;
    }
    function geteditoria(){
        return $this->editoria;
    } 
    function seteditoria($editoriaa){
        $this->editoria = $editoriaa;
    }
    
    

    function salvar()
    {
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("insert into autoria values (?,?,?,?)");
            @$sql->bindParam(1, $this->getcod_autor(), PDO::PARAM_STR);
            @$sql->bindParam(2, $this->getcod_livro(), PDO::PARAM_STR);
            @$sql->bindParam(3, $this->getDataLancamento(), PDO::PARAM_STR);
            @$sql->bindParam(4, $this->geteditoria(), PDO::PARAM_STR);
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
    function listar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->query("Select * from autoria order by editoria");
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
            $sql = $this->conn->prepare("delete from autoria where cod_livro = ?");
            @$sql-> bindParam(1, $this->getcod_autor(), PDO::PARAM_STR);
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
            $sql = $this->conn->prepare("Select * from autoria where 	cod_livro like ?");
            @$sql-> bindParam(1, $this->getcod_autor(), PDO::PARAM_STR);
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao consultar. " . $exc->getMessage();
        }
    }


}
?>
