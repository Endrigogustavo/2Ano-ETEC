<html>
<head>
    
    
</head>
<body>
    <?php


    $num1 = $_POST['num1'];
    $num2 = $_POST['num2'];
   
    $num3 = $num1+ $num2;
    $num4 = $num1- $num2;
    $num5 = $num1* $num2;
    $num6 = $num1/ $num2;

    echo "Soma = ".$num3. "<br>Subtraçao = ".$num4."<br>Multiplicaçao = ".$num5."<br>Divisao = ".$num6;

    ?>
</body>
</html>