<?php
session_start();

$Email = $_POST['Email'];
$password = $_POST['password'];

$_SESSION['Email'] = $Email;
$_SESSION['password'] = $password;

header("Location: login.php");
exit();
?>
