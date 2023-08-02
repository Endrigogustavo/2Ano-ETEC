<?php

include_once 'conectar.php';

//parte 1 - atributos

class Produto
{
    private $id;
    private $nome;
    private $estoque;
    private $conn;

    //parte 2 - os gettes e setter

    public function getId() {
        return $this -> id;
    }

    public function setId() {
        $this -> $id = iid;
    }

    public function getNome() {
        return $this -> nome;
    }

    public function setNome($name) {
        $this -> nome = $name;
    }

    public function getEstoque() {
        return $this -> estoque;
    }
    public function setEstoque($estoqui) {
        $this -> estoque = $estoqui;
    }

    //parte 3 - métodos

    function listar()
    {
        try
        {
            $this -> conn = new Conectar;
            $sql = $this->conn->query("select * from produtos order by nome");
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }
        catch (PDOException $exc)
        {
            echo "Erro ao executar consulta. " . $exc -> getMessage();
        }
    }
}
?>