<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">

</head>
<body>

<div class="container" id="fprinci">
    <nav class="navbar navbar-expand-lg bg-body-tertiary, fundo" data-bs-theme="dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">SISTEMA WEB</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Cadastrar</a>
                </li>
                <li class="nav-item">
                <a class="nav-link" href="#">Consultar</a>
                </li>
            </ul>
            </div>
        </div>
    </nav>    
<div class="Dados">
    <div class="row">
        <p class="TPrincipal">Consultar  - Contatos Agendados</p>
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Nome</th>
                        <th scope="col">Telefone</th>
                        <th scope="col">Origem</th>
                        <th scope="col">Contato</th>
                        <th scope="col">Observação</th>
                        <th scope="col">Acão</th>
                    </tr>
                </thead>
                <tbody>

                <td scope="col">
                    <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setNome($_POST['nome']);
                    echo $cadastro->getNome(); ?>
                </td>
                <td scope="col">  <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setTelefone($_POST['telefone']);
                    echo $cadastro->getTelefone(); ?>
                </td>
                <td scope="col">  <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setOrigem($_POST['origem']);
                    echo $cadastro->getOrigem();?>
                </td>
                <td scope="col">  <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setData($_POST['data']);
                    echo $cadastro->getData(); ?>
                </td>
                <td scope="col">  <?php
                    require_once("Formulario.class.php");
                    $cadastro = new Cadastro();
                    $cadastro->setObs($_POST['obs']);
                    echo $cadastro->getObs(); ?>
                </td>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>