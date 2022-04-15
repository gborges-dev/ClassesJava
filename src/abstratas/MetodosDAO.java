package abstratas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class MetodosDAO {
    public PreparedStatement getStatement(String SQL) throws SQLException{
        return Dados.getConnection().prepareStatement(SQL);
    }
    public  int executeUpdate(String SQL, Object... args) throws SQLException{
        PreparedStatement pst = this.getStatement(SQL);
        for (int i = 0; i < args.length; i++){
            pst.setObject((i+1), args[i]);
        }
        return pst.executeUpdate();
    }
    public  ResultSet executeQuery(String SQL, Object... args) throws SQLException{
        PreparedStatement pst = this.getStatement(SQL);
        for (int i = 0; i < args.length; i++){
            pst.setObject((i+1), args[i]);
        }
        return pst.executeQuery();
    }
}
