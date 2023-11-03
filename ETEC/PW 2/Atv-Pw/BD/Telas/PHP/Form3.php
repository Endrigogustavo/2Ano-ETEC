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

        <h1>Create Account</h1>
        <div class="alternative">
        </div>

        <form action="" method="post" name="cliente">
            <label for="name">
                <span>Titulo</span>
                <input type="text" id="name" name="txtnome">
            </label>

                <label for="name">
                    <span>Categoria</span>
                    <input type="text"id="email"  name="txtestoq">
                </label>
                <label for="name">
                    <span>ISBN</span>
                    <input type="text"id="email"  name="txtestoq1">
                </label>
                <label for="name">
                    <span>Idioma</span>
                    <input type="text" id="email" name="txtestoq2">
                </label>
                <label for="name">
                    <span>Q_Paginas</span>
                    <input type="text" id="email" name="txtestoq3">
                </label>
                <input type="submit" value="Cadastar" name="btnenviar" id="button">
        </form>
    </main>
    <section class="images">
        <img src="../Sunset-cuate (1).svg" alt="Mobile">
        <div class="circle"></div>
    </section>

    <?php
    extract($_POST, EXTR_OVERWRITE);
    if (isset($btnenviar)) {
        include_once 'Livro.php';
        $pro = new Produto();
        $pro->setTitulo($txtnome);
        $pro->setCategoria($txtestoq);
        $pro->setISBN($txtestoq1);
        $pro->setIdioma($txtestoq2);
        $pro->setQtdePag($txtestoq3);
        echo "<h3><br><br>" . $pro->salvar() . "</h3>";
    }
    ?>
</body>

</html>