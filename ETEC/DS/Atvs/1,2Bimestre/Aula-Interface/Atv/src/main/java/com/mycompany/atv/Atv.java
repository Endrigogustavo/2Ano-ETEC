/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author dti
 */
public class Atv extends JFrame{
    JLabel rot1,rot2,rot3,texto;
    JCheckBox negrito, italico,normal,negritoitalico;
    JRadioButton tam1,tam2,tam3,tam4;
    ButtonGroup grupo;
    String cor[] = {"Sem cor","Vermelho","Azul","Verde","Amarelo","Branco","Preto"};
    JComboBox lista;
    Integer estilo, tamfonte;
    
     public Atv(){
     super("Ex2");
      
     Container tela = getContentPane();
        setLayout(null);
        rot1 = new JLabel("Cor");
        rot2 = new JLabel("Estilo");
        rot3 = new JLabel("Tamanho");
        texto = new JLabel("Programa feito em Java");
        lista = new JComboBox(cor);
        lista.setMaximumRowCount(7);
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Itálico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Itálico");
        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("14");
        tam3 = new JRadioButton("16");
        tam4 = new JRadioButton("18");
        grupo = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);
        rot1.setBounds(40,20,70,20);
        rot2.setBounds(200,20,70,20);
        rot3.setBounds(300,20,70,20);
        texto.setBounds(100,200,300,20);
        lista.setBounds(40,50,150,20);
        negrito.setBounds(200,50,100,20);
        italico.setBounds(200,70,100,20);
        normal.setBounds(200,90,100,20);
        negritoitalico.setBounds(200,110,100,20);
        tam1.setBounds(350,50,100,20);
        tam2.setBounds(350,70,100,20);
        tam3.setBounds(350,90,100,20);
        tam4.setBounds(350,110,100,20);
        tamfonte=12;
        estilo=Font.PLAIN;
        
        
         tela.add(rot1);
         tela.add(rot2);
         tela.add(rot3);
         tela.add(texto);
         tela.add(negrito); tela.add(italico);
         tela.add(normal); tela.add(negritoitalico);
         tela.add(tam1); tela.add(tam2);
         tela.add(tam3); tela.add(tam4);
         tela.add(lista);
         setSize(500,300);
         setLocationRelativeTo(null);
         setVisible(true);
    }
    
   public static void main(String[] args) {
        Atv app = new Atv();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

