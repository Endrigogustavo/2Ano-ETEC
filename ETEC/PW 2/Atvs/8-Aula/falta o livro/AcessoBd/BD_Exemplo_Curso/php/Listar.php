<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mercado de produtos escolares épico シ</title>
</head>
<body>


<center><font face = "Century Gothic" size = "6"><b>Relação de produtos Cadastrados</b><br><br><font size = "4">
<?php

include_once 'Produto.php';
$p = new Produto();
$pro_bd=$p->listar();

?>
<b> Id &nbsp;&nbsp;&nbsp;&nbsp; Nome &nbsp;&nbsp;&nbsp;&nbsp;Estoque</b>
<?php
foreach($pro_bd as $pro_mostrar)
{
     ?>
     <br><br>
     <b> <?php echo $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $pro_mostrar[1]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $pro_mostrar[2]; ?>
     <?php     
}   
     echo "<br><br><button><a href = '../menu.html'> Voltar </a></button>";?>
    </body>
</html>