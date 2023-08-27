<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Form</title>
    <link rel="stylesheet" href="../css.css">
</head>

<body>

    <main>

        <h1> Informe o id que deseja deletar</h1>
        <div class="alternative">
        </div>

        <form action="" method="post" name="cliente">
            <label for="name">
                <span>Id</span>
                <input type="text" name="id">
            </label>
            <input type="submit" value="Deletar" name="btnenviar" id="button">
        </form>
    </main>
    <section class="images">
        <img src="../Sunset-cuate (1).svg" alt="Mobile">
        <div class="circle"></div>
    </section>
    <?php
    extract($_POST, EXTR_OVERWRITE);
    if (isset($btnenviar)) {
        include_once 'Autoria.php';
        $pro = new Produto();
        $pro->setcod_autor($id);
        $pro->exclusao();
    }
    ?>
</body>

</html>