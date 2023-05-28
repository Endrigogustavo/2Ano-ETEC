/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.ex3part6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ex3 extends JFrame{
    JLabel rotulo1,rotulo2;
    
    JButton ocultar,ex;

    
    @SuppressWarnings("Convert2Lambda")
    public Ex3(){
    super("Exemplo de soma");
    Container tela = getContentPane();
    setLayout(null);
    rotulo1 = new JLabel("1 Numero ");
    rotulo2 = new JLabel("2 numero ");
    ex = new JButton("Exibir");
    ocultar = new JButton("Ocultar");

   
    rotulo1.setBounds(100,40,100,25);
    rotulo2.setBounds(100,80,100,25);
     ex.setBounds(400,250,80,25);
    ocultar.setBounds(300,250,80,25);
    
       ocultar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            rotulo1.setVisible(false);
            rotulo2.setVisible(false);
            
            }
            }
    
    
    );
            ex.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            rotulo1.setVisible(true);
            rotulo2.setVisible(true);
          
            }
            }
    
    
    );
             
  
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(ex);
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