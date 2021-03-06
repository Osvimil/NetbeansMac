
package conexionmysql;

import java.sql.*;

public class Conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:80/AndroidPHP";
    
    
    public Conectar(){
        conn = null;
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            if(conn != null){
                System.out.println("Conexion hecha");
                
            }
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e);
            
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconectar(){
        conn = null;
        if(conn==null){
            System.out.println("Conexion terminada");
        }
    }
}
