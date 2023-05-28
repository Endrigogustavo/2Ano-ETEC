<html>
    <head>
        
    <title>Página calcularsomamostrar3.php </title>

</head>

<body>
    <br>
    <?php  
    $A = $_POST['txta'];  
    $B = $_POST['txtb'];  
    $soma= $A + $B;
    echo "A soma dos valores é ".$soma .'<br>';  
    if ($soma>10) {
            echo  "Soma maior que dez";
            } 
             elseif ($soma<5) {   
                 echo  "Soma menor que cinco";}  
                 else {    
                    echo  "Soma entre cinco e dez";
                    }
                    
                    ?>
                    
                </body>
                
                
            </html> 