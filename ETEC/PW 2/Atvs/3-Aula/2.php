<html>
    
<head>
    <title>Página calcularsomamostrar2.php </title>
</head>

<body>
    <br>
    
    <?php
    $A = $_POST['txta'];  
    $B = $_POST['txtb'];  
    $soma= $A + $B;
    echo "A soma dos valores é ".$soma .'<br>';
    if ($soma>10) 
    {    
        echo '<font color="blue">'. "Soma maior que dez". '</font>';
        
        }  
        
        else{
                echo '<font color="red">'. "Soma menor que dez". '</font>';  
                }
                ?>
                
            </body>
            
            </html> 