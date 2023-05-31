package dao;



import model.Login;
import util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;

public class LoginDao {

    public static ArrayList<Login>buscarLogin() throws SQLException {
        ArrayList<Login>loginAux  = new ArrayList<>();
        String sql ="select log_nome , log_senha from login";

        Connection conn = ConnectionFactory.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);


        ResultSet rs= ps.executeQuery();
            while (rs.next()){
                Login login = new Login();
                login.setLogin(rs.getString("Log_nome"));
                login.setSenha(rs.getString("Log_senha"));
                loginAux.add(login);
            }
    return loginAux;
    }

}
