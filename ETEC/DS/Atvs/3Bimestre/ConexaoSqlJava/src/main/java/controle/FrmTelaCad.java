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
    JLabel rCodigo, rNome, rEmail, rTel, rData;
    JTextField tCodigo, tNome, tEmail, tTel, tData;
    JFormattedTextField mTel, mData;
    JButton primeiro, anterior, proximo, ultimo;
    
    JTable tblClientes;
    JScrollPane scp_tabela;
    
    public FrmTelaCad() throws SQLException{
         
        Container tela = getContentPane();
        
        rCodigo = new JLabel("Codigo");
        rNome = new JLabel("Nome");
        rEmail = new JLabel("Email");
        rTel = new JLabel("Telefone");
        rData = new JLabel("Data");
        tCodigo = new JTextField();
        tNome = new JTextField();
        tEmail= new JTextField();
        tTel = new JTextField();
        tData= new JTextField();



        
        con_cliente = new Conexao();
        con_cliente.conecta();
        
        setTitle("Conexao Java com Mysql");
        setResizable(false);
        
        primeiro = new JButton ("Primeiro");
        anterior = new JButton ("Anterior");
        proximo = new JButton ("Próximo");
        ultimo = new JButton ("Último");
        
        
        primeiro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    con_cliente.resultset.first();
                
                }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"Não foi possivel acessar o primeiro registro"+erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
                
        
        tblClientes = new javax.swing.JTable();
        scp_tabela = new javax.swing.JScrollPane();
        
        tblClientes.setBounds(50,300,550,200);
        scp_tabela.setBounds(50,300,550,200);
        

        
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

        rCodigo.setBounds(10, 10, 50, 50);
        rNome.setBounds(10, 40, 50, 50);
        rEmail.setBounds(10, 70, 50, 50);
        rTel.setBounds(10, 100, 50, 50);
        rData.setBounds(10, 130, 50, 50);
        
        tCodigo.setBounds(70, 25, 100, 20);
        tNome.setBounds(70, 55, 100, 20);
        tEmail.setBounds(70, 85, 100, 20);
        tTel.setBounds(70, 115, 100, 20);
        tData.setBounds(70, 145, 100, 20);
        
        
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
        setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null);
        
        con_cliente.execultarSQL("select * from tbclientes order by cod");
        preencherTabela();

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

