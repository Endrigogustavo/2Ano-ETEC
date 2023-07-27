/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter.ex3;

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
public class frmMostrar extends javax.swing.JFrame{
    
    
JLabel rotulo, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8, rotulo9, rotulo10, rotulo11, rotulo12;

JButton voltar, sair;


public frmMostrar(String n, String matr, String cur, String ser, String per, String res){
    //nomee, matrice, cursoe,  seriee,  perioe, restre
Container tela = getContentPane();
tela.setLayout(null);
rotulo = new JLabel("Nome: ");rotulo2 = new JLabel("");
rotulo3 = new JLabel("Matricula: ");rotulo4 = new JLabel("");
rotulo5 = new JLabel("Curso");rotulo6 = new JLabel("");
rotulo7 = new JLabel("Série");rotulo8 = new JLabel("");
rotulo9 = new JLabel("Periodo");rotulo10 = new JLabel("");
rotulo11 = new JLabel("Restriços Medicas");rotulo12 = new JLabel("");

sair = new JButton("Sair");
voltar = new JButton("Voltar");

 rotulo.setBounds(30, 20, 350, 20);rotulo2.setBounds(160, 20, 350, 20);
 rotulo3.setBounds(30, 50, 350, 20);rotulo4.setBounds(160, 50, 350, 20);
 rotulo5.setBounds(30, 70, 350, 20);rotulo6.setBounds(160, 70, 350, 20);
 rotulo7.setBounds(30, 90, 350, 20);rotulo8.setBounds(160, 90, 350, 20);
 rotulo9.setBounds(30, 110, 350, 20);rotulo10.setBounds(160, 110, 350, 20);
 rotulo11.setBounds(30, 130, 350, 20);rotulo12.setBounds(160, 130, 350, 20);
 
 sair.setBounds(30, 200, 100, 20);
 voltar.setBounds(160, 200, 100, 20);
 
    rotulo2.setText(n);
    rotulo4.setText(matr);
    rotulo6.setText(ser);
    rotulo8.setText(cur);
    rotulo10.setText(per);
    rotulo12.setText(res);
    
        sair.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                System.exit(0);
                
            }
        });
         
    voltar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Ex3 ex3 = new Ex3();
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
 tela.add(rotulo7);
 tela.add(rotulo8);
 tela.add(rotulo9);
 tela.add(rotulo10);
 tela.add(rotulo11);
 tela.add(rotulo12);
 tela.add(sair);
 tela.add(voltar);
 
setSize(300, 300);
setLocationRelativeTo(null);
setVisible(true);
        
}




}

