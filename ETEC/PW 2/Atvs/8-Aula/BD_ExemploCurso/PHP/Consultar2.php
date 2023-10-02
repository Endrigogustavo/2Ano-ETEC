</head>
<body>

    <?php
    $txtid = $_POST["txtid"];
    include_once 'Produto.php';
    $p = new Produto();
    $p -> setId($txtid);
    $pro_bd = $p->Alterar();
    ?>
    <br>
    <center>
    <form action="" method = "POST" name = "cliente2">
    <?php
        foreach($pro_bd as $pro_mostrar)
        {
            ?>

            <input type="hidden" name="txtid" size="5" value='<?php echo $pro_mostrar[0]?>'>
            <b><?php echo "ID: " . $pro_mostrar[0];?></b>
            <br> <br>
            <b><?php echo "Nome: "?></b>
            <input type="text" name="txtnome" size="25" value='<?php echo $pro_mostrar[1]?>'>
            <br> <br>
            <b><?php echo "Estoque: "?></b>
            <input type="text" name="txtestoq" size="10" value='<?php echo $pro_mostrar[2]?>'>
            <br><br><br><center>
            <input type="submit" name="btnalterar" value='Alterar'>

            <?php
        }
        ?>
    </form>
    </center>
    <?php

        extract($_POST, EXTR_OVERWRITE);
        if(isset($btnalterar))
        {
            include_once 'Produto.php';
            $pro = new Produto();
            $pro -> setNome($txtnome);
            $pro -> setEstoque($txtestoq);
            $pro -> setId($txtid);
            $pro_bd = $pro->alterar2();
            header("location:Consultar.php");
        }
        ?>
</body>
</html>