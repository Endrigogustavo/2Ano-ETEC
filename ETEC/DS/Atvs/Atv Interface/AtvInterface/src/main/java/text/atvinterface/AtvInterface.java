/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.atvinterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author endri
 */
public class AtvInterface extends JFrame{
    JLabel rotulo1, rotulo2, exibir,nome;
    JTextField texto1, texto2;
    JButton somar,subtrair,dividir,multiplicar,sair,limpar,ex,ocultar,habilitar,des;
    
    @SuppressWarnings("Convert2Lambda")
    public AtvInterface(){
    super("Exemplo de soma");
    Container tela = getContentPane();
    setLayout(null);
    nome = new JLabel("Created by Endrigo, 2DS");
    rotulo1 = new JLabel("1 Numero ");
    rotulo2 = new JLabel("2 numero ");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    exibir = new JLabel("");
    somar = new JButton("+");
    subtrair = new JButton("-");
    multiplicar = new JButton("*");
    dividir = new JButton("/");
    sair = new JButton("Sair");
    limpar = new JButton("Limpar");
    ex = new JButton("Exibir");
    ocultar = new JButton("Ocultar");
    habilitar = new JButton("Habilitar");
    des = new JButton("Desabilitar");
   
    
    rotulo1.setBounds(100,40,100,25);
    rotulo2.setBounds(100,80,100,25);
    texto1.setBounds(180,40,200,25);
    texto2.setBounds(180,80,200,25);
    exibir.setBounds(120,170,220,25);
    exibir.setForeground(Color.blue);
    somar.setBounds(500,40,80,25);
    subtrair.setBounds(500,80,80,25);
    multiplicar.setBounds(500,120,80,25);
    dividir.setBounds(500,160,80,25);
    sair.setBounds(500,300,80,25);
    limpar.setBounds(500,250,80,25);
    ex.setBounds(400,250,80,25);
    ocultar.setBounds(300,250,80,25);
    habilitar.setBounds(200,250,80,25);
    des.setBounds(100,250,80,25);
    nome.setBounds(100, 320, 150, 25);
    
    
    
    
    somar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            int numero1,numero2,soma;
            soma=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 + numero2;
            exibir.setVisible(true);
            exibir.setText("A soma é "+soma);
            }
            }
    
    );
        subtrair.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            int numero1,numero2,sub;
            sub=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            sub = numero1 - numero2;
            exibir.setVisible(true);
            exibir.setText("A subtração é "+sub);
            }
            }
    
    );
            multiplicar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            int numero1,numero2,mult;
            mult=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            mult = numero1 * numero2;
            exibir.setVisible(true);
            exibir.setText("A multiplicação é "+mult);
            }
            }
    
    );
            dividir.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            int numero1,numero2,div;
            div=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            div = numero1 / numero2;
            exibir.setVisible(true);
            exibir.setText("A divisão é "+div);
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
            
            ocultar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            exibir.setVisible(false);
            
            }
            }
    
    
    );
            ex.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            exibir.setVisible(true);
          
            }
            }
    
    
    );
             
                                    
            habilitar.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            exibir.setEnabled(true);
           
            }
            }
    
    
    );
            
            des.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            exibir.setEnabled(false);
           
            }
            }
    
    
    );
            
            
    somar.setMnemonic(KeyEvent.VK_ADD);
    subtrair.setMnemonic(KeyEvent.VK_SUBTRACT);
    multiplicar.setMnemonic(KeyEvent.VK_MULTIPLY);
    dividir.setMnemonic(KeyEvent.VK_DIVIDE);
    limpar.setMnemonic(KeyEvent.VK_5);
    ex.setMnemonic(KeyEvent.VK_4);
    ocultar.setMnemonic(KeyEvent.VK_3);
    habilitar.setMnemonic(KeyEvent.VK_2);
    des.setMnemonic(KeyEvent.VK_1);
    sair.setMnemonic(KeyEvent.VK_ENTER);
    
    
    
    
    exibir.setVisible(false);
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(texto1);
    tela.add(texto2);
    tela.add(exibir);
    tela.add(somar);
    tela.add(subtrair);
    tela.add(multiplicar);
    tela.add(dividir);
    tela.add(sair);
    tela.add(limpar);
    tela.add(ex);
    tela.add(ocultar);
    tela.add(habilitar);
    tela.add(des);
    tela.add(nome);
        setSize(700,470);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    
    }

    
    
    public static void main(String[] args) {
        AtvInterface app = new AtvInterface();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
