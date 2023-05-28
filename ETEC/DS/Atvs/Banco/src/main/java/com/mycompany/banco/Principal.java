/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author dti
 */
import javax.swing.*;
public class Principal {
    public static void main(String[] args) {
        Caixa cx1 = new Caixa();
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1-Entrada \n 2-Retirar \n 3-Consultar saldo \n 0-Sair"));
        
        switch (op) {
            case 1:
            cx1.entrar();
            break;
                
            case 2:
            cx1.retirada();
            break;
                
            case 3:
            JOptionPane.showMessageDialog(null, "Saldo atual é " + cx1.getSaldo());
            break;
                
                
            case 0:
            JOptionPane.showMessageDialog(null, "Encerrando operaçao");
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opçao invalida");
      
            
        }
        } while(op !=0);
        
    }
    
}
