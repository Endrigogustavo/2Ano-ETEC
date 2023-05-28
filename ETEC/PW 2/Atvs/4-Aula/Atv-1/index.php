<html>
<head>
    
    
</head>
<body>
    <?php

    $i = 0;
    $tab = $_POST['num'];
    while($i<= 10){
        $tab = 2*$i;
        echo'2'.'X'.$i.'=' .$tab.'<br/>';
        $i++;
    }

    ?>
</body>
</html>