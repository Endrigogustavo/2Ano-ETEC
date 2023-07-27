/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.ds;

/**
 *
 * @author dti
 */

/**
 *
 * @author dti
 */

package text.atvinterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author endri
 */
public class Mult extends JFrame{
    JLabel rotulo1, rotulo2, exibir,nome, imagem;
    JTextField texto1, texto2;
    JButton Mult,sair,limpar,des;
    
    @SuppressWarnings("Convert2Lambda")
    public Mult(){
    super("Exemplo de soma");
    Container tela = getContentPane();
    setLayout(null);
    nome = new JLabel("");
    rotulo1 = new JLabel("1 Numero ");
    rotulo2 = new JLabel("2 numero ");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    exibir = new JLabel("");
    Mult = new JButton("*");
    sair = new JButton("Sair");
    limpar = new JButton("Limpar");
    des = new JButton("Voltar");
    
   
    rotulo1.setBounds(100,40,100,25);
    rotulo2.setBounds(100,80,100,25);
    texto1.setBounds(180,40,200,25);
    texto2.setBounds(180,80,200,25);
    exibir.setBounds(120,170,220,25);
    exibir.setForeground(Color.blue);
    Mult.setBounds(500,40,80,25);
    sair.setBounds(500,250,80,25);
    limpar.setBounds(300,250,80,25);
    des.setBounds(100,250,80,25);
    nome.setBounds(100, 320, 150, 25);
    
    
    
    
    Mult.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            int numero1,numero2,soma;
            soma=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 * numero2;
            exibir.setVisible(true);
            exibir.setText("A multiplicaçao é "+soma);
            }
            }
    
    );
   
            
            sair.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            System.exit(0);
            }
            }
            );
                    
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
   
   
            
            des.addActionListener(
            new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
            Atv atv = new Atv();
            atv.setVisible(true);
            dispose();
            }
            }
    
    
    );
            
            
    Mult.setMnemonic(KeyEvent.VK_ADD);
    limpar.setMnemonic(KeyEvent.VK_5);
    des.setMnemonic(KeyEvent.VK_1);
    sair.setMnemonic(KeyEvent.VK_ENTER);
    
    
    
    
    exibir.setVisible(false);
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(texto1);
    tela.add(texto2);
    tela.add(exibir);
    tela.add(Mult);
    tela.add(sair);
    tela.add(limpar);
    tela.add(des);
    tela.add(nome);
        setSize(700,470);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    
    }
}

