/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.atv_3;

import javax.swing.JOptionPane;

public class Atv_3 {

    public static void main(String[] args) {
        String sexo = "", nome = "";
        float altura = 0;
        
         nome=JOptionPane.showInputDialog("Digite seu nome");
        sexo=JOptionPane.showInputDialog("Digite h para Homen e m para mulher");
        altura=Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura"));
        
        
        String text = calcularpessoideal(sexo,altura);
        
        JOptionPane.showMessageDialog(null,"Sr."+nome+" seu peso ideal considerando sua altura " +text);
      
         
    }
    
    static String calcularpessoideal(String s,float al)
    {    
        float id;
        String homen = "h";
        if( !s.equals(homen) )
        {
           
            id=(float) ((62.1*al)-44.7);
            return "é "+id;
        }
        else
        {
            id=(float) ((72.7*al)-58);
            return"é "+id;
        }
       
        
    }
}
