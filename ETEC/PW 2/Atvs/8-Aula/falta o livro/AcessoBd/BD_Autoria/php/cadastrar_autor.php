<html>
    <body>
     <form name="cliente"  method = "POST" action = "">
        <fieldset id="a">
           <legend><b> Dados do Autor: </b></legend>
               <p> Nome do Autor: <input name="txtnome" type="text" size="40" maxlegth="40" placeholder="Nome">
               <p> sobrenome: <input name="txtsobren" type="text" size="40" maxlegth="40" placeholder="Sobrenome">
               <p> Email: <input name="txtemail" type="text" size="40" maxlegth="40" placeholder="Email">
               <p> Nascimento: <input name="txtnasc" type="text" size="10" placeholder="0"> </p>

        </fieldset>
         <br>
      <fieldset id="b">
         <legend ><b> Opções: </b></legend>
         <br>
         <input name="btnenviar" type="submit" value="Cadastrar" > &nbsp;&nbsp;
         <input name="limpar" type="reset" value="Limpar" >
      </fieldset>

     </form>

     <?php
     extract($_POST, EXTR_OVERWRITE);
     if(isset($btnenviar))
      {
          include_once 'Autor.php';
          $pro=new Autor();
          $pro->setNomeAutor($txtnome);
          $pro->setSobrenome($txtsobren);
          $pro->setemail($txtemail);
          $pro->setNasc($txtnasc);
          echo "<h3><br><br>" . $pro->salvar() . "</h3>";
      }
      ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>