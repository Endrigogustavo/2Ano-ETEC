/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dti
 */
public class Ex1 extends JFrame{

    public Ex1(){
    super("Tela 1");
    setLayout(null);
    Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("Imagem.jpg");
        setIconImage(icone.getImage());
        tela.setBackground(new Color(255,128,128));
        setSize(700,470);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    
    public static void main(String[] args) {
        Ex1 app = new Ex1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


