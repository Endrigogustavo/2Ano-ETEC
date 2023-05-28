<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
	<title>Cadastro</title>
</head>
<body>
	<h1>Cadastro</h1>
	<form method="post" action="gerencia-cadastro.php">
		<label for="Email">Email:</label>
		<input type="email" id="Email" name="Email" required>
		<br>
		<label for="password">Password:</label>
		<input type="password" id="password" name="password" required>
		<br>
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>
