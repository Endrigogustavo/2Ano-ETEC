/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv_1;

import javax.swing.JOptionPane;

public class Atv_1 {
    
    
    
     public static String nome;
     
     
     public static void main(String[] args) {
         nome=JOptionPane.showInputDialog(null,"Digite o seu nome: ");
         float m;
         
         float num1 =LerNota(); 
         float num2 =LerNota();
         m = calcularMedia(num1, num2);
         if(m<7)
             JOptionPane.showMessageDialog(null,"Reprovado de ano");
         else
         JOptionPane.showMessageDialog(null,"passou de ano");
        
}
     
     static float LerNota()
     {
         
     return Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: "));
     }
     
     static float calcularMedia(float n1, float n2)
     {
         
         return (n1+n2)/2;
     }
}
