
package cl.inacap.biblotecamodel.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class DBUtils {
   private final String usuario="root";
   private final String password ="";
   private final String url ="jdbc:mysql://localhost:3306/bibliotecadb";
   private Connection conexion;
   
   public boolean conectar(){
    boolean resul;    
       
       try { 
            Class.forName("com.mysql.jdbc.Driver");
            this.conexion = DriverManager.getConnection(url,usuario,password);
            resul = true;
       } catch (Exception e) {
           resul = false;
           JOptionPane.showMessageDialog(null, "Fallo en la conexion con la base de datos");
       }
         return resul;
         
      
         
   }
   
       public Connection getConexion() {
        return conexion;
    }
    
    public void desconectar(){
        try {
            this.conexion.close();
        } catch (Exception e) {
        }
    }
}
