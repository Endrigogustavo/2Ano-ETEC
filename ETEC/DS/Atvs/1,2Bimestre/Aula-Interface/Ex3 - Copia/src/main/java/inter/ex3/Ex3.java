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
import java.util.*;

public class Ex3 extends JFrame {

    JButton copiar, limpar;
    JLabel rotulo, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6;
    JTextField texto1, texto2;
    JComboBox lista;
    JRadioButton tam1, tam2;
    ButtonGroup grupo;
    JCheckBox auto, bar, av;

    String estado[] = {"Solteiro (a)", "Casado (a)", "Divorciado (a)", "Viúvo (a)"};

    public Ex3() {
        super("Ex3");
        Container tela = getContentPane();
        tela.setLayout(null);
        rotulo = new JLabel("");
        rotulo2 = new JLabel("Interesses:");
        rotulo3 = new JLabel("Sexo");
        rotulo4 = new JLabel("Estado Civil:");
        rotulo5 = new JLabel("Nome: ");
        rotulo6 = new JLabel("Idade: ");
        texto1 = new JTextField(20);
        texto2 = new JTextField(10);
        copiar = new JButton("Enviar");
        limpar = new JButton("Limpar");
        lista = new JComboBox(estado);
        tam1 = new JRadioButton("Masculino");
        tam2 = new JRadioButton("Feminino");
        grupo = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        auto = new JCheckBox("Automovel");
        bar = new JCheckBox("Barco");
        av = new JCheckBox("Aviao");

        copiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                texto2.setText(texto1.getText().toLowerCase());
            }
        });
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto1.setText("");
                texto2.setText("");
                auto.setSelected(false);
                bar.setSelected(false);
                av.setSelected(false);
                grupo.clearSelection();
                lista.setSelectedIndex(-1);
                texto1.requestFocus();
            }
        });

        lista.setBounds(120, 230, 120, 20);
        rotulo.setBounds(30, 320, 350, 20);
        rotulo2.setBounds(30, 120, 280, 20);
        rotulo3.setBounds(20, 90, 50, 20);
        rotulo4.setBounds(30, 230, 120, 20);
        rotulo5.setBounds(20, 30, 50, 20);
        rotulo6.setBounds(20, 60, 50, 20);
        texto1.setBounds(60, 30, 180, 20);
        texto2.setBounds(60, 60, 70, 20);
        copiar.setBounds(30, 270, 100, 20);
        limpar.setBounds(170, 270, 100, 20);
        tam1.setBounds(70, 90, 100, 20);
        tam2.setBounds(170, 90, 100, 20);
        auto.setBounds(30, 140, 100, 20);
        bar.setBounds(30, 160, 100, 20);
        av.setBounds(30, 180, 100, 20);
        copiar.setToolTipText("Botão que deixa a fonte maiúscula e minúscula");
        limpar.setToolTipText("Botão que limpa o texto");
        rotulo.setText("Criado por Endrigo  2 ds");

        copiar.setMnemonic(KeyEvent.VK_F1);
        limpar.setMnemonic(KeyEvent.VK_F2);

        tela.add(rotulo);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(copiar);
        tela.add(limpar);
        tela.add(lista);
        tela.add(av);
        tela.add(auto);
        tela.add(bar);
        tela.add(tam1);
        tela.add(tam2);

        copiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Seu nome é " + texto1.getText() + "\n Sua idade é " + texto2.getText() + "\n E seu estado civil é " + lista.getSelectedItem().toString());
            }
        });

        setSize(540, 430);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String args[]) {
        Ex3 app = new Ex3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //alt shift F edenta tudo
}
