package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection getConexion() {

        Connection connection = null;

        try {
            String nombreBd = System.getenv("NOMBRE_BD");
            String url = System.getenv("URL_BD") + nombreBd;
            String usuarioBd = System.getenv("USUARIO_BD");
            String passwordBd = System.getenv("PASSWORD_BD");

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, usuarioBd, passwordBd);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Desde conectar" + ex.getMessage());
        }

        return connection;
    }
}
