/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3part4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dti
 */
public class Ex3 extends JFrame{
    JLabel rotulo1,rotulo2,exibir;
    JTextField texto1,texto2;
    JButton somar;
    
    @SuppressWarnings("Convert2Lambda")
    public Ex3(){
    super("Exemplo de soma");
    Container tela = getContentPane();
    setLayout(null);
    rotulo1 = new JLabel("num 1");
    rotulo2 = new JLabel("num 2");
    texto1 = new JTextField();
    texto2 = new JTextField();
    somar = new JButton();
    exibir = new JLabel("somar");
    
    rotulo1.setBounds(100,40,100,25);
    rotulo2.setBounds(100,80,100,25);
    texto1.setBounds(180,40,200,25);
    texto2.setBounds(180,80,200,25);
    exibir.setBounds(120,170,220,25);
    exibir.setForeground(Color.blue);
     somar.setBounds(500,40,80,25);
    
           
   somar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            int numero1,numero2,soma;
            soma=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 + numero2;
            exibir.setVisible(true);
            exibir.setText("A soma é "+soma);
            }
            }
    
    );
 
    exibir.setVisible(false);
    
    tela.add(rotulo1);
    tela.add(texto1);
    tela.add(exibir);
    tela.add(rotulo2);
    tela.add(somar);
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
