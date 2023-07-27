/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.ds;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.*;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author dti
 */
public class Sobre extends javax.swing.JFrame{
    
    
JLabel rotulo, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6;
JButton voltar, sair;


public Sobre(){
    //nomee, matrice, cursoe,  seriee,  perioe, restre
Container tela = getContentPane();
tela.setLayout(null);
rotulo = new JLabel("Nome: ");rotulo2 = new JLabel("");
rotulo3 = new JLabel("Data: ");rotulo4 = new JLabel("");
rotulo5 = new JLabel("Sala :");rotulo6 = new JLabel("");

sair = new JButton("Sair");
voltar = new JButton("Voltar");

 rotulo.setBounds(30, 20, 350, 20);rotulo2.setBounds(160, 20, 350, 20);
 rotulo3.setBounds(30, 50, 350, 20);rotulo4.setBounds(160, 50, 350, 20);
 rotulo5.setBounds(30, 70, 350, 20);rotulo6.setBounds(160, 70, 350, 20);

 sair.setBounds(30, 200, 100, 20);
 voltar.setBounds(160, 200, 100, 20);
 
    rotulo2.setText("Endrigo Gustavo");
    rotulo4.setText("22/06/2023");
    rotulo6.setText("2 DS AMS");

        sair.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                System.exit(0);
                
            }
        });
         
    voltar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Atv ex3 = new Atv();
            ex3.setVisible(true);
            dispose();
            }
        });
 tela.add(rotulo);
 tela.add(rotulo2);
 tela.add(rotulo3);
 tela.add(rotulo4);
 tela.add(rotulo5);
 tela.add(rotulo6);

 tela.add(sair);
 tela.add(voltar);
 
setSize(300, 300);
setLocationRelativeTo(null);
setVisible(true);
        
}




}
