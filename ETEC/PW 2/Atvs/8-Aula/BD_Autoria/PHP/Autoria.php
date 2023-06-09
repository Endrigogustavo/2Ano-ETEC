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
    function seteditoria($neditoriaa){
        $this->editoria = $editoriaa;
    }
    
    
    // parte 3 - métodos

    function salvar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("insert into produto values (null,?,?)");
            $sql->bindParam(1, $this->getNome(), PDO::PARAM_STR);
            $sql->bindParam(2, $this->getEstoque(), PDO::PARAM_STR);
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
            $sql = $this->conn->query("Select * from autoria order by editoria");
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao executar consulta. " . $exc->getMessage();
        }
    }
}
?>
