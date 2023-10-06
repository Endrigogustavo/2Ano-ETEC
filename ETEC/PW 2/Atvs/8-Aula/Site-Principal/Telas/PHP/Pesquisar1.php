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
        include_once 'Autor.php';
        $pro = new Produto();
        $pro -> setsobre($txtnome.'%');
        $pro_bd = $pro->consultar();
    }

    
    foreach($pro_bd as $pro_mostrar){
        ?> <br>
         <b> <?php echo "ID: " . $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "Nome: " . $pro_mostrar[1]; ?></b>    &nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "Sobrenome: " . $pro_mostrar[2]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "email: " . $pro_mostrar[3]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "Nasc: " . $pro_mostrar[4]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
    <?php
        }
    ?>
</body>
</html>