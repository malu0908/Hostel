<?php
session_start();
include("conexao.php");

$title = mysqli_real_escape_string($conexao, trim($POST['title']));
$name = mysqli_real_escape_string($conexao, trim($POST['name']));
$lastnome = mysqli_real_escape_string($conexao, trim($POST['lastnome']));
$birthday = mysqli_real_escape_string($conexao, trim($POST['birthday']));
$email = mysqli_real_escape_string($conexao, trim($POST['email']));
$address = mysqli_real_escape_string($conexao, trim($POST['address']));
$zipCode = mysqli_real_escape_string($conexao, trim($POST['zipCode']));
$city = mysqli_real_escape_string($conexao, trim($POST['city']));
$state = mysqli_real_escape_string($conexao, trim($POST['state']));
$coutry = mysqli_real_escape_string($conexao, trim($POST['coutry']));
