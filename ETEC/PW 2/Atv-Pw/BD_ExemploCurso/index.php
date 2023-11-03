
<html>
<head>
    <title>Document</title>
</head>
<body>
    <form action="" method="post" name="cliente">
        <fieldset id="a">
            <legend> Tela de Login</legend>
            <p>Login: <input type="text" name="txtnome"></p>
            <p>Senha: <input type="text" name="txtsenha"></p>
        </fieldset>
        <br>
        <fieldset class="b">
            <legend> Opcoes </legend>
            <br>
            <input type="submit" value="Cadastar" name="btnenviar">
            <input type="reset" value="Limpar" name="limpar">
        </fieldset>
    </form>


    <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'PHP/User.php';
        $u = new Usuario();
        $u -> setUsu($txtnome);
        $u -> setSenha($txtsenha);
        $pro_bd=$u->logar();
    
        $existe = false;

        foreach($pro_bd as $pro_mostrar){

            $existe = true;
            ?>
            <br><br> <?php echo "Bem vindo ".$pro_mostrar[1];?>
          
            <input type="button" name="btnentrar"> <a href="home.html">Entrar</a></a></input>
            <?php
        }
            if($existe == false){
                echo "Login ou senha incorreto";
            }
            

    }

    ?>
</body>
</html>