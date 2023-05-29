package config;

import java.sql.*;

public class SQLConexion {

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;database=bdPersona";
            String usr = "sa";
            String psw = "N2CABOCTAVIABD";
            con = DriverManager.getConnection(url, usr, psw);
            System.out.println("Conexion ok");
        } catch (ClassNotFoundException ex) {
            System.out.println("No hay Driver!!");
        } catch (SQLException ex) {
            System.out.println("Error con la BD");
        }
        return con;
    }
}
