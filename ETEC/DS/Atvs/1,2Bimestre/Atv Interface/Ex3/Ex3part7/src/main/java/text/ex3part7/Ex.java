/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.ex3part7;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ex extends JFrame{
    JLabel rotulo1,rotulo2;
    
    JButton habilitar, des;
    
    @SuppressWarnings("Convert2Lambda")
    public Ex(){
    super("Exemplo de soma");
    Container tela = getContentPane();
    setLayout(null);
    rotulo1 = new JLabel("1 Numero ");
    rotulo2 = new JLabel("2 numero ");
    habilitar = new JButton("Habilitar");
    des = new JButton("Desabilitar");
   
    
   
    rotulo1.setBounds(100,40,100,25);
    rotulo2.setBounds(100,80,100,25);
     habilitar.setBounds(200,250,80,25);
    des.setBounds(100,250,80,25);
    
      habilitar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            rotulo1.setEnabled(true);
            rotulo2.setEnabled(true);
           
            }
            }
    
    
    );
            
            des.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            rotulo1.setEnabled(false);
            rotulo2.setEnabled(false);
           
            }
            }
    
    
    );
            
    
    
    tela.add(rotulo1);
    tela.add(rotulo2);

        setSize(700,470);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    
    }

    
    
    public static void main(String[] args) {
        Ex app = new Ex();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
