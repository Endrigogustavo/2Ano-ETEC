<html>
<head>
    
    
</head>
<body>
    <?php

    
    $num = $_POST['num'];
    switch($num){
    case 1:  
    echo "Secretaria";
    break;

    case 2:  
    echo "Gerente";
    break;

    case 3:  
    echo "Operario";
    break;

    case 4:  
    echo "Analista";
    break;

    case 5:  
    echo "Faxineiro";
    break;

    default:
    echo "Código inválido";
    break;
    

    }

    ?>
</body>
</html>