<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="Css/style2.css">
</head>
<body>

<main>
    <center>
        <h1>Login</h1>
        <div class="alternative">
        </div>
<br><br>

        <form action="" method="post" name="cliente">
        <input type="text" class="form__input" id="name" name="txtnome" placeholder="Nome" required="" />
  <label for="name" class="form__label">Nome</label>
<br>
<br>
<input type="password" class="form__input" id="name" name="txtsenha" placeholder="Senha" required="" />
  <label for="name" class="form__label">Senha</label>
<br><br>
            <button  value="Cadastar" name="btnenviar" >Logar</button>

        </form>
        
        <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'Telas/PHP/User.php';
        $u = new Usuario();
        $u -> setUsu($txtnome);
        $u -> setSenha($txtsenha);
        $pro_bd=$u->logar();
    
        $existe = false;

        foreach($pro_bd as $pro_mostrar){

            $existe = true;
            ?>
            <br><br> <h1><?php echo "Bem vindo ".$pro_mostrar[1];?></h1>
          <br>
          <br>
          
            <button style="--c:#E95A49"  value="Cadastar" name="btnenviar" ><a href="Home.html">Entrar</a></button>
            <?php
        }
            if($existe == false){
                ?>
                <br><br> <h1><?php echo "Login ou senha incorreto";?></h1>
              
                <?php
                
            }
}

    ?>
    </main>

          
    
    </center>
</body>
</html>