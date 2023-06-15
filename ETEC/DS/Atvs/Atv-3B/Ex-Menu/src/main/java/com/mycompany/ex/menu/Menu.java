/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu extends JFrame{
    
    //19.2–Menuexecutandoações
    JMenuBar barra;
    JMenu opcoes,fonte,cor;
    JMenuItem limpar,sair,azul,verde,vermelho,amarelo,preto;
    JTextArea texto;
    JPanel painel;
    JScrollPane rolagem;
    // Fim 19.2–Menuexecutandoações
    
    
    //20–Criandoummenudecontexto–ClasseJPopupMenu
    JPopupMenu opcoes1;
    JMenuItem recortar1,copiar1,colar1;
    // Fim 20–Criandoummenudecontexto–ClasseJPopupMenu
    
    
    JToolBar barra2;
    JButton direita,esquerda,centralizar,recortar2,copiar2,colar2;
    ImageIcon imagens[];
    
    
    JMenuItem somar;
    Inicial segundajanela;
    
    
    public Menu(){
        super("Exemplo de Menus executando acoes");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        //19.2–Menuexecutandoações
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
        texto=new JTextArea(40,80);
        texto.setBounds(30,30,900,700);
        rolagem = new JScrollPane(texto);
        rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painel = new JPanel();
        painel.add(rolagem);
        painel.setBounds(30,50,900,700);
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
                texto.setForeground(Color.green);
                repaint();
            }});
        vermelho.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                texto.setForeground(Color.red);
                repaint();
            }})
                ;amarelo.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {texto.setForeground(Color.yellow);repaint();
                    }});
                preto.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        texto.setForeground(Color.black); 
                        repaint();
                    }});
                sair.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        System.exit(0);}
                    });
                
                //Fim 19.2–Menuexecutandoações
                
                
                
                //20–Criandoummenudecontexto–ClasseJPopupMenu
                texto.addMouseListener(new MouseAdapter()
                        {
                            public void mouseReleased(MouseEvent e)
                            {
                                if(e.isPopupTrigger())
                                    opcoes1.show(e.getComponent(),e.getX(),e.getY());   }});
                
                    Tratador tratmenu = new Tratador();
                    opcoes1 = new JPopupMenu();
                    recortar1 = new JMenuItem("Recortar");
                    copiar1 = new JMenuItem("Copiar");
                    colar1 = new JMenuItem("Colar");
                    recortar1.setMnemonic(KeyEvent.VK_R);
                    copiar1.setMnemonic(KeyEvent.VK_C);
                    colar1.setMnemonic(KeyEvent.VK_L);
                    recortar1.addActionListener(tratmenu);
                    copiar1.addActionListener(tratmenu);
                    colar1.addActionListener(tratmenu);
                    opcoes1.add(recortar1);
                    opcoes1.add(copiar1);
                    opcoes1.addSeparator();
                    opcoes1.add(colar1);
                // Fim 20–Criandoummenudecontexto–ClasseJPopupMenu
                
                
                
                String icones[] = {
                    "imagens/direita.gif",
                    "imagens/esquerda.gif",
                    "imagens/centro.gif",
                    "imagens/recortar.gif",
                    "imagens/copiar.gif",
                    "imagens/colar.gif"};
                imagens = new ImageIcon[6];
                for(int i=0;i<6;i++)
                {
                    imagens[i] = new ImageIcon(icones[i]);
                }
                direita = new JButton(imagens[0]);
                esquerda = new JButton(imagens[1]);
                centralizar = new JButton(imagens[2]);
                recortar2 = new JButton(imagens[3]);
                copiar2 = new JButton(imagens[4]);
                colar2 = new JButton(imagens[5]);
                direita.setToolTipText("Direita(Ctrl+d)");
                esquerda.setToolTipText("Esquerda(Ctrl+e)");
                centralizar.setToolTipText("Centralizar(Ctrl+z)");
                recortar2.setToolTipText("Recortar(Ctrl+x)");
                copiar2.setToolTipText("Copiar(Ctrl+c)");
                colar2.setToolTipText("Colar(Ctrl+v)");
                barra2 = new JToolBar("BarradeFerramentas");
                UIManager.put("ToolTip.background",SystemColor.info);
                UIManager.put("ToolTip.foreground",Color.blue);
                barra2.setRollover(true);
                barra2.add(direita);
                barra2.add(esquerda);
                barra2.add(centralizar);
                barra2.addSeparator();
                barra2.add(recortar2);
                barra2.add(copiar2);
                barra2.add(colar2);
                barra2.setBounds(1,1,1000,50);
                tela.add(barra2);
                
                
                
                somar = new JMenuItem("Somar");
                somar.setMnemonic(KeyEvent.VK_O);
                
                somar.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        segundajanela = new Inicial(null,"Segunda Janela",true);
                        segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        segundajanela.setVisible(true);}});
                
                
                setSize(1000,700);
                setLocationRelativeTo(null);
                setVisible(true);
    }
    
    
    public static void main (String args[])
    {
        Menu app = new Menu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
        private class Tratador implements ActionListener
    {
            
            //20–Criandoummenudecontexto–ClasseJPopupMenu
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==recortar1)
                texto.cut();
            if(e.getSource()==copiar1)
                texto.copy();
            if(e.getSource()==colar1)
                texto.paste();
            repaint()
                    ;}}
            // Fim 20–Criandoummenudecontexto–ClasseJPopupMenu
        
        
        
        
        private class Inicial extends JDialog
        {
            
        
        JButton sair;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton somar2n;
        public Inicial(Frame owner, String title,boolean modal)
        {
            super(owner,title,modal);
            Container tela1 = getContentPane();
            tela1.setLayout(null);
            // layout do formulário
            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            somar2n = new JButton("Somar");
            rotulo1.setBounds(50,20,100,20);
            rotulo2.setBounds(50,60,100,20);
            texto1.setBounds(120,20,200,20);
            texto2.setBounds(120,60,200,20);
            exibir.setBounds(50,140,200,20);
            somar2n.setBounds(150,100,80,20);
            somar2n.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int numero1, numero2, soma;
                    soma = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    soma = numero1 + numero2;
                    exibir.setVisible(true);
                    exibir.setText("A soma é: "+soma);}});
                    exibir.setVisible(false);
                    tela1.add(rotulo1);
                    tela1.add(rotulo2);
                    tela1.add(texto1);
                    tela1.add(texto2);
                    tela1.add(exibir);
                    tela1.add(somar2n);
                    tela1.add(sair);setSize(400,400);
                    setLocationRelativeTo(null);}}
        }




