<?php

class Cadastro{
    private $nome;
    private $telefone;
    private $origem;
    private $data;
    private $obs;
    

    //Metodo get
    public function getNome(){
        return $this->nome;
    }
    //Metodo set
    public function setNome($nome){
        $this->nome = $nome;
    }

    //Metodo get
    public function getTelefone(){
        return $this->telefone;
    }
    //Metodo set
    public function setTelefone($telefone){
        $this->telefone = $telefone;
    }

    //Metodo get
    public function getOrigem(){
        return $this->origem;
    }
    //Metodo set
    public function setOrigem($origem){
        $this->origem = $origem;
    }

    //Metodo get
    public function getData(){
        return $this->data;
    }
    //Metodo set
    public function setData($data){
        $this->data = $data;
    }

    //Metodo get
    public function getObs(){
        return $this->obs;
    }
    //Metodo set
    public function setObs($obs){
        $this->obs = $obs;
    }
    

}

?>