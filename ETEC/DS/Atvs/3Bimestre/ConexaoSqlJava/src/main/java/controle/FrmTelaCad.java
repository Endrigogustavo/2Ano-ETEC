 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import conexao.Conexao;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmTelaCad extends JFrame {
    Conexao con_cliente;
    JLabel rCodigo, rNome, rEmail, rTel, rData, rPesquisar;
    JTextField tCodigo, tNome, tEmail, tTel, tData,tPesquisar;
    JFormattedTextField mTel, mData, mCodigo;
    JButton primeiro, anterior, proximo, ultimo, registro, gravar, alterar, excluir,pesquisar;
    
    JTable tblClientes;
    JScrollPane scp_tabela;
    
    public FrmTelaCad() throws SQLException{
         
        Container tela = getContentPane();
        
        rCodigo = new JLabel("Codigo");
        rNome = new JLabel("Nome");
        rEmail = new JLabel("Email");
        rTel = new JLabel("Telefone");
        rData = new JLabel("Data");
        rPesquisar = new JLabel("Pesquisar cliente");
        tCodigo = new JTextField();
        tNome = new JTextField();
        tEmail= new JTextField();
        tTel = new JTextField();
        tData= new JTextField();
        tPesquisar= new JTextField();



        
        con_cliente = new Conexao();
        con_cliente.conecta();
        
        setTitle("Conexao Java com Mysql");
        setResizable(false);
        tela.setLayout(null);
        
        primeiro = new JButton ("Primeiro");
        anterior = new JButton ("Anterior");
        proximo = new JButton ("Próximo");
        ultimo = new JButton ("Último");
        
        registro = new JButton ("Nova Registro");
        gravar = new JButton ("Gravar");
        alterar = new JButton ("Alterar");
        excluir = new JButton ("Excluir");
        pesquisar = new JButton ("Pesquisar");
        
        
        primeiro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    con_cliente.resultset.first();
                    mostrar_Dados();
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"Não foi possivel acessar o primeiro registro"+erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        anterior.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    con_cliente.resultset.previous();
                    mostrar_Dados();
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"Não foi possivel acessar o primeiro registro"+erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        proximo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    con_cliente.resultset.next();
                    mostrar_Dados();
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"Não foi possivel acessar o primeiro registro"+erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        ultimo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    con_cliente.resultset.last();
                    mostrar_Dados();
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"Não foi possivel acessar o primeiro registro"+erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        gravar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String nome = tNome.getText();
                String dt = tData.getText();
                String tel = tTel.getText();
                String email = tEmail.getText();
                try{
                 String insert_sql = "insert into tbclientes(nome,telefone,email,dt_nasc)values('"+nome+"','"+tel+"','"+email+"','"+dt+"')";
                 con_cliente.statament.executeUpdate(insert_sql);
                 JOptionPane.showMessageDialog(null, "Gravado com sucesso");
                 
                 con_cliente.execultarSQL("select * from tbclientes order by cod");
                 preencherTabela();
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"Não foi possivel gravar registro"+erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        alterar.addActionListener(new ActionListener(){
            
            //Arrumar
            public void actionPerformed(ActionEvent e){
                String nome = tNome.getText();
                String dt = tData.getText();
                String tel = tTel.getText();
                String email = tEmail.getText();
                String sql;
                String msg="";
               
                try {
                    if (tCodigo.getText().equals("")) {
                       sql = "insert into tbclientes(nome,telefone,email,dt_nasc)values('"+nome+"','"+tel+"','"+email+"','"+dt+"')";
                       msg="Gravado com sucesso";
                    }
                    else{
                        sql = "update tbclientes set nome='"+nome+"',telefone='"+tel+"',email='"+email+"',dt_nasc='"+dt+"'where cod="+tCodigo.getText();
                        msg="Alterado com sucesso";
                    }
                    
                    con_cliente.statament.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravado com sucesso");
                    con_cliente.execultarSQL("select * from tbclientes order by cod");
                    preencherTabela();
                    
                } catch (SQLException errosql) {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar");
                }
            }
        });
        
       
         excluir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String sql;
                
                try {
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir?");
                    if (resposta==0) {
                      sql = "delete from tbclientes where cod = " +tCodigo.getText();
                      int excluir = con_cliente.statament.executeUpdate(sql);                   
                    if(excluir==1){
                        JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                        con_cliente.execultarSQL("select * from tbclientes order by cod");
                        con_cliente.resultset.first();
                        preencherTabela();
                        //posicionarRegistro();
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Operaçao cancelada pelo usuario");
                    }
                }
                    

             
                } catch (SQLException errosql) {
                    JOptionPane.showMessageDialog(null, "Erro ao deletar");
                }
            }
        });
         
           pesquisar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String pesquisa = "select * from tbclientes where nome like'"+tPesquisar.getText()+"%'";
                    con_cliente.execultarSQL(pesquisa);
                    if(con_cliente.resultset.first()){
                    preencherTabela();
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "\n Nao existe");
                    }
                } catch (SQLException errosql) {
                    JOptionPane.showMessageDialog(null, "\n Dados nao encontrados");
                }
            }
        });
                
                
                primeiro.setBounds(60, 220,90, 20);
                tela.add(primeiro);
                anterior.setBounds(150, 220,90, 20);
                tela.add(anterior);
                proximo.setBounds(240, 220,90, 20);
                tela.add(proximo);
                ultimo.setBounds(330, 220,90, 20);
                tela.add(ultimo);
                
                
                registro.setBounds(490, 220,120, 20);
                tela.add(registro);
                gravar.setBounds(625, 220,90, 20);
                tela.add(gravar);
                alterar.setBounds(730, 220,90, 20);
                tela.add(alterar);
                excluir.setBounds(830, 220,90, 20);
                tela.add(excluir);
                
                pesquisar.setBounds(350, 265,90, 19);
                tela.add(pesquisar);
         
        rPesquisar.setBounds(10, 250, 150, 50);
        tPesquisar.setBounds(120, 265, 250, 20);
        

                
        
        tblClientes = new javax.swing.JTable();
        scp_tabela = new javax.swing.JScrollPane();
        
        tblClientes.setBounds(0,300,1000,200);
        scp_tabela.setBounds(0,300,1000,200);
        

        
        tela.add(tblClientes);
        tela.add(scp_tabela);
        
        
        tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        
        tblClientes.setFont(new java.awt.Font("Arial",1,12)); 
        
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][]{
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
        },
                new String [] {"Código", "Nome", "Data Nascimento", "Telefone", "Email"})
        {
            boolean[] canEdit = new boolean[]{
                false, false,false, false,false
            };
          
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return canEdit [columnIndex];}
});
        
       
        scp_tabela.setViewportView(tblClientes);
        
        tblClientes.setAutoCreateRowSorter(true);

        
        
        try {
            MaskFormatter mTel = new MaskFormatter("(##)#####-####");
            MaskFormatter mData = new MaskFormatter("##/##/####");
            MaskFormatter mCodigo = new MaskFormatter("###");
           
        } catch (ParseException e) {
        }
        
        mData = new JFormattedTextField(tData);
        mTel = new JFormattedTextField(tTel);
        mCodigo = new JFormattedTextField(tCodigo);
        
        
        rCodigo.setBounds(10, 10, 50, 50);
        rNome.setBounds(10, 40, 50, 50);
        rEmail.setBounds(10, 70, 50, 50);
        rTel.setBounds(10, 100, 50, 50);
        rData.setBounds(10, 130, 50, 50);
        
        tCodigo.setBounds(70, 25, 40, 20);
        tNome.setBounds(70, 55, 200, 20);
        tEmail.setBounds(70, 85, 200, 20);
        tTel.setBounds(70, 115, 100, 20);
        tData.setBounds(70, 145, 70, 20);

        
        tela.add(tEmail);
        tela.add(tCodigo);
        tela.add(tNome);
        tela.add(tTel);
        tela.add(tData);
        tela.add(rCodigo);
        tela.add(rNome);
        tela.add(rEmail);
        tela.add(rTel);
        tela.add(rData);
        
        tela.add(rPesquisar);
        tela.add(tPesquisar);
        

        setSize(1000,600);
        setVisible(true);
        setLocationRelativeTo(null);
        
        con_cliente.execultarSQL("select * from tbclientes order by cod");
        preencherTabela();

 }
      public void mostrar_Dados(){
        try{
            tCodigo.setText(con_cliente.resultset.getString("cod"));
            tNome.setText(con_cliente.resultset.getString("nome"));
            tData.setText(con_cliente.resultset.getString("dt_nasc"));
            tTel.setText(con_cliente.resultset.getString("telefone"));
            tEmail.setText(con_cliente.resultset.getString("email"));
        }catch(SQLException erro){
             JOptionPane.showMessageDialog(null, "Não localizou dados: "+erro,"Mensagem do prograna", JOptionPane.INFORMATION_MESSAGE);
        }
      }
    public void preencherTabela() throws SQLException
    {
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(11);
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(14);
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        
        try{
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                con_cliente.resultset.getString("cod"), con_cliente.resultset.getString("nome"), con_cliente.resultset.getString("dt_nasc"), con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("email")
            });
            }
        }catch(SQLException erro){
    JOptionPane.showMessageDialog(null,"erro ao listar dados da tabela!! \n "+erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
}
    }
    
public static void main(String args[]) throws SQLException{
 FrmTelaCad app = new FrmTelaCad();
 app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
}

