/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3part5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ex3 extends JFrame{
    JLabel rotulo1,rotulo2;
    
    JButton limpar;
    
    JTextField texto1, texto2;
    
    @SuppressWarnings("Convert2Lambda")
    public Ex3(){
    super("Exemplo de soma");
    Container tela = getContentPane();
    setLayout(null);
    rotulo1 = new JLabel("1 Numero ");
    rotulo2 = new JLabel("2 numero ");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    limpar = new JButton("Limpar");
   
    rotulo1.setBounds(100,40,100,25);
    rotulo2.setBounds(100,80,100,25);
    texto1.setBounds(180,40,200,25);
    texto2.setBounds(180,80,200,25);
    limpar.setBounds(500,250,80,25);
  
    
    limpar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            texto1.setText(null);
            texto2.setText(null);
            texto1.requestFocus();
            }
            }
    
    
    );

    
    
    tela.add(rotulo1);
    tela.add(texto1);
    tela.add(rotulo2);
    tela.add(limpar);
    tela.add(texto2);
        setSize(700,470);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    
    }

    
    
    public static void main(String[] args) {
        Ex3 app = new Ex3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


