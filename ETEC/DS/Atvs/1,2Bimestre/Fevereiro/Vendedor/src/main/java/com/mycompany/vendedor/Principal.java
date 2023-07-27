/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendedor;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Principal {
    public static void main(String[] args) {
        Vendedor vend = new Vendedor("", 0);
        
    double s = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido"));
    
    double resul = vend.calculoCommisao(s);
    
    JOptionPane.showMessageDialog(null,resul);
    }
    
}
