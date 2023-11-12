<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="../Css/css.css">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js"></script>

    <title>Modern Login Page | AsmrProg</title>
</head>

<body>



</script>
<?php

session_start();

include("../Navbar.php");




?>
<br><br><br>

    <?php
    $txtid = $_POST["txtid"];
    include_once 'Livro.php';
    $p = new Produto();
    $p -> setCod_livro($txtid);
    $pro_bd = $p->Alterar();
    ?>
<div class="container" id="container">
        <div class="form-container sign-up">
            <form>

            <?php
        foreach($pro_bd as $pro_mostrar)
        {
            ?>
                <h1>Alterar</h1>
                <div class="social-icons">
                    <a href="#" class="icon"><i class="fa-brands fa-google-plus-g"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>
                <span>Digite o Id que deseja Alterar</span>
                
            </form>
        </div>
        <div class="form-container sign-in">
            <form action="" method = "POST" name = "cliente2">
                <h1>Alterar</h1>
                <div class="social-icons">
                    <a href="#" class="icon"><i class="fa-brands fa-google-plus-g"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>

                <input type="text" placeholder="Id" name="txtid" size="5" value='<?php echo $pro_mostrar[0]?>' disabled>
                <input type="text" placeholder="Titulo" name="txttitulo" size="5" value='<?php echo $pro_mostrar[1]?>'>
                <input type="text" placeholder="Categoria"  name="txtcad" size="50" value='<?php echo $pro_mostrar[2]?>'>
                <input type="text" placeholder="ISBN" id="isbn" name="txtis" size="50" value='<?php echo $pro_mostrar[3]?>'>
                <input type="text" placeholder="Idioma" name="txtidm" size="50" value='<?php echo $pro_mostrar[4]?>'>
                <input type="number" onkeypress="return blokletras(window.event.keyCode)" placeholder="Paginas" name="txtpag" size="50" value='<?php echo $pro_mostrar[5]?>'>
                <input type="submit" name="btnalterar" value='Alterar' class="sub" id="button">
            </form>
        </div>
        <div class="toggle-container">
            <div class="toggle">
                <div class="toggle-panel toggle-left">
                    <h1>Alterar</h1>
                    <p>Atividade de CRUD</p>
                    <button class="hidden" id="login">Testar</button>
                </div>
                <div class="toggle-panel toggle-right">
                    <h1>Atv-Pw</h1>
                    <p>Atividade de CRUD</p>
                    <button class="hidden" id="register">Testar</button>
                </div>
            </div>
        </div>
    </div>
    <script src="../Css/script.js"></script>

<script src="../Js/Mascara.js"></script>
    <?php
        }
        ?>
    <?php

        extract($_POST, EXTR_OVERWRITE);
        if(isset($btnalterar))
        {
            include_once 'Livro.php';
            $pro = new Produto();
            $pro -> setCod_livro($txtid);
            $pro -> setTitulo($txttitulo);
            $pro -> setCategoria($txtcad);
            $pro -> setISBN($txtis);
            $pro -> setIdioma($txtidm);
            $pro -> setQtdePag($txtpag);
            $pro_bd = $pro->alterar2();
            header("location:../../Home.html");
        }
        ?>
</body>
</html>