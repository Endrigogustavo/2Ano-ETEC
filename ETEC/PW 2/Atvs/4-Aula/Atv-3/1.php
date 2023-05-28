<html>
<head>
    
    
</head>
<body>
    <?php

    
    $num1 = $_POST['num1'];
    $num2 = $_POST['num2'];
    $num3 = $_POST['num3'];
    $num4 = $_POST['num4'];
   
        $res = ($num1+$num2+$num3+$num4)/4;

        if ($res<6){
            echo "Reprovado";
        }
        else{
            echo "Aprovado";
        }
    
       
    

    ?>
</body>
</html>