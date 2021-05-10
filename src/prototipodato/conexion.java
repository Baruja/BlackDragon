package prototipodato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class conexion {
    
    public String user ="postgres";
    public String pass ="napaminis";
    public String bd   = "Stock";
    public String ruta; 
    public final String host = "jdbc:postgresql://localhost:5432/";
    public Connection conexion = null; 
    public Statement sentencia; 
    public ResultSet resultado;
    public PreparedStatement preparar;
  
   
    public conexion()/* constructor*/{
        try{           
  
            Class.forName("org.postgresql.Driver");//Se registra el Driver jdbc de MySQL
  
            conexion = DriverManager.getConnection(host+bd,user,pass);            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un problema con la conexion.\n"+e , "Verifiquelo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}








