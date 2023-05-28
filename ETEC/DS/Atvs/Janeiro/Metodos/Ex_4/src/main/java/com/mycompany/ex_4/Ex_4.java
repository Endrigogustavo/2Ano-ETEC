/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_4;

import javax.swing.JOptionPane;

public class Ex_4 {
    public static void main(String[] args) {
         int num;
         //reconhecimento do numeor
     num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro numero"));
     //analise par ou impar
     if (RestoPorDois(num) == 0)
     JOptionPane.showMessageDialog(null, "O numero é par. \n");
     else
     JOptionPane.showMessageDialog(null, "O numero é impar. \n");
    }
    
     static int RestoPorDois(int a) 
     {
         //conta par ou impar
     return a % 2;
     
     }
}

