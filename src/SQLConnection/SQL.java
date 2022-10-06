package SQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQL {

    public static final String URL = "jdbc:mysql://localhost:3306/proyecto_poo";
    public static final String USER = "root";
    public static final String CLAVE = "";

    public Connection getConexion(){
        Connection sql = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sql = (Connection) DriverManager.getConnection(URL,USER, CLAVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return sql;
    }

}
