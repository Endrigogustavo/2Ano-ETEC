<?php
try{
    $HOST = "localhost";
    $BANCO ="esp32-mysql";
    $USUARIO = "root";
    $SENHA = "";
 
    $PDO = new PDO("msqly:host=" . $HOST . ";dbnome=" . $BANCO . ";charset=utf8", $USUARIO, $SENHA);
 
}   catch(PDOException $erro){
    echo "Erro de conexao: " . $erro->getMessage();
}
?>