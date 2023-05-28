/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_3;

import javax.swing.JOptionPane;

public class Ex_3 {
      public static void main(String[] args) {
        int idade1, idade2;
        String nome1, nome2;
        //Parte do dialogo"
       nome1=JOptionPane.showInputDialog("Digite o nome da 1 pessoa: ");
       idade1=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1 pessoa: "));
       
       nome2=JOptionPane.showInputDialog("Digite o nome da 2 pessoa: ");
       idade2=Integer.parseInt(JOptionPane.showInputDialog("Digite o nome da 2 pessoa: "));
       //Começo metodo pessoamaisvelha
       String texto = PessoaMaisVelha(nome1, idade1, nome2, idade2);
       
       JOptionPane.showMessageDialog(null, texto);
    }
    
    static String PessoaMaisVelha(String n1,int id1, String n2, int id2)
    {
        //parte do if else para descobrir o mais velho
        if(id1 > id2)
            return n1 + " é a mais velha";
            else
             if(id2 > id1)
            return n2 + " é a mais velha";
                else
                 return n1 + " e " +n2+ " tem a mesma idade";
    }
   
   
}
