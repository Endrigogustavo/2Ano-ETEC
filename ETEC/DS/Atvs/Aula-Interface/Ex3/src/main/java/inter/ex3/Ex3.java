/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package inter.ex3;

/**
 *
 * @author endri
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.*;
import javax.swing.text.MaskFormatter;

public class Ex3 extends JFrame {


    JButton enviar, limpar, sair;
    JLabel rotulo, rotulo3, rotulo5, rotulo6;
    JTextField texto1, texto2;
    JComboBox lista;
    JRadioButton tam1, tam2, tam3, tam11, tam22, tam33 ;
    ButtonGroup grupo, grupo2;
    MaskFormatter mcep;
    JTextArea texto;
    JScrollPane painelrolagem;
    JPanel painel;

    String estado[] = {"Selecionar","Diurno", "Vespertino", "Noturno"};

    public Ex3() {
        super("Ex3");
        Container tela = getContentPane();
        tela.setLayout(null);
        rotulo = new JLabel("");
        rotulo3 = new JLabel("Sexo");
        rotulo5 = new JLabel("Nome: ");
        rotulo6 = new JLabel("Matricula: ");
        texto1 = new JTextField(20);
        texto2 = new JTextField(10);
        enviar = new JButton("Enviar");
        limpar = new JButton("Limpar");
        sair = new JButton("Sair");
        lista = new JComboBox(estado);
        tam1 = new JRadioButton("Etim");
        tam2 = new JRadioButton("Mtec");
        tam3 = new JRadioButton("Tecnico");
        tam11 = new JRadioButton("1 Serie");
        tam22 = new JRadioButton("2 Serie");
        tam33 = new JRadioButton("3 Serie");
        grupo = new ButtonGroup();
        grupo2 = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo2.add(tam11);
        grupo2.add(tam22);
        grupo2.add(tam33);
       
    texto = new JTextArea(3,15);
    painelrolagem = new JScrollPane(texto);
    painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    painel = new JPanel();
    painel.add(painelrolagem);
    painel.setBounds(100,180,200,70);
    tela.add(rotulo);
    tela.add(painel);
    
        enviar.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

        // criar variaveis que representam dados
        String cursoe="", seriee="";
        String nomee=texto1.getText();
        String matrice =texto2.getText();
        String restre=texto.getText();
        
        String perioe=lista.getSelectedItem().toString();
        
        if(tam1.isSelected())
            seriee= tam1.getText();
        else
             if(tam2.isSelected())
            seriee= tam2.getText();
        else
                  if(tam3.isSelected())
            seriee= tam3.getText();

                      
             if(tam11.isSelected())
            cursoe= tam11.getText();       
        else
          if(tam22.isSelected())
            cursoe= tam22.getText();        
        else
            cursoe= tam33.getText();   
          

            frmMostrar mostrar = new frmMostrar(nomee, matrice, cursoe,  seriee,  perioe, restre);
            mostrar.setVisible(true);
            dispose();
            }
        });
        
         sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    if (opcao==JOptionPane.YES_OPTION)
                         System.exit(0);
   
            }});

         
            
     
         
         
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto1.setText("");
                texto2.setText("");
                grupo.clearSelection();
                grupo2.clearSelection();
                lista.setSelectedIndex(-1);
                texto1.requestFocus();
                texto.setText("");
            }
        });
        try {
            mcep = new MaskFormatter("#####");
            mcep.setPlaceholderCharacter('_');
           
        } catch (ParseException e) {
        }
        
        texto2 = new JFormattedTextField(mcep);
        
        lista.setBounds(260, 110, 120, 20);
        rotulo.setBounds(30, 320, 350, 20);
        rotulo5.setBounds(20, 30, 50, 20);
        rotulo6.setBounds(20, 60, 50, 20);
        texto1.setBounds(60, 30, 180, 20);
        texto2.setBounds(60, 60, 70, 20);
        enviar.setBounds(30, 270, 100, 20);
        limpar.setBounds(170, 270, 100, 20);
        sair.setBounds(320, 270, 100, 20);
        tam1.setBounds(30, 110, 100, 20);
        tam2.setBounds(30, 130, 100, 20);
        tam3.setBounds(30, 150, 100, 20);
        tam11.setBounds(150, 110, 100, 20);
        tam22.setBounds(150, 130, 100, 20);
        tam33.setBounds(150, 150, 100, 20);
      

        enviar.setMnemonic(KeyEvent.VK_F1);
        limpar.setMnemonic(KeyEvent.VK_F2);
        


        tela.add(rotulo);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(enviar);
        tela.add(limpar);
        tela.add(lista);
        tela.add(tam1);
        tela.add(tam2);
        tela.add(tam3);
        tela.add(tam11);
        tela.add(tam22);
        tela.add(tam33);
        tela.add(sair);

        setSize(540, 430);
        setLocationRelativeTo(null);
        setVisible(true);

    }

      public static void main(String args[]) {
        Ex3 app = new Ex3();

        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    
  