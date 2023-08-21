<?php
include_once 'Conectar.php';

//parte 1 - atributos

class Produto{
    private $Cod_livro;
    private $Titulo;
    private $Categoria;
    private $ISBN;
    private $Idioma;
    private $QtdePag;
    private $conn;

    // parte 2 - os getters e setters
    function getCod_livro(){
        return $this->Cod_livro;
    } 
    function setCod_livro($iCod_livro){
        $this->Cod_livro = $iCod_livro;
    }
    function getTitulo(){
        return $this->Titulo;
    } 
    function setTitulo($Titulo){
        $this->Titulo = $Titulo;
    }
    function getCategoria(){
        return $this->Categoria;
    } 
    function setCategoria($Categoriaa){
        $this->Categoria = $Categoriaa;
    }
    function getISBN(){
        return $this->ISBN;
    } 
    function setISBN($ISBNs){
        $this->ISBN = $ISBNs;
    }
    function getIdioma(){
        return $this->Idioma;
    } 
    function setIdioma($Idiomas){
        $this->Idioma = $Idiomas;
    }
    function getQtdePag(){
        return $this->QtdePag;
    } 
    function setQtdePag($QtdePags){
        $this->QtdePag = $QtdePags;
    }
    
    
    // parte 3 - métodos

    function salvar(){
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("insert into livro values (null,?,?,?,?,?)");
            @$sql->bindParam(1, $this->getTitulo(), PDO::PARAM_STR);
            @$sql->bindParam(2, $this->getCategoria(), PDO::PARAM_STR);
            @$sql->bindParam(3, $this->getISBN(), PDO::PARAM_STR);
            @$sql->bindParam(4, $this->getIdioma(), PDO::PARAM_STR);
            @$sql->bindParam(5, $this->getQtdePag(), PDO::PARAM_STR);
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
            $sql = $this->conn->query("Select * from livro order by Titulo");
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
            $sql = $this->conn->prepare("delete from livro where Cod_livro = ?");
            @$sql-> bindParam(1, $this->getCod_livro(), PDO::PARAM_STR);
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
            $sql = $this->conn->prepare("Select * from livro where Titulo like ?");
            @$sql-> bindParam(1, $this->getTitulo(), PDO::PARAM_STR);
            @$sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao consultar. " . $exc->getMessage();
        }
    }


}
?>
