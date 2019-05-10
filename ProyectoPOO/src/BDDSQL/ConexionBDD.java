package BDDSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionBDD {
    private Connection conexion = null;
    
    private String pass = "asd456";
    private String user = "admin";
    
    public boolean conectarme(){
        try{
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BDDPOO",user,pass);
            JOptionPane.showMessageDialog(null, "Conectado a la base de datos");
            return true;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION, IMPOSIBLE CONTINUAR");
            return false;
        }
    }
    public Connection conexion(){
         try{
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BDPOO",user,pass);
            return conexion;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION, IMPOSIBLE CONTINUAR");
           
        }
         return conexion;
    }
    
}