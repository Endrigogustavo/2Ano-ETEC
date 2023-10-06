</head>
<body>
    <form action="" method="post" name="cliente">
        <fieldset id="a">
            <legend>Pesquisar </legend>
            <p>Nome: <input type="text" name="txtnome"></p>
        </fieldset>
        <br>
        <fieldset class="b">
            <legend> Opcoes </legend>
            <br>
            <input type="submit" value="Pesquisar" name="btnenviar">
            <input type="reset" value="Limpar" name="limpar">
        </fieldset>
    </form>

    <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'Livro.php';
        $pro = new Produto();
        $pro -> setTitulo($txtnome.'%');
        $pro_bd = $pro->consultar();
    }
    foreach($pro_bd as $pro_mostrar){
        ?> <br>
         <b> <?php echo "Cod_livro: " . $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "Titulo: " . $pro_mostrar[1]; ?></b>    &nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "Categoria: " . $pro_mostrar[2]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "ISBN: " . $pro_mostrar[3]; ?></b>    &nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "Idioma: " . $pro_mostrar[4]; ?></b>    &nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "QtdePag: " . $pro_mostrar[5]; ?></b>    &nbsp;&nbsp;&nbsp;&nbsp;
    <?php
        }
    ?>
</body>
</html>