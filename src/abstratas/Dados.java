package abstratas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dados {
    
    private static Connection connection=null;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null){
            String url="jdbc:postgresql://localhost:5432/funcionario";
            String usr="moisesdelfino";
            String pwd="Moi@2022.file";
            connection = DriverManager.getConnection(url,usr,pwd);
        }
        return connection;
    }
}
