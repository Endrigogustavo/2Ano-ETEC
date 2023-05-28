<html>
    
    <head>
        <title>Página verificarmes.php </title>
        
        </head>

        <body>
            <br>
            <?php 
             $mes = $_POST['txtnum'];  
             switch ( $mes ){       
                case 1:             
                echo "JANEIRO";             
                break;       
                    
                case 2:echo "FEVEREIRO";              
                break;       
                case 3:            
                echo "MARÇO";
                break;       
                case 4:             
                echo "ABRIL";              
                break;       
                case 5:             
                echo "MAIO";             
                break;      
                case 6:echo "JUNHO";              
                break;       
                case 7:             
                echo "JULHO";              
                break;      
                case 8:             
                echo "AGOSTO";             
                break;
                case 9:echo "SETEMBRO";
                break;       
                case 10:            
                echo "OUTUBRO";
                break;       
                case 11:             
                echo "NOVEMBRO";              
                break;       
                case 12:echo "DEZEMBRO";              
                break;       
                default:            
                echo "MÊS INCORRETO!";     
                
                }                           
                
                ?>
                
            </body>

        </html>