<html>
<head>
    
    
</head>
<body>
  

<?php
$n1 = $_POST['num1'];
$n2 = $_POST['num2'];
$impar=1;

if($n1<$n2){
    if($n1 %2 !=0){
      for ($nA = $_POST['num1'] ; $nA <= $n2; $nA++)
      {
          if($nA %2 !=0) {
                echo $nA.',';
             }
      }
    } 
      elseif($n1 %2 ==0){ 
      for ($nA = $_POST['num1'] ; $nA <= 9; $nA++)
      {     
          if($n1 %2 ==0){
              $nA=$nA+$impar;
            echo $nA.',';
        }
       }
    }
}
elseif($n2<$n1){
if($n2 %2 !=0){
    for ($nA = $_POST['num2'] ; $nA <= $n1; $nA++)
    {
        if($nA %2 !=0) {
              echo $nA.',';
           }
    }
}
elseif($n2 %2 ==0){         
    for ($nA = $_POST['num2'] ; $nA <= 9; $nA++)
    {     
        if($n2 %2 ==0){
            $nA=$nA+$impar;
          echo $nA.',';
      }
     }
  }
}  
elseif($n1==$n2)
echo 'não há números impares entre o primeiro e segundo valor';
?> 
    
</body>
</html>