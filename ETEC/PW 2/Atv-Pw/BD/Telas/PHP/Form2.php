<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Form</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js"></script>
<link rel="stylesheet" href="../Css/css.css">
    <link rel="stylesheet" href="../css.css">
</head>
<body>
<script src="../js/MaskNun.js">
</script>

<?php

session_start();

include("../Navbar.php");




?>
<br><br><br>
<div class="container" id="container">
        <div class="form-container sign-up">
            <form>
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
            <form action="" method="post" name="cliente">
                <h1>Alterar</h1>
                <div class="social-icons">
                    <a href="#" class="icon"><i class="fa-brands fa-google-plus-g"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>
                
                <input type="text" placeholder="Cod Autor" onkeypress="return blokletras(window.event.keyCode)" name="txtcoda">
                <input type="text" placeholder="Cod Livro" onkeypress="return blokletras(window.event.keyCode)" name="txtcodl">
                <input type="text" placeholder="Editora"  name="txtedit">
                <input type="text" placeholder="Data" id="data" name="txtdatal">
                <input type="submit" class="sub" value="Pesquisar" name="btnenviar" id="button">
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


          
    <script src="../Js/Mascara.js"></script>

     <?php
     extract($_POST, EXTR_OVERWRITE);
     if(isset($btnenviar))
      {
          include_once 'Autoria.php';
          $pro=new Produto();
          $pro->setCod_autor($txtcoda);
          $pro->setCod_livro($txtcodl);
          $pro->setDatalancamento($txtdatal);
          $pro->seteditoria($txtedit);
          echo "<h3><br><br>" . $pro->salvar() . "</h3>";
          header("location:../../Home.html");
      }
      ?>
      <br>

   </body>
</html>