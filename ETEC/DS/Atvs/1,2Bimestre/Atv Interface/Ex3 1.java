/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.ex3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author endri
 */
public class Ex3 extends JFrame{

    JButton sair;
    
    @SuppressWarnings("Convert2Lambda")
    public Ex3(){
    super("Exemplo de soma");
    Container tela = getContentPane();
    setLayout(null);
    sair = new JButton("Sair");
    sair.setBounds(100,50,100,20);

            sair.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            System.exit(0);
            }
            }
            );
              
    tela.add(sair);
    
        setSize(300,150);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    
    }

    
    
    public static void main(String[] args) {
        Ex3 app = new Ex3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


