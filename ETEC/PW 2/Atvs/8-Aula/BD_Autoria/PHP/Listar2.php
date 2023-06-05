<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <center><section>
    <font face="Century Gothic" size="6"><b>Relação de Produtos Cadastrados</b><br><br></font>

    <?php

    include_once 'autoria.php';
    $p = new Produto();
    $pro_bd=$p-> listar();
    ?>
    <b> Id &nbsp;&nbsp;&nbsp;&nbsp; Nome &nbsp;&nbsp;&nbsp;&nbsp; Estoque</b>
    
    <?php
        foreach($pro_bd as $pro_mostrar){
            ?>
            <br><br>
            <b> <?php echo $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
                <?php echo $pro_mostrar[1]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
                <?php echo $pro_mostrar[2]; ?>
            <?php
        }
            echo "<br><br><button><a href = '../index.html'>Voltar </a></button> "; ?>
            
    </section></center>
</body>
</html>