<?php
session_start();

$Email = $_POST['Email'];
$password = $_POST['password'];

if ($Email == $_SESSION['Email'] && $password == $_SESSION['password']) {
	$_SESSION['Email'] = $Email;
    echo "Login Bem-sucedido :)". '<br>' . $Email;
    $arquivo = "dados.txt";
    $arquivo = fopen("dados.txt", "a");
    fwrite($arquivo, "Email:". "\n" . $Email ."\n");
    fwrite($arquivo, "Senha:". "\n" . $password ."\n");
    fwrite($arquivo, "Login Bem-sucedido :) " . "\n");
    fclose($arquivo);
    
	
} else {
	echo "Nome de usuário ou senha incorretos - Login Malsucedido :(";
    $arquivo = "dados.txt";
    $arquivo = fopen("dados.txt", "a");
    fwrite($arquivo, "Nome de usuário ou senha incorretos - Login Malsucedido :( "."\n");
    fclose($arquivo);
}
?>
