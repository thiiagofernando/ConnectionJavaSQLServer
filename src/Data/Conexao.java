package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private Connection conexao;
    
    public Conexao() throws Exception{
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        String url = "jdbc:jtds:sqlserver://192.168.0.13:666/Agenda";
        conexao = DriverManager.getConnection(url, "sa", "12345678");
    }
    public Connection getConexao(){
        return conexao;
    }
    
}
