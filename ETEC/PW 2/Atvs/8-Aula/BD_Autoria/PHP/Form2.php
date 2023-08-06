<html>
    <body>
     <form name="cliente"  method = "POST" action = "">
        <fieldset id="a">
           <legend><b> Dados do Autoria: </b></legend>
               <p> Código do Autor: <input name="txtcoda" type="text" size="1" placeholder="0"> 
               <p> Código do Livro: <input name="txtcodl" type="text" size="1" placeholder="0"> 
               <p> Nome da Editora: <input name="txtedit" type="text" size="40" maxlegth="40" placeholder="Nome">
               <p> Data de Lançamento: <input name="txtdatal" type="text" size="10" placeholder="0"> </p>
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
          include_once 'Autoria.php';
          $pro=new Produto();
          $pro->setCod_autor($txtcoda);
          $pro->setCod_livro($txtcodl);
          $pro->setDatalancamento($txtdatal);
          $pro->seteditoria($txtedit);
          echo "<h3><br><br>" . $pro->salvar() . "</h3>";
      }
      ?>
      <br>

      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>