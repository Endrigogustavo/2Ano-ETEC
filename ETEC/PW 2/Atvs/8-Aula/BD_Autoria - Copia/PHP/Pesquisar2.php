</head>
<body>
    <form action="" method="post" name="cliente">
        <fieldset id="a">
            <legend>Pesquisar </legend>
            <p>Id: <input type="text" name="txtnome"></p>
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
        include_once 'Autoria.php';
        $pro = new Produto();
        $pro -> setcod_autor($txtnome.'%');
        $pro_bd = $pro->consultar();
    }
    foreach($pro_bd as $pro_mostrar){
        ?> <br>
         <b> <?php echo "cod_livro: " . $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "cod_autor: " . $pro_mostrar[1]; ?></b>    &nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "data lancamento	: " . $pro_mostrar[2]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "editoria: " . $pro_mostrar[2]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
    <?php
        }
    ?>
</body>
</html>