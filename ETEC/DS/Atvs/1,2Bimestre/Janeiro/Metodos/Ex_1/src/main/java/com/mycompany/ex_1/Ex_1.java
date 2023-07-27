/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_1;

import javax.swing.JOptionPane;

public class Ex_1 {
    public static void main(String[] args) {
        int a;
        //Começo do metodo "Digite"
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        //Começo do metodo "Dobro"
        dobro(a);
    }
    
    
    //metodo "Digite"
    static void digite()
    {
        JOptionPane.showMessageDialog(null,"Digite um numero:: ");
    }
    
    
    //metodo "Dobro"
    static void dobro(int n) {
        int d = n * 2;
        JOptionPane.showMessageDialog(null,"Dobro de " +n+ " é " +d);
    }
    
}
