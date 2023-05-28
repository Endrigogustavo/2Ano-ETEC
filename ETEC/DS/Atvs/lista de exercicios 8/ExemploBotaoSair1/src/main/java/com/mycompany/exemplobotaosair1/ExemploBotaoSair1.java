/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplobotaosair1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author the nolabruno
 */
public class ExemploBotaoSair1 extends JFrame{
JButton botao1,erro, informacao, exclamacao, pergunta, nenhum,copiar,limpar;
String nome,texto;;
JLabel rotulo,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6;
JTextField texto1,texto2;
int ds,dia,mes,ano,hh,mm,ss,h;
Calendar data,hora;
DecimalFormat formato;
String diasemana[]={"Domingo","Segunda - Feira","Terça - Feira","Quarta - Feira",
"Quinta - Feira","Sexta - Feira","Sábado"};
String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
"Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
Object linguagens [] = {"Java","Delphi","C++","Visual Basic"};


public ExemploBotaoSair1(){
super("Exemplo de Input Dialog");
Container tela = getContentPane();
tela.setLayout(null);
nome = JOptionPane.showInputDialog("Entre com seu nome: ");
rotulo = new JLabel("");
botao1 = new JButton("Sair");
erro = new JButton("Erro");
informacao = new JButton("Informação");
exclamacao = new JButton("Exclamação");
pergunta = new JButton("Pergunta");
nenhum = new JButton("Nenhum");
rotulo2 = new JLabel("");
rotulo3 = new JLabel("");
rotulo4 = new JLabel("");
rotulo5 = new JLabel("Nome: ");
rotulo6 = new JLabel("Nome: ");
texto1 = new JTextField(20);
texto2 = new JTextField(20);
copiar = new JButton("Copiar");
limpar = new JButton("Limpar");

//horas//
ActionListener tarefa = (new ActionListener(){
public void actionPerformed(ActionEvent e){
HORAS();
}
});
javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
time.start();


//data
data = Calendar.getInstance();
ds = data.get(Calendar.DAY_OF_WEEK);
dia = data.get(Calendar.DAY_OF_MONTH);
mes = data.get(Calendar.MONTH);
ano = data.get(Calendar.YEAR);
rotulo2.setText("Data: "+ds+" "+dia+"/"+(mes+1)+"/"+ano);
rotulo3.setText("Data: "+diasemana[ds-1]+", "+dia+" de "+meses[mes]+" de "+ano);


//minu,maiu//
copiar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

texto = texto1.getText().toUpperCase();
texto1.setText(texto);
texto2.setText(texto1.getText().toLowerCase());}});
limpar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
texto1.setText("");
texto2.setText("");
texto1.requestFocus();}});


//posicionamento na janela//
erro.setBounds(30,300,80,20);
informacao.setBounds(110,300,100,20);
exclamacao.setBounds(210,300,110,20);
pergunta.setBounds(320,300,90,20);
nenhum.setBounds(400,300,90,20);
rotulo.setBounds(30,200,350,20);
rotulo2.setBounds(30,350,280,20);
rotulo3.setBounds(30,330,280,20);
rotulo4.setBounds(300,330,280,20);
rotulo5.setBounds(20,30,50,20);
rotulo6.setBounds(20,60,50,20);
texto1.setBounds(60,30,180,20);
texto2.setBounds(60,60,180,20);
copiar.setBounds(20,130,100,20);
limpar.setBounds(140,130,100,20);
botao1.setBounds(320,200,90,20);//sair
botao1.setToolTipText("Botão que finaliza a janela");
copiar.setToolTipText("Botão que deixa a fonte maiúscula e minúscula");
limpar.setToolTipText("Botão que limpa o texto");
erro.setToolTipText("Botão que exibe uma messagem de erro");
informacao.setToolTipText("Botão que exibe uma messagem de informação");
exclamacao.setToolTipText("Botão que exibe uma messagem de exclamação");
pergunta.setToolTipText("Botão que exibe uma messagem de pergunta");
nenhum.setToolTipText("Botão que exibe uma messagem de nada");
rotulo.setText("O nome digitado foi: "+nome.toUpperCase());

tela.add(rotulo);
tela.add(rotulo2);
tela.add(rotulo3);
tela.add(rotulo4);
tela.add(rotulo5);
tela.add(rotulo6);
tela.add(texto1);
tela.add(texto2);
tela.add(botao1);
tela.add(copiar);
tela.add(limpar);
tela.add(erro);
tela.add(informacao);
tela.add(exclamacao);
tela.add(pergunta);
tela.add(nenhum);


//popups
erro.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    JOptionPane.showMessageDialog(null,"Você escolheu erro","Mensagem de Erro",JOptionPane.ERROR_MESSAGE,null);}});
informacao.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
JOptionPane.showMessageDialog(null,"Você escolheu informação","Mensagem de Informação",JOptionPane.INFORMATION_MESSAGE,null);}});
exclamacao.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
JOptionPane.showMessageDialog(null,"Você escolheu exclamação","Mensagem de Exclamação",JOptionPane.WARNING_MESSAGE,null);}});
pergunta.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
JOptionPane.showMessageDialog(null,"Você escolheu pergunta","Mensagem de Pergunta",JOptionPane.QUESTION_MESSAGE,null);}});
nenhum.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
JOptionPane.showMessageDialog(null,"Você escolheu nenhum","Mensagem",JOptionPane.PLAIN_MESSAGE,null);}});


//linguagem
Object opcao2 = JOptionPane.showInputDialog(null,"Qual sua linguagem favorita?"
,"Enquete",JOptionPane.QUESTION_MESSAGE,null,linguagens,linguagens[0]);
JOptionPane.showMessageDialog(null,"Você escolheu: "+opcao2);


//fechar o app
botao1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
int opcao;
Object[] botoes = {"Sim","Não"};
opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
   if (opcao==JOptionPane.YES_OPTION)
     System.exit(0);
   }});


//tamanho da tela//
setSize(540,430);
setLocationRelativeTo(null);
setVisible(true);

}

//////////////////main//////////////////////
public static void main(String args[]){
ExemploBotaoSair1 app = new ExemploBotaoSair1();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

//método horas
private void HORAS(){
hora = Calendar.getInstance();
hh = hora.get(Calendar.HOUR_OF_DAY);
mm = hora.get(Calendar.MINUTE);
ss = hora.get(Calendar.SECOND);
formato = new DecimalFormat("00");
rotulo4.setText("Hora: "+formatar(hh%12)+":"+formatar(mm)+":"+formatar(ss));
}
private String formatar(int num){
formato = new DecimalFormat("00");
return formato.format(num);
}
}