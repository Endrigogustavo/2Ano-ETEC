
<?php
  $num1 = $_POST['num1'];
  $num2 = $_POST['num2'];
  $impar = 0;
  
      if($num1>$num2)
      {
           if($num2 %2 != 0)
           {

               for($n = $num2; $n<=$num1; $n=$n+2){

                    $impar = $impar+$n;

                   
                     
               }
                echo $impar ."<br>";
          }
          else
          {

               for($n = $num2+1; $n<=$num1; $n=$n+2){
                $impar = $impar+$n;

                   
                     
            }
             echo $impar ."<br>";
     }


}
      else{
            if($num1 %2 != 0)
            {
                for($n = $num1; $n<=$num2; $n=$n+2){
                    $impar = $impar+$n;

                   
                     
                }
                 echo $impar ."<br>";

            }
            else
            {
                for($n = $num1+1; $n<=$num2; $n=$n+2){
                    
                    $impar = $impar+$n;
 
                }
                 echo $impar ."<br>";
            

                if ($num1==$num2){
                echo "Os numeros são iguais";
               }
 
             


      }

 }
 

?>