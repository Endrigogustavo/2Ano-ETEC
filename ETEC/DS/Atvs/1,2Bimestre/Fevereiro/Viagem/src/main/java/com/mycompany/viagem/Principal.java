/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viagem;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Principal {
    
    public static void main(String[] args) {
        Percurso per = new Percurso();
        Custo c = new Custo();
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1-Cadastro \n 2-Lista \n 3-Calculo\n 0-Sair"));
        
        switch (op) {
            case 1:
            per.CadastrarPercurso();
            break;
                
            case 2:
               per.ListarPercurso();
            break;
               
            case 3:
             c.calcularViagem(per);
            
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
    

