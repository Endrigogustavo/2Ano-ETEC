 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;


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


    JTextField tCodigo;
    JButton primeiro;
    JPasswordField Senha;
    
    public FrmTelaCad() {
        Container tela = getContentPane();
   
        setTitle("Conexao Java com Mysql");
        setResizable(false);
        tela.setLayout(null);
        
        
        tCodigo = new JTextField();
        Senha = new JPasswordField();
        primeiro = new JButton();
        
         tCodigo.setBounds(130, 55, 80, 20);
         Senha.setBounds(130, 75, 80, 20);
         primeiro.setBounds(130, 95, 80, 20);
        
           primeiro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    AtvForm mostrar = new AtvForm();
                    mostrar.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrmTelaCad.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(FrmTelaCad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         tela.add(tCodigo);
         tela.add(Senha);
         tela.add(primeiro);

        setSize(1000,650);
        setVisible(true);
        setLocationRelativeTo(null);

    }
public static void main(String args[]){
    
 FrmTelaCad app = new FrmTelaCad();
 app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
 
}


}

