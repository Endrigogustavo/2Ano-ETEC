/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package inter.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author dti
 */
public class Ex1 extends JFrame{
   
    JComboBox lista2;
    JList lista;
    String cidades[]={"Rio de Janeiro","São Paulo","Minas Gerais","Espírito Santo"
    ,"Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    JLabel rotulo;

    public Ex1(){
        super("Exemplo de Listas");
        Container tela = getContentPane();
        setLayout(null);
        
        
        exibir= new JButton("Exibir");
        lista= new JList(cidades);
        lista2= new JComboBox(cidades);
        rotulo = new JLabel("");
        lista.setVisibleRowCount(5);
        lista2.setMaximumRowCount(5);
        lista2.setEditable(true);
        
        JScrollPane painelRolagem = new JScrollPane(lista);
    lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        lista.setForeground(Color.green);
        lista.setBackground(Color.CYAN);
        lista2.setBounds(140,140,150,30);
        painelRolagem.setBounds(140,20,150,100);
        exibir.setBounds(150,200,90,30);
        rotulo.setBounds(50,150,200,30);
        exibir.addActionListener(
    new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Object selecionados[] =lista.getSelectedValues();
        String resultados = "valores selecionados:\n";
        for(int i=0;i<selecionados.length;i++)
            resultados += selecionados[i].toString()+"\n";
        JOptionPane.showMessageDialog(null, resultados);
        
        rotulo.setText("o estado é:" +lista2.getSelectedItem().toString());
      }  } );
         tela.add(painelRolagem);
         tela.add(exibir);
         tela.add(rotulo);
         tela.add(lista2);
         setSize(430,330);    
         setLocationRelativeTo(null);
         setVisible(true);
         
    }
    
    public static void main(String[] args) {
        Ex1 app = new Ex1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}