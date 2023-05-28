<html>
<head>
    
    
</head>
<body>
    <?php


$peso = $_POST['P'];

$sexo = $_POST['S'];

$altura = $_POST['altura'];

if( $sexo == 'M'){

$ideal = pow($altura, 2) *23;
}
elseif($Sx == 'F'){
    $ideal = pow($altura, 2) *22;
}

if($peso > $ideal){
    echo "Acima do peso ideal";
}
elseif($peso < $ideal){
    echo "Abaixo do peso ideal";
}
else{
    echo "Dentro do peso ideal";
}
    ?>
</body>
</html>