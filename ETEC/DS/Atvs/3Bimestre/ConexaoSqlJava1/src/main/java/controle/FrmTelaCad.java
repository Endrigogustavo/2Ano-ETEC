 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import conexao.Conexao;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class FrmTelaCad extends JFrame {
    Conexao con_cliente;

    JTextField Nome;
    JButton Logar;
    JPasswordField Senha;
    
    public FrmTelaCad() {
        Container tela = getContentPane();
   
        con_cliente = new Conexao();
        con_cliente.conecta();
        
        setTitle("Conexao Java com Mysql");
        setResizable(false);
        tela.setLayout(null);
        
        
        Nome = new JTextField();
        Senha = new JPasswordField();
        Logar = new JButton();
        
         Nome.setBounds(130, 55, 80, 20);
         Senha.setBounds(130, 75, 80, 20);
         Logar.setBounds(130, 95, 80, 20);
        
           Logar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String pesquisa = "select * from tblusuario where usuario like '" +Nome.getText() + "' && senha = " +Senha.getText() + "";
                    con_cliente.execultarSQL(pesquisa);
                    
 
                    if(con_cliente.resultset.first()){
                    FrmTelaCadastro mostrar = new FrmTelaCadastro();
                    mostrar.setVisible(true);
                        dispose();
                    }else{                                
                     JOptionPane.showMessageDialog(null,"Usuario nao existe");
                      
                        con_cliente.desconectar();
                        System.exit(0);
                    }
                    
                    
                    
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Dados nao encontrados"+erro);
                } catch (ParseException ex) {
                    Logger.getLogger(FrmTelaCad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         tela.add(Nome);
         tela.add(Senha);
         tela.add(Logar);

        setSize(1000,650);
        setVisible(true);
        setLocationRelativeTo(null);

    }
public static void main(String args[]){
    
 FrmTelaCad app = new FrmTelaCad();
 app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
 
}


}

