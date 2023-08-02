<?php

include_once 'produto.php';
$p = new Produto();
$pro_bd=$p->listar();

?>
<b> Id &nbsp;&nbsp;&nbsp;&nbsp; Nome &nbsp;&nbsp;&nbsp;&nbsp;Estoque </b>

<?php 
if (is_array($pro_bd))
{
    foreach ($pro_bd as $pro_mostrar) 
    {
        ?>
        <br><br>
        <b> <?php echo $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
            <?php echo $pro_mostrar[1]; ?>&nbsp;&nbsp;&nbsp;&nbsp;
            <?php echo $pro_mostrar[2]; ?>
        <?php
    }
}
    echo "<br><br><button><a href = 'menu.html'> Voltar </a></button>"; ?>