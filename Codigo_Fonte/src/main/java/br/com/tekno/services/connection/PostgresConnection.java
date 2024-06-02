package br.com.tekno.services.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class PostgresConnection implements MyConnection {
    
    private static Connection con = null;

    static{
        String url = "jdbc:postgresql://0.0.0.0:5432/tekno";
        String user = "postgres";
        String pass = "123";

        try{
            con = DriverManager.getConnection(url, user, pass);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return con;
    }

}
