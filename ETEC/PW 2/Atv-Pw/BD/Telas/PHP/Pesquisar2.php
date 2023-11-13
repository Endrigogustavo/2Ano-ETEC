

<html>
<!--https://github.com/AsmrProg-YT/Modern-Login-->
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="../Css/css.css">
    <title>Modern Login Page | AsmrProg</title>
</head>

<body>
<?php

session_start();

include("../Navbar.php");




?>
<br><br><br>
    <div class="container" id="container">
        <div class="form-container sign-up">
            <form>
                <h1>Pesquisar</h1>
                <div class="social-icons">
                    <a href="#" class="icon"><i class="fa-brands fa-google-plus-g"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>
                <span>Digite o Id que deseja Pesquisar</span>
                
            </form>
        </div>
        <div class="form-container sign-in">
            <form method="post" name="cliente">
                <h1>Pesquisar</h1>
                <div class="social-icons">
                    <a href="#" class="icon"><i class="fa-brands fa-google-plus-g"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>
                
                <input type="text" placeholder="Nome"  name="txtnome">
                <input type="submit" value="Pesquisar" name="btnenviar" class="sub" id="button">
            </form>
        </div>
        <div class="toggle-container">
            <div class="toggle">
                <div class="toggle-panel toggle-left">
                    <h1>Pesquisar</h1>
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

    <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'Autoria.php';
        $pro = new Produto();
        $pro -> setcod_autor($txtnome.'%');
        $pro_bd = $pro->consultar();
        foreach($pro_bd as $pro_mostrar){
            ?> <br>
             <b> <?php echo "cod_livro: " . $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
             <b> <?php echo "cod_autor: " . $pro_mostrar[1]; ?></b>    &nbsp;&nbsp;&nbsp;&nbsp;
             <b> <?php echo "data lancamento	: " . $pro_mostrar[2]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
             <b> <?php echo "editoria: " . $pro_mostrar[2]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
        <?php
            }
    }
   
    ?>
</body>
</html>