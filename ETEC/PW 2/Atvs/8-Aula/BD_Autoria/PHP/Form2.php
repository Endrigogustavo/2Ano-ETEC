<html>
<head>
    <title>Document</title>
</head>
<body>
    <form action="" method="post" name="cliente">
        <fieldset id="a">
            <legend> Cadastras</legend>
            <p>Nome: <input type="text" name="txtnome"></p>
            <p>Estoque: <input type="text" name="txtestoq"></p>
        </fieldset>
        <br>
        <fieldset class="b">
            <legend> Opcoes </legend>
            <br>
            <input type="submit" value="Cadastar" name="btnenviar">
            <input type="reset" value="Limpar" name="limpar">
        </fieldset>
    </form>

    <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'Autoria.php';
        $pro = new Produto();
        $pro -> setdatalancamento($txtnome);
        $pro -> seteditoria($txtestoq);
        $pro->salvar();
    }
    ?>
</body>
</html>