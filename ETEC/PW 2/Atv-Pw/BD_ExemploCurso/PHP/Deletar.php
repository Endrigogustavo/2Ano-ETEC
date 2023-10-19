</head>
<body>
    <form action="" method="post" name="cliente">
        <fieldset id="a">
            <legend> Informe o id que deseja deletar</legend>
            <p>id: <input type="text" name="id"></p>
            
        </fieldset>
        <br>
        <fieldset class="b">
            <legend> Opcoes </legend>
            <br>
            <input type="submit" value="Deletar" name="btnenviar">
            <input type="reset" value="Limpar" name="limpar">
        </fieldset>
    </form>

    <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'Produto.php';
        $pro = new Produto();
        $pro -> setId($id);
        $pro->exclusao();
    }
    ?>
</body>
</html>