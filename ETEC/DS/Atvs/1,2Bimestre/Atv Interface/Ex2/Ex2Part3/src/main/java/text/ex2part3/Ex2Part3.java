/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.ex2part3;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.awt.event.*;
import javax.swing.text.*;

/**
 *
 * @author dti
 */
public class Ex2Part3 extends JFrame{
JLabel rotulo;
JTextArea texto;
JScrollPane painelrolagem;
JPanel painel;
public Ex2Part3(){
    super("ExemplocomJTextField");
    Container tela = getContentPane();
    tela.setLayout(null);
    rotulo = new JLabel("Endereço");
    rotulo.setBounds(50,20,100,20);
    texto = new JTextArea(10,20);
    painelrolagem = new JScrollPane(texto);
    painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    painel = new JPanel();
    painel.add(painelrolagem);
    painel.setBounds(40,40,250,250);
    tela.add(rotulo);
    tela.add(painel);
    setSize(300,280);
    setVisible(true);
    setLocationRelativeTo(null);
    }

    
    
    public static void main(String[] args) {
        Ex2Part3 app = new Ex2Part3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
