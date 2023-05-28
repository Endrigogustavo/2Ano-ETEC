<html>
<head>
    
    
</head>
<body>
    <?php

    
    $txt = $_POST['text'];
    $p = $_POST['pas'];
   if($txt=="ETE" && $p=="ETE"){
    echo "Seja bem vindo";
   }
   else
   if($txt!="ETE" && $p!="ETE"){
    echo "Dados invalidos";
   }

    ?>
</body>
</html>