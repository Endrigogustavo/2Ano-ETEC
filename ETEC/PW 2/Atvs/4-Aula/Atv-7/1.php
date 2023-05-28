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
        echo "Nota: ".$res;
        echo "<br>";
        if ($res<4){
            echo "Reprovado";
        }
        elseif ($res>6){
            echo "Aprovado";
        }
        else{
            echo "Analise";
        }
        
    
       
    

    ?>
</body>
</html>