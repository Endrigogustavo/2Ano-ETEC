<html>
<head>
    
    
</head>
<body>
    <?php

    
    $num1 = $_POST['num'];
    
   $bons1 = $num1*(10/100);
   $sala1 = $num1+$bons1;
   $paga = $sala1*(20/100);
   $sala2 = $sala1-$paga;
    
    echo "O seu salario depois da bonificaçao e do imposto de renda é ".$sala2;
    
    
       
    

    ?>
</body>
</html>