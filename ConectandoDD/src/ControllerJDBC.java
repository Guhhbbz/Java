// Não é bom fazer esse tipo de import!!!
import java.sql.*;

public class ControllerJDBC {

    private String query;
    
    public static Connection getConexao(){
        try {
            //Aqui a gente precisa colocar o banco de dados
            final String URL = "jdbc:mysql://localhost/terca";
            final String USER = "root";
            final String SENHA = "root";
            
           return DriverManager.getConnection(URL, USER, SENHA);
        }catch(SQLException e) {
            //printa mensagem de erro
            e.printStackTrace();
            System.out.println("Erro na conexao");
        }
        return null;
    }
    
    // INSERINDO DADO PARA INICIAR O CRUD
    // Create do CRUD
    public boolean inserirDado (String nome){
        try{
            query = "INSERT INTO pessoa(nome) VALUES (?)";
            PreparedStatement stmt = getConexao().prepareCall(query);
            stmt.setString(1,nome);
            return stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro ao enviar dado");
        }
        return false;
    }
    
    //Read do CRUD
    
    public ResultSet buscarDado() throws SQLException{
        query = "SELECT * FROM pessoa";
        Statement stmt = getConexao().createStatement();
        return stmt.executeQuery(query);
    }
    
    //Update do CRUD 
    
    public int atualizarDado(int id, String nome) throws SQLException{
        query = "UPDATE pessoa SET nome = ? WHERE id = ?";
        PreparedStatement stmt = getConexao().prepareStatement(query);
        stmt.setString(1,nome);
        stmt.setInt(2, id);
        
        return stmt.executeUpdate();
    }
    
    //Delete do CRUD
    
    public int deletarDado(int id) throws SQLException{
        query = "DELETE FROM pessoa WHERE id = ?";
        PreparedStatement stmt = getConexao().prepareStatement(query);
        stmt.setInt(1,id);
        
        return stmt.executeUpdate();
    }
    
}
