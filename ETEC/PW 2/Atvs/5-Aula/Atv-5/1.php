<html>
<head>
    
    
</head>
<body>
    <?php

    
    $num = $_POST['num'];
    $num2 = $_POST['num2'];

    $res = ($num+$num2)/2;
   if($res>= 8){
    echo "Aprovado";
   }
   elseif($res<4)
   {
    echo "Reprovado";
   }
   else{
    echo "Recuperação";
   }

    ?>
</body>
</html>