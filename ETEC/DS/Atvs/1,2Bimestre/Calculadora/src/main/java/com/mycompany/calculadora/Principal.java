/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
    public static void main(String[] args) {
         Calculadora cal = new Calculadora();
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1-Soma \n 2-Retirar \n 3-Multiplicar \n 4-Dividir \n 0-Sair"));
        
        switch (op) {
            case 1:
            cal.Somar();
            break;
                
            case 2:
                double aa = Double.parseDouble(JOptionPane.showInputDialog("Digite o N1"));
                double bb = Double.parseDouble(JOptionPane.showInputDialog("Digite o N2"));
                cal.Subtrair(aa, bb);
            break;
               
            case 3:
             
            double num= cal.Multi();
            JOptionPane.showMessageDialog(null, "a resposta é " +num);
            break;
                
            case 4:
             double aaa = Double.parseDouble(JOptionPane.showInputDialog("Digite o N1"));
             double bbb = Double.parseDouble(JOptionPane.showInputDialog("Digite o N2"));
             double resul = cal.div(aaa, bbb);
             
             JOptionPane.showMessageDialog(null, "a divisao é "+resul);
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
    


