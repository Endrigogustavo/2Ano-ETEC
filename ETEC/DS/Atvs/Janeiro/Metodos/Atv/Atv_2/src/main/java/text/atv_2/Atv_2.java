/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.atv_2;

import javax.swing.JOptionPane;
public class Atv_2 {
   
    public static void main(String[] args) {
      float num1,num2 ,num5 = 0;
      
      num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o Primeiro numero"));
      num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
      Diferença(num1, num2, num5);
    }
    
    static void Diferença(float n1, float n2,float n3)
    {
    n3 =n1-n2;
    JOptionPane.showMessageDialog(null, "A diferença é: "+n3);
    
    }
}
