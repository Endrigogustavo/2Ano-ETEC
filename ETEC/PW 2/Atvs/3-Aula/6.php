<html>
<head>
    
    <title>Pagina qualquertabuada php</title>
</head>
<body>
    <?php

    $i = 0;
    $tab = $_POST['txtnum'];
    while($i<= 10){
        $tab = 2*$i;
        echo'2'.'X'.$i.'=' .$tab.'<br/>';
        $i++;
    }

    ?>
</body>
</html>