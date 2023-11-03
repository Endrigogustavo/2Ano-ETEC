<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="../Css/css.css">
    <title>Modern Login Page | AsmrProg</title>
</head>
<body>

    <?php
    $txtid1 = $_POST["txtid1"];
    $txtid2 = $_POST["txtid2"];
    include_once 'Autoria.php';
    $p = new Produto();
    $p -> setcod_autor($txtid1);
    $p -> setcod_livro($txtid2);
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
                <input type="text" placeholder="Nome" name="txted" size="5" value='<?php echo $pro_mostrar[1]?>' disabled>
                <input type="text" placeholder="Sobrenome" name="txtid1" size="50" value='<?php echo $pro_mostrar[2]?>'>
                <input type="text" placeholder="Email" name="txtid2" size="50" value='<?php echo $pro_mostrar[3]?>'>
                <button><input type="submit" name="btnalterar" value='Alterar' id="button"></button>
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

    <?php
        }
        ?>
    <?php
    

        extract($_POST, EXTR_OVERWRITE);
        if(isset($btnalterar))
        {
            include_once 'Autoria.php';
            $pro = new Produto();
            $pro -> setdatalancamento($txtdt);
            $pro -> seteditoria($txted);
            $pro -> setcod_autor($txtid1);
            $pro -> setcod_livro($txtid2);
            $pro_bd = $pro->alterar2();
            header("location:Consultar_Autoria1.php");
        }
        ?>
</body>
</html>