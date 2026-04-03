// ESTRADA AGUILAR IVAN GUIDO
package conexion;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {     
    public static Connection Conexion(){  
        Connection con = null;
        String bs = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10822020";
        String usuario = "sql10822020";
        String contraseña = " kHbsKNaeL6";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//recomendado por chatgpt para asegurar que el driver JDBC de  MYSQL este cargado

            con = DriverManager.getConnection(bs, usuario, contraseña);
            System.out.println("conexion exitosa");                      
        } catch (SQLException error){
            System.out.println("error de conexion " + error.toString());
        } catch (Exception e){
            System.out.println("error deconexion "+e.toString()+"y esta parte capta el error del driver de JDBC de MYSQL");
        }
        return con;
    }
}
