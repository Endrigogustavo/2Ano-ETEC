<html>
    <body>
     <form name="cliente"  method = "POST" action = "">
        <fieldset id="a">
           <legend><b> Dados do produto: </b></legend>
               <p> Nome: <input name="txtnome" type="text" size="40" maxlegth="40" placeholder="Nome do Produto">
               <p> Estoque: <input name="txtestoq" type="text" size="10" placeholder="0"> </p>

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
          include_once 'Produto.php';
          $pro=new Produto();
          $pro->setNome ($txtnome);
          $pro->setEstoque($txtestoq);
          echo "<h3><br><br>" . $pro->salvar() . "</h3>";
      }
      ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>