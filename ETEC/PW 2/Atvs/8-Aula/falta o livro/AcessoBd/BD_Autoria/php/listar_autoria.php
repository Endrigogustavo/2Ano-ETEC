<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Astronauta シ</title>
</head>
<body>


<center><font face = "Century Gothic" size = "6"><b>Relação de autoria Cadastrados</b><br><br><font size = "4">
<?php

include_once 'Autoria.php';
$au = new Autoria();
$autori_bd=$au->listar();

?>
<b> Cod_Autor &nbsp;&nbsp;&nbsp;&nbsp; Cod_Livro &nbsp;&nbsp;&nbsp;&nbsp; Data de Lançamento &nbsp;&nbsp;&nbsp;&nbsp; Editora</b>
<?php
foreach($autori_bd as $autori_mostrar)
{
     ?>
     <br><br>
     <b> <?php echo $autori_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $autori_mostrar[1]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $autori_mostrar[2]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $autori_mostrar[3]; ?>      
     <?php     
}
     echo "<br><br><button><a href = '../menu.html'> Voltar </a></button>";?>
    </body>
</html>