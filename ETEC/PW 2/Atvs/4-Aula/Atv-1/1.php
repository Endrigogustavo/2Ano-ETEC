<html>
<head>
    
    
</head>
<body>
    <?php

    $i = 0;
    $tab = $_POST['num'];
    while($i<= 10){
        $num1 = $tab*$i;
        echo $tab.'X'.$i.'=' .$num1.'<br/>';
        $i++;
    }

    ?>
</body>
</html>