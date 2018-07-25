
package universidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    //attributos
    static Connection attrConexion ;
    static final String driver = "com.mysql.jdbc.Driver";
    static final String user = "admin";
    static final String pass = "admin";
    static final String url = "jdbc:mysql://localhost:3306/facultad";
    
    public Conexion(){}
    
    public Connection DevolverConexion(){
        try {
            attrConexion = null;
            
            Class.forName(driver);
            attrConexion = DriverManager.getConnection(url, user, pass);
            
            if (attrConexion != null){
                System.out.println("Conexion establecida. Continuar");
            }            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return attrConexion;                
    }
}
