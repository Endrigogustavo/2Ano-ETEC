/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dti
 */
public class Ex2 extends JFrame{
JLabel rotulo1, rotulo2, rotulo3, rotulo4, imagem;
JTextField texto1, texto2, texto3, texto4;
    
    public Ex2(){
    super("Tela 1");
    setLayout(null);
    Container tela = getContentPane();
    rotulo1 = new JLabel("Nome");
    rotulo2 = new JLabel("Idade");
    rotulo3 = new JLabel("Telefone");
    rotulo4 = new JLabel("Celular");
    texto1 = new JTextField(30);
    texto2 = new JTextField(20);
    texto3 = new JTextField(5);
    texto4 = new JTextField(10);
    
        ImageIcon icone = new ImageIcon("src/Imagem.jpg");
        imagem = new JLabel(icone);
    
    texto1.setBounds(200,40,200,25);
    texto2.setBounds(200,80,20,25);
    texto3.setBounds(200,120,80,25);
    texto4.setBounds(200,160,80,25);
    texto1.setForeground(Color.blue);
    texto2.setBackground(Color.yellow);
    texto3.setHorizontalAlignment(JTextField.CENTER);
    
    
      rotulo1.setBounds(100,40,100,25);
      rotulo2.setBounds(100,80,100,25);
      rotulo3.setBounds(100,120,100,25);
      rotulo4.setBounds(100,160,100,25);
      
      rotulo1.setForeground(Color.red);
      rotulo2.setForeground(Color.blue);
      rotulo3.setForeground(Color.green);
      rotulo4.setForeground(Color.ORANGE);
      
      rotulo1.setFont(new Font("Arial",Font.BOLD,14));
      rotulo2.setFont(new Font("Comic Sans",Font.BOLD,16));
      rotulo3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
      rotulo4.setFont(new Font("Tahoma",Font.BOLD,28));
      
          imagem.setBounds(0, 0, 1000, 1000);
          
          
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    
    tela.add(texto1);
    tela.add(texto2);
    tela.add(texto3);
    tela.add(texto4);
    
    tela.add(imagem);
    
   
    
        setSize(1000,1470);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    
    public static void main(String[] args) {
        Ex2 app = new Ex2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
