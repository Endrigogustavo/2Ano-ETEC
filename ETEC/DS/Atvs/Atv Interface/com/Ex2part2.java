/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.ex2part2;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.awt.event.*;
import javax.swing.text.*;

/**
 *
 * @author dti
 */
public class Ex2part2 extends JFrame{
JLabel rotulo1, rotulo2, rotulo3, rotulo4, imagem;
JTextField texto1, texto2, texto3, texto4;
MaskFormatter mcep, mtel,mcpt,mdata;
    
    public Ex2part2(){
    super("Tela 1");
    setLayout(null);
    Container tela = getContentPane();
    rotulo1 = new JLabel("CEP");
    rotulo2 = new JLabel("Telefone");
    rotulo3 = new JLabel("CPF");
    rotulo4 = new JLabel("Data");
    texto1 = new JTextField();
    texto2 = new JTextField();
    texto3 = new JTextField();
    texto4 = new JTextField();
 

    
      rotulo1.setBounds(100,40,100,25);
      rotulo2.setBounds(100,80,100,25);
      rotulo3.setBounds(100,120,100,25);
      rotulo4.setBounds(100,160,100,25);
      
        try {
            mcep = new MaskFormatter("#####-###");
            mtel = new MaskFormatter("(##)#####-####");
            mcpt = new MaskFormatter("#########-##");
            mdata = new MaskFormatter("##/##/####");
            mcep.setPlaceholderCharacter('_');
            mdata.setPlaceholderCharacter('_');
            mtel.setPlaceholderCharacter('_');
            mcpt.setPlaceholderCharacter('_');
        } catch (ParseException e) {
        }
        
        texto1 = new JFormattedTextField(mcep);
        texto2 = new JFormattedTextField(mtel);
        texto3 = new JFormattedTextField(mcpt);
        texto4 = new JFormattedTextField(mdata);
        
            
    texto1.setBounds(200,40,200,25);
    texto2.setBounds(200,80,20,25);
    texto3.setBounds(200,120,80,25);
    texto4.setBounds(200,160,80,25);


    
          
          
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    
    tela.add(texto1);
    tela.add(texto2);
    tela.add(texto3);
    tela.add(texto4);
    
    
   
    
        setSize(1000,1470);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    
    public static void main(String[] args) {
        Ex2part2 app = new Ex2part2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


