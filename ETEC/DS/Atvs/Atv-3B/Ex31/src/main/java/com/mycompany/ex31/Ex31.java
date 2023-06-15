/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex31 extends JFrame{
    JMenuBar barra;
    JMenu opcoes,fonte,cor;
    JMenuItem limpar,sair,azul,verde,vermelho,amarelo,preto;
    JTextArea texto;
    JPanel painel;
    JScrollPane rolagem;
    public Ex31(){
        super("Exemplo de Menus executando acoes");
        Container tela = getContentPane();
        tela.setLayout(null);
        barra = new JMenuBar();
        setJMenuBar(barra);
        opcoes = new JMenu("Opcoes");
        barra.add(opcoes);
        limpar = new JMenuItem("Limpar");
        fonte = new JMenu("Fonte");
        cor = new JMenu("Cor");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        preto = new JMenuItem("Preto");
        sair = new JMenuItem("Sair");
        opcoes.setMnemonic(KeyEvent.VK_O);
        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        sair.setMnemonic(KeyEvent.VK_S);
        cor.setMnemonic(KeyEvent.VK_C);
        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.addSeparator();
        opcoes.add(sair);
        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(preto);
        fonte.add(cor);
        texto = new JTextArea(10,20);
        rolagem = new JScrollPane(texto);
        rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        painel = new JPanel();
        painel.add(rolagem);
        painel.setBounds(30,30,250,250);
        tela.add(painel);
        limpar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("");
                texto.requestFocus();
            }
        });
        azul.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                texto.setForeground(Color.blue);
                repaint();
            }});
        verde.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                texto.setForeground(Color.green);repaint();}});vermelho.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){texto.setForeground(Color.red);repaint();}});amarelo.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){texto.setForeground(Color.yellow);repaint();}});preto.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){texto.setForeground(Color.black); repaint();}});sair.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.exit(0);}
});setSize(500,300);setLocationRelativeTo(null);setVisible(true);}public static void main (String args[]){Ex31 app = new Ex31();app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}}


