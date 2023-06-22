/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv.ds;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Atv extends JFrame{
    
    //19.2–Menuexecutandoações
    JMenuBar barra;
    JMenu opcoes,C,Conta;
    JMenuItem Sobre,sair,Soma,Sub,Div,Mult;
    JPanel painel;
     
    JToolBar barra2;
    JButton direita,esquerda,centralizar,recortar2;
    ImageIcon imagens[];
    
    JPopupMenu opcoes1;
    JMenuItem Sobrepop,Sairpop,colar1;
    
    
   public Atv(){
        super("Exemplo de Menus executando acoes");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        //19.2–Menuexecutandoações
        barra = new JMenuBar();
        setJMenuBar(barra);
        opcoes = new JMenu("Opcoes");
        barra.add(opcoes);
        Sobre = new JMenuItem("Sobre");
        C = new JMenu("Outros");
        Conta = new JMenu("Conta");
        Soma = new JMenuItem("Soma");
        Sub = new JMenuItem("Subtração");
        Div = new JMenuItem("Divisao");
        Mult = new JMenuItem("Multiplicação");
        sair = new JMenuItem("Sair");
        opcoes.setMnemonic(KeyEvent.VK_O);
        Sobre.setMnemonic(KeyEvent.VK_L);
        C.setMnemonic(KeyEvent.VK_F);
        sair.setMnemonic(KeyEvent.VK_S);
        Conta.setMnemonic(KeyEvent.VK_C);
        opcoes.add(Sobre);
        opcoes.add(C);
        opcoes.addSeparator();
        opcoes.add(sair);
        Conta.add(Soma);
        Conta.add(Sub);
        Conta.add(Div);
        Conta.add(Mult);
        C.add(Conta);
        painel = new JPanel();
        painel.setBounds(30,50,900,700);
        tela.add(painel);
        
        String icones[]={"imagens/direita.gif",
                         "imagens/esquerda.gif",
                         "imagens/centro.gif",
                         "imagens/recortar.gif",
                         "imagens/copiar.gif",
                         "imagens/colar.gif"};
        imagens=new ImageIcon[6];
        for(int i=0;i<6;i++){
            imagens[i]=new ImageIcon(icones[i]);}
        direita=new JButton("+");
        esquerda=new JButton("-");
        centralizar=new JButton("/");
        recortar2 =new JButton("*");
        direita.setToolTipText("Direita(Ctrl+d)");
        esquerda.setToolTipText("Esquerda(Ctrl+e)");
        centralizar.setToolTipText("Centralizar(Ctrl+z)");
        recortar2.setToolTipText("Recortar(Ctrl+x)");
        barra2= new JToolBar("BarradeFerramentas");
        UIManager.put("ToolTip.background",SystemColor.info);
        UIManager.put("ToolTip.foreground",Color.blue);
        barra2.setRollover(true);
        barra2.add(direita);
        barra2.add(esquerda);
        barra2.add(centralizar);
        barra2.addSeparator();
        barra2.add(recortar2);
        barra2.setBounds(1,1,1000,50);
        tela.add(barra2);
        
          barra2.addMouseListener(new MouseAdapter()
                        {
                            public void mouseReleased(MouseEvent e)
                            {
                                if(e.isPopupTrigger())
                                    opcoes1.show(e.getComponent(),e.getX(),e.getY());   }});
                
                    Tratador tratmenu = new Tratador();
                    opcoes1 = new JPopupMenu();
                    Sobrepop = new JMenuItem("Sobre");
                    Sairpop = new JMenuItem("Sair");
                    Sobrepop.setMnemonic(KeyEvent.VK_R);
                    Sairpop.setMnemonic(KeyEvent.VK_C);
                    Sobrepop.addActionListener(tratmenu);
                    Sairpop.addActionListener(tratmenu);
                    opcoes1.add(Sobrepop);
                    opcoes1.addSeparator();
                    opcoes1.add(Sairpop);
                    
                   
        
         sair.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        System.exit(0);}
                    });
         
          direita.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Soma mostrar = new Soma();
                        mostrar.setVisible(true);
                        dispose();}
                    });
          centralizar.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Div mostrar = new Div();
                        mostrar.setVisible(true);
                        dispose();}
                    });
         
          recortar2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Mult mostrar = new Mult();
                        mostrar.setVisible(true);
                        dispose();}
                    });
         
          esquerda.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Sub mostrar = new Sub();
                        mostrar.setVisible(true);
                        dispose();}
                    });
         
           sair.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        System.exit(0);}
                    });
         
          Soma.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Soma mostrar = new Soma();
                        mostrar.setVisible(true);
                        dispose();}
                    });
          Div.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Div mostrar = new Div();
                        mostrar.setVisible(true);
                        dispose();}
                    });
         
          Mult.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Mult mostrar = new Mult();
                        mostrar.setVisible(true);
                        dispose();}
                    });
         
          Sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Sub mostrar = new Sub();
                        mostrar.setVisible(true);
                        dispose();}
                    });
         
          
          
          Sobre.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        Sobre mostrar = new Sobre();
                        mostrar.setVisible(true);
                        dispose();}
                    });
         
         
         
                setSize(1000,110);
                setLocationRelativeTo(null);
                setVisible(true);
    }
    
    
    public static void main (String args[])
    {
        Atv app = new Atv();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
      private class Tratador implements ActionListener
    {
            
            //20–Criandoummenudecontexto–ClasseJPopupMenu
        public void actionPerformed(ActionEvent e)
        {
             Sobre mostrar = new Sobre();
                       
            if(e.getSource()==Sobrepop)
                mostrar.setVisible(true);
                dispose();
            if(e.getSource()==Sairpop)
                System.exit(0);

            repaint()
                    ;}}
}
