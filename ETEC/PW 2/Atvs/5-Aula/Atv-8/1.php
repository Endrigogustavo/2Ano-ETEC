<html>
<head>
    
    
</head>
<body>
    <?php


$num = $_POST['num'];
$num2 = $_POST['num2'];
$num3= $_POST['num3'];
switch($num3){
case 1: 
    $res = $num+$num2; 
    echo $res;
break;

case 2:  
    $res = $num-$num2; 
    echo $res;
break;

case 3:  
    $res = $num/$num2; 
    echo $res;
break;

case 4:  
    $res = $num*$num2; 
    echo $res;
break;


default:
echo "Código inválido";
break;
}

    ?>
</body>
</html>