<html>
<head>
    
    
</head>
<body>
  

<?php
  $num1 = $_POST['num1'];
  $num2 = $_POST['num2'];
  

 if ($num1==$num2){
      echo "Os Valores são iguais e não possuem valores ímpares entre eles.";
 }
 else{
      if($num1>$num2){
           if($num2 %2 != 0){
                for($C = $num2; $C<=$num1; $C=$C+2){
                     echo $C ."<br>";
                     
                }

           }
           else{
             for($C = $num2+1; $C<=$num1; $C=$C+2){
                  echo $C ."<br>";
                  
             }


           }


      }
      else{
            if($num1 %2 != 0){
                for($C = $num1; $C<=$num2; $C=$C+2){
                    echo $C ."<br>";
                  
              }

            }
            else{
                for($C = $num1+1; $C<=$num2; $C=$C+2){
               echo $C ."<br>";
               
            }      


      }

 }
}
?>
?>