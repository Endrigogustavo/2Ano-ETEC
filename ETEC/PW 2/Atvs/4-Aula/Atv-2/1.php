<html>
<head>
</head>
<body>
    <?php

    $des = $_POST['des'];
    $num = $_POST['num'];
   
    $res = ($des/100)*$num;
    echo "o numero atual com ".$des." de desconto é: ".$res;
    

    ?>
</body>
</html>