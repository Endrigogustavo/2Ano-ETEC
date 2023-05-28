/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_aula4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Brunola
 */

public class ExemploJList2 extends JFrame{
    JComboBox lista2;
    JComboBox lista3;
    JList lista;
    String cidades[]={"Rio de Janeiro","São Paulo","Minas Gerais","Espírito Santo"
    ,"Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    JLabel rotulo;
    JLabel rotulo2;
    public ExemploJList2(){
        super("Exemplo de Listas");
        Container tela = getContentPane();
        setLayout(null);
        
        
        exibir= new JButton("Exibir");
        lista= new JList(cidades);
        lista2= new JComboBox(cidades);
        lista3= new JComboBox(cidades);
        rotulo = new JLabel("");
        rotulo2 = new JLabel("");
        lista.setVisibleRowCount(5);
        lista2.setMaximumRowCount(5);
        lista3.setMaximumRowCount(5);
        lista2.setEditable(true);
        
        JScrollPane painelRolagem = new JScrollPane(lista);
    lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        lista.setForeground(Color.blue);
        lista.setBackground(Color.yellow);
        lista.setFont(new Font("Times New Roman",Font.BOLD,16));
        lista2.setBounds(240,100,150,30);
        lista3.setBounds(240,150,150,30);
        painelRolagem.setBounds(40,50,150,100);
        exibir.setBounds(240,50,100,30);
        rotulo.setBounds(50,150,200,30);
        rotulo2.setBounds(50,180,200,30);
        exibir.addActionListener(
    new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Object selecionados[] =lista.getSelectedValues();
        String resultados = "valores selecionados:\n";
        for(int i=0;i<selecionados.length;i++)
            resultados += selecionados[i].toString()+"\n";
        JOptionPane.showMessageDialog(null, resultados);
        
        rotulo.setText("o estado é:" +lista2.getSelectedItem().toString());
        rotulo2.setText("o estado é:" +lista3.getSelectedItem().toString());
      }  } );
         tela.add(painelRolagem);
         tela.add(exibir);
         tela.add(rotulo);
         tela.add(rotulo2);
         tela.add(lista2);
         tela.add(lista3);
         setSize(430,330);    
         setLocationRelativeTo(null);
         setVisible(true);
         
    }
public static void main(String args[]){
    ExemploJList2 app = new ExemploJList2();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}    
    
}
