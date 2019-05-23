package Data;

import Models.Pessoa;
import java.sql.PreparedStatement;

public class PessoaData {
    Conexao con;
    public boolean Incluir(Pessoa pessoa)throws Exception{
        con = new Conexao();
        String SQL = "INSERT INTO Pessoas(Nome,Email)VALUES(?,?)";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,pessoa.getNome());
        ps.setString(2, pessoa.getEmail());
        try {
          ps.executeUpdate();
            System.out.println("Registro Inserido");
          return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        }finally{
            ps.close();
        }
    }
    
}
