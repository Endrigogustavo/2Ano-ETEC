<html>
<head>
    <title>Document</title>
</head>
<body>
    <form action="" method="post" name="cliente">
        <fieldset id="a">
            <legend> Cadastras</legend>
            <p>Titulo: <input type="text" name="txtnome"></p>
            <p>Categoria: <input type="text" name="txtestoq"></p>
            <p>ISBN: <input type="text" name="txtestoq1"></p>
            <p>Idioma: <input type="text" name="txtestoq2"></p>
            <p>Paginas: <input type="text" name="txtestoq3"></p>

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
        include_once 'Livro.php';
        $pro = new Produto();
        $pro -> setTitulo($txtnome);
        $pro -> setCategoria($txtestoq);
        $pro -> setISBN($txtestoq1);
        $pro -> setIdioma($txtestoq2);
        $pro -> setQtdePag($txtestoq3);
        $pro->salvar();
    }
    ?>
</body>
</html>