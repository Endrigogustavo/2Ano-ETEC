
<html>
<head>
    
    <title>pagina calcular php</title>
</head>
<body>
    <?php
$valor=$_POST["txtvalor"]; 
$horas=$_POST["txthoras"]; 
$salario= $valor * $horas; 
echo "de acordo com as informaçoes digitadas na pagina anterior, o salario e R$" .$salario;
?>
    
</body>
</html>