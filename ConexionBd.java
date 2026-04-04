package inventariofrutas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    // ─── Datos de conexión XAMPP (no cambies nada si usas XAMPP por defecto) ───
    private static final String HOST     = "bl3labcatj5bjwtaaaua-mysql.services.clever-cloud.com";
    private static final String PUERTO   = "3306";
    private static final String BASE     = "bl3labcatj5bjwtaaaua";
    private static final String USUARIO  = "uudxemrmgnionaxs";
    private static final String PASSWORD = "hdgOmOtx5OT0q8Km986k";          // XAMPP no tiene contraseña por defecto

    private static final String DB_URL =
            "jdbc:mysql://" + HOST + ":" + PUERTO + "/" + BASE
            + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    private Connection connection;

    public DatabaseManager() {
        conectar();
    }

    private void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);
            System.out.println("✅ Conexión a MySQL establecida.");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ Driver MySQL no encontrado: " + e.getMessage());
            System.err.println("   → Asegúrate de agregar mysql-connector-j-X.X.X.jar al proyecto.");
        } catch (SQLException e) {
            System.err.println("❌ Error al conectar con MySQL: " + e.getMessage());
            System.err.println("   → Verifica que XAMPP esté corriendo y la BD 'inventario_frutas' exista.");
        }
    }
}
