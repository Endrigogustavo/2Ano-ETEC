<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="../Css/css.css">
</head>
<body>
    <center><section>
    <font face="Century Gothic" size="6"><b>Relação de Produtos Cadastrados</b><br><br></font>

    <?php

    include_once 'Livro.php';
    $p = new Produto();
    $pro_bd=$p-> listar();
    ?>
    <b> cod &nbsp;&nbsp;&nbsp;&nbsp; Titulo &nbsp;&nbsp;&nbsp;&nbsp; categoria&nbsp;&nbsp;&nbsp;&nbsp; ISBN &nbsp;&nbsp;&nbsp;&nbsp; Idioma&nbsp;&nbsp;&nbsp;&nbsp; Quantidade pag</b>
    
    <?php
        foreach($pro_bd as $pro_mostrar){
            ?>
            <br><br>
            <b> <?php echo $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
                <?php echo $pro_mostrar[1]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
                <?php echo $pro_mostrar[2]; ?>
                <?php echo $pro_mostrar[3]; ?>
                <?php echo $pro_mostrar[4]; ?>
                <?php echo $pro_mostrar[5]; ?>
            <?php
        }
            echo "<br><br><button><a href = '../Cards2.html'>Voltar </a></button> "; ?>
            
    </section></center>
</body>
</html>