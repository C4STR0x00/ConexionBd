import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String DB_URL  = " \"jdbc:mysql://sql10.freesqldatabase.com:3306/sql108220";
    private static final String DB_USER = " sql10822020";
    private static final String DB_PASS = "kHbsKNaeL6";

    // Constructor privado — no se puede instanciar
    private ConexionDB() {}

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
