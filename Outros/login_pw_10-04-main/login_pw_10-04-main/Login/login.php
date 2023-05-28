<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
	<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form method="post" action="gerencia-login.php">
		<label for="Email">Email:</label>
		<input type="email" id="Email" name="Email" required>
		<br>
		<label for="password">Password:</label>
		<input type="password" id="password" name="password" required>
		<br>
		<input type="submit" value="Login">
	</form>
	<a href="cadastro.php">Cadastre-se</a>
</body>
</html>
