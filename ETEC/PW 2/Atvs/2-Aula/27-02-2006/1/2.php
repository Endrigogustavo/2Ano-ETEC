
<html>
<head>
    <title>acao - Recebimento dos dados de um Formulario</title>
</head>
<body>
    <?php
    $Vnome=$_POST["nome"]; //atribuindo o conteudo da caixa de texto "nome" a varialvel "$Vnome"

    $Vidade=$_POST["idade"]; //atribuindo o conteudo da caixa de texto "idade" a varialvel "$Vidade"

    echo "OI !! " . $Vidade . "." "<br>" . "Voce tem" . $Vidade . " anos !!";
    //mostrando na tela string concatenadas com variaveis e com comandos HTML
    ?> 
</body>
</html>