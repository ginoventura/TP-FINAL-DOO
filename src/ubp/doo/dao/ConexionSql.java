package ubp.doo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexionSql {
    //D:\Users\luisb\Documentos\NetBeansProjects

    private final String URL = "jdbc:sqlite:C:\\Users\\Asus\\Documents\\TP-FINAL-DOO\\src\\db\\bbdd-tp-doo.db";
    private Connection connection = null;
    private static ConexionSql instancia = null;
    
    private ConexionSql(){
        getConnection();
    }

    public static ConexionSql getInstancia() {
       if (instancia == null) {
           instancia = new ConexionSql();
       }
       return instancia;    
    }

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL);
                if (connection != null) {
                    System.out.println("Conexión OK");
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return connection;
    }

    protected void desconectar() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        connection = null;
    }
}