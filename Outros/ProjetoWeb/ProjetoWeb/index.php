<?php

define('MYQL_HOST', 'localhost:3306' );
define('MYSQL_USER', 'root' );
define('MYSQL_PASSWORD', '');
define('MYSQL_DB_NAME', 'bd_sistema');

try
{
    $PDO = new PDO('mysql:host=' . MYQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);        
}catch( PDOException $e )
{
    echo 'Erro ao conectar com o MySQL: ' . $e->getMessage();
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP -- Sistema de Acesso ao banco de dados</title>
</head>
<body>
<div class="Dados">
    <div class="row">
        <p class="TPrincipal">Consultar  - Contatos Agendados</p>
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Nome</th>
                        <th scope="col">Telefone</th>
                        <th scope="col">Origem</th>
                        <th scope="col">Contato</th>
                        <th scope="col">Observação</th>
                        <th scope="col">Acão</th>
                    </tr>
                </thead>
                <tbody>

                <td scope="col">
                    <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setNome($_POST['nome']);
                    echo $cadastro->getNome(); ?>
                </td>
                <td scope="col">  <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setTelefone($_POST['telefone']);
                    echo $cadastro->getTelefone(); ?>
                </td>
                <td scope="col">  <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setOrigem($_POST['origem']);
                    echo $cadastro->getOrigem();?>
                </td>
                <td scope="col">  <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setData($_POST['data']);
                    echo $cadastro->getData(); ?>
                </td>
                <td scope="col">  <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setObs($_POST['obs']);
                    echo $cadastro->getObs(); ?>
                </td>
                </tbody>
            </table>
        </div>
    </div>
</div>
    <?php 
        $sql = "SELECT * FROM clientes";
        $result = $PDO->query( $sql );
        $rows = $result->fetchAll();

        for($i=0; $i < count($rows); $i++){ ?>
        Nome: <?php echo $rows [$i]['nome']; ?><br>
        Endereço: <?php echo $rows [$i]['endereco']; ?><br>
        Bairro: <?php echo $rows [$i]['bairro']; ?><br>
        Cep: <?php echo $rows [$i]['cep']; ?><br>
        Cidade: <?php echo $rows [$i]['cidade']; ?><br>
        Estado: <?php echo $rows [$i]['estado']; ?><br><br>
        <?php
            }
        ?>
    
</body>
</html>