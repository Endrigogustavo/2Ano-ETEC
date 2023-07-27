/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3part3;
    
package text.atvinterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dti
 */
public class Ex3 extends JFrame{
    JLabel rotulo1, exibir;
    JPasswordField texto1;
    JButton ocultar;
    
    @SuppressWarnings("Convert2Lambda")
    public Ex3(){
    super("Exemplo de soma");
    Container tela = getContentPane();
    setLayout(null);
    exibir = new JLabel();
   
    rotulo1 = new JLabel("senha");
    texto1 = new JPasswordField(5);
    ocultar = new JButton("Mostrar");
   
    rotulo1.setBounds(100,40,100,25);
    texto1.setBounds(180,40,200,25);
    ocultar.setBounds(300,250,80,25);
    exibir.setBounds(120,170,220,25);
  
    
           
            ocultar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String senha = new String(texto1.getPassword());
            exibir.setVisible(true);
            exibir.setText(senha);
            }
            }
    
    
    );
 
    exibir.setVisible(false);
    
    tela.add(rotulo1);
    tela.add(texto1);
    tela.add(exibir);
    tela.add(ocultar);
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


