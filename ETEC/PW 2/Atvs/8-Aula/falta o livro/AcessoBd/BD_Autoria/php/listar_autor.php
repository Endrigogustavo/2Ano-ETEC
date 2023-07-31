<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Astronauta シ</title>
</head>
<body>


<center><font face = "Century Gothic" size = "6"><b>Relação de autores Cadastrados</b><br><br><font size = "4">
<?php

include_once 'Autor.php';
$a = new Autor();
$aut_bd=$a->listar();

?>
<b> Cod_Autor &nbsp;&nbsp;&nbsp;&nbsp; NomeAutor &nbsp;&nbsp;&nbsp;&nbsp; Sobrenome &nbsp;&nbsp;&nbsp;&nbsp; email &nbsp;&nbsp;&nbsp;&nbsp; Nascimento</b>
<?php
foreach($aut_bd as $aut_mostrar)
{
     ?>
     <br><br>
     <b> <?php echo $aut_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $aut_mostrar[1]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $aut_mostrar[2]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $aut_mostrar[3]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $aut_mostrar[4]; ?>    
     <?php     
}
echo "<br><br><button><a href = '../menu.html'> Voltar </a></button>";?>
   
    </body>
</html>