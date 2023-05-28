/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.ex_interface;
import javax.swing.*;
import java.awt.*;

public class Limpar extends JFrame{
    JLabel rotulo1,rotulo2;
    JTextField texto1,texto2;
    JButton limpar;
    public Limpar(){
        super("ExemploLimpar");
    Container tela = getContentPane();
    setLayout(null);
    rotulo1 = new JLabel("1ºNúmero:");
    rotulo2 = new JLabel("2ºNúmero:");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    limpar = new JButton("Limpar");
    rotulo1.setBounds(50,20,100,20);
    rotulo2.setBounds(50,60,100,20);
    texto1.setBounds(120,20,200,20);
    texto2.setBounds(120,60,200,20);
    limpar.setBounds(150,100,80,20);
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(texto1);
    tela.add(texto2);
    tela.add(limpar);
    setSize(400,250);
    setVisible(true);
    }
    public static void main(String args[]){
        Limpar app = new Limpar();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}