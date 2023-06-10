<?php
include_once 'Conectar.php';

//parte 1 - atributos

class Produto{
    private $Cod_livro;
    private $nome;
    private $sobre;
    private $email;
    private $nas;
    private $nas;
    private $conn;

    // parte 2 - os getters e setters
    function getCod_livro(){
        return $this->Cod_livro;
    } 
    function setCod_livro($iCod_livro){
        $this->Cod_livro = $iid_autor;
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
            $sql = $this->conn->query("Select * from livro order by Titulo");
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }catch(PDOException $exc){
            echo "Erro ao executar consulta. " . $exc->getMessage();
        }
    }
}
?>
