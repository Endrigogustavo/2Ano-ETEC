<html>
<head>
    
    
</head>
<body>
    <?php

    
    $num1 = $_POST['num'];
    $num2 = $_POST['num2'];
   
    $res = $num2;
    $num2 = $num1;
    $num1 = $res;
    
    echo $num1;
    echo "<br>";
    echo $num2;
    
       
    

    ?>
</body>
</html>