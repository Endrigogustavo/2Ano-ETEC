</head>
<body>

    <?php
    $txtid = $_POST["txtid"];
    include_once 'Autor.php';
    $p = new Produto();
    $p -> setid_autor($txtid);
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
            <b><?php echo "Nacimento: "?></b>
            <input type="text" name="txtnas" size="10" value='<?php echo $pro_mostrar[4]?>'>
            
            <br><br>
            
            <b><?php echo "Nome: "?></b>
            <input type="text" name="txtsobre" size="25" value='<?php echo $pro_mostrar[3]?>'>
            <br> <br><br><center>
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
            include_once 'Autor.php';
            $pro = new Produto();
            $pro -> setname($txtnome);
            $pro -> setnas($txtnas);
            $pro -> setemail($txtsobre);
            $pro -> setid_autor($txtid);
            $pro_bd = $pro->alterar2();
            header("location:Consultar_Autor1.php");
        }
        ?>
</body>
</html>