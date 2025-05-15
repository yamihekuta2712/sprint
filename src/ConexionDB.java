import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/las_palmeritas?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // Usuario por defecto en XAMPP
    private static final String PASS = "";     // Contraseña vacía por defecto en XAMPP

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

