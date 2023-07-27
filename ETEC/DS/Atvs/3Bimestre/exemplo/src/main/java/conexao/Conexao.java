package conexao;

import javax.swing.JOptionPane;
import java.sql.*;

public class Conexao {
    final private String driver = "com.mysql.cj;jbdc.Driver";
    final private String url = "jbdc:mysql://localhost/clientes";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(){
        boolean result = true;
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null,"conexao estabelecida", "Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null,"Driver nao localizado"+Driver,"Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }catch (SQLException Fonte){
            JOptionPane.showMessageDialog(null,"fonte de dados nao localizada"+Fonte,"Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
    }
    
    public void desconecta(){
        try{
            conexao.close();
            JOptionPane.showMessageDialog(null,"conexao com o banco fechada","Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException fecha){
        JOptionPane.showMessageDialog(null,"Erro ao fechar banco", "Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    public void executaSQL(String sql){
        try{
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch(SQLException fecha){
        JOptionPane.showMessageDialog(null,"Erro no comando sql", "Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
    }
    }
}
