
<html>
<head>
   
    <title>Pagina calcularquadrado.php</title>
</head>
<body>
    <?php

    $A = $_POST["txta"];
    $B = $_POST["txtb"];
    $soma=$A+$B;
    $qua = pow($soma,2);
    echo"A soma dos valores é" .$soma . "<br>";
    echo"O quadrado das soma é" .$qua ;
    ?>
</body>
</html>