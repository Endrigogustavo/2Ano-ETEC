<?php
define('MYSQL_HOST', 'localhost');
define('MYSQL_USER', 'root');
define('MYSQL_PASSWORD', '');
define('MYSQL_DB_NAME', 'clientes');

try {
    $PDO = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);
    $PDO->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION); 
} catch (PDOException $e) {
    echo 'Erro ao conectar com o MySQL: ' . $e->getMessage();
    exit();
}
?>
<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Acesso ao Banco de Dados</title>
</head>
<body>
    <?php
    $sql = "SELECT * FROM clientes";
    $result = $PDO->query($sql);

    if ($result) {
        $rows = $result->fetchAll();

        foreach ($rows as $row) {
            ?>
            Nome: <?php echo $row['Nome']; ?><br>
            Endereço: <?php echo $row['Endereco']; ?><br>
            Bairro: <?php echo $row['Bairro']; ?><br>
            Cep: <?php echo $row['CEP']; ?><br>
            Cidade: <?php echo $row['Cidade']; ?><br>
            Estado: <?php echo $row['Estado']; ?><br>
            <?php
        }
    } else {
        echo 'Erro na consulta ao banco de dados.';
    }
    ?>
</body>
</html>

