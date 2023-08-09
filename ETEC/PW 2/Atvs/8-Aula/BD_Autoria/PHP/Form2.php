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
                <span>Código do Autor:</span>
                <input type="text" id="name" name="txtcoda">
            </label>

            <label for="email">
                <span>Código do Livro:</span>
                <input type="text" id="email" name="txtcodl">
            </label>

            <label for="email">
                <span>Nome da Editora:</span>
                <input type="text" id="email" name="txtedit">
            </label>

            <label for="password">
                <span>Data de Lançamento:</span>
                <input type="text" id="password" name="txtdatal">
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
          include_once 'Autoria.php';
          $pro=new Produto();
          $pro->setCod_autor($txtcoda);
          $pro->setCod_livro($txtcodl);
          $pro->setDatalancamento($txtdatal);
          $pro->seteditoria($txtedit);
          echo "<h3><br><br>" . $pro->salvar() . "</h3>";
      }
      ?>
      <br>

      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>