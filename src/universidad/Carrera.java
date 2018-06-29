
package universidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Carrera {
    String listado = "";
    ///nuevo metodo
    public String ListarCarreras(){
        try {
            String sqlListadoCarreras = "select * from Carrera";
            Conexion objConexion = new Conexion();
            Connection conn = objConexion.DevolverConexion();
            
            PreparedStatement objPreparedStatment =
                    conn.prepareStatement(sqlListadoCarreras);
            
            ResultSet objResultSet = objPreparedStatment.executeQuery();
            
            while(objResultSet.next()){
                listado = 
                        listado + 
                        objResultSet.getInt("idCarrera") +
                        " " +
                        objResultSet.getString("Nombre") +
                        " (" + 
                        objResultSet.getString("codigo")  +
                        ")";
                listado = listado + ", ";
            }            
        } catch (SQLException ex) {
            Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return listado;
    }
}
