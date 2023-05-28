<?php

require_once("Formulario.class.php");

class Dados{
    private $cadastro;

    public function __construct(){
        $cadastro = new Cadastro();

        $cadastro->setNome($_POST['nome']);
        echo $cadastro->getNome();
        
        echo "<br>";

        $cadastro->setTelefone($_POST['telefone']);
        echo $cadastro->getTelefone();

        echo "<br>";

        $cadastro->setOrigem($_POST['origem']);
        echo $cadastro->getOrigem();

        echo "<br>";

        $cadastro->setData($_POST['data']);
        echo $cadastro->getData();

        echo "<br>";

        $cadastro->setObs($_POST['obs']);
        echo $cadastro->getObs();
       
    }

}new Dados();

?>