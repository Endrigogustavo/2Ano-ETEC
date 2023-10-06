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
                <span>Name</span>
                <input type="text" id="name" name="txtnome">
            </label>

            <label for="email">
                <span>Sobrenome</span>
                <input type="text" id="email" name="txtestoq">
            </label>

            <label for="email">
                <span>Email</span>
                <input type="text" id="email" name="txtestoq1">
            </label>

            <label for="password">
                <span>Nascimento</span>
                <input type="text" id="password" name="txtestoq2">
            </label>

            <input type="submit"  value="Cadastar" name="btnenviar" id="button">
        </form>
    </main>
    <section class="images">
        <img src="../Sunset-cuate (1).svg" alt="Mobile">
        <div class="circle"></div>
    </section>

    <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'Autor.php';
        $pro = new Produto();
        $pro -> setid_autor($txtnome);
        $pro -> setsobre($txtestoq);
        $pro -> setemail($txtestoq1);
        $pro -> setnas($txtestoq2);
        $pro->salvar();
    }
    ?>
</body>
</html>