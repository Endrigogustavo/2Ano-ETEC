<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Astronauta シ</title>
</head>
<body>


<center><font face = "Century Gothic" size = "6"><b>Relação de livros Cadastrados</b><br><br><font size = "4">
<?php

include_once 'Livro.php';
$l = new Livro();
$liv_bd=$l->listar();

?>
<b> Cod_livro &nbsp;&nbsp;&nbsp;&nbsp; Título &nbsp;&nbsp;&nbsp;&nbsp; Categoria &nbsp;&nbsp;&nbsp;&nbsp; ISBN &nbsp;&nbsp;&nbsp;&nbsp; Idioma &nbsp;&nbsp;&nbsp;&nbsp; QtdePag</b>
<?php
foreach($liv_bd as $liv_mostrar)
{
     ?>
     <br><br>
     <b> <?php echo $liv_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $liv_mostrar[1]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $liv_mostrar[2]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $liv_mostrar[3]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $liv_mostrar[4]; ?>    &nbsp;&nbsp;&nbsp;&nbsp;
         <?php echo $liv_mostrar[5]; ?>   
     <?php     
}
    echo "<br><br><button><a href = '../menu.html'> Voltar </a></button>";?>
    </body>
</html>