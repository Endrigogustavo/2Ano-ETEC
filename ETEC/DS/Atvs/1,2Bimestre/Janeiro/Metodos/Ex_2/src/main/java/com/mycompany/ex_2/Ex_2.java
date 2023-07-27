/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_2;

import javax.swing.JOptionPane;

public class Ex_2 {
     public static void main(String[] args) {
        int t;
        String p;
        //Começo do metodo "Digite"
        digite();
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t = tamanho(p);
       JOptionPane.showMessageDialog(null,p+ " Possui " +t+ " Caracteres");
    }
    
    
    //metodo "Digite"
    static void digite()
    {
        JOptionPane.showMessageDialog(null,"Digite uma palavra qualquer:  ");
    }
    
    
    //metodo "Dobro"

    static int tamanho(String x) {
       return x.length();
    }
  
}

