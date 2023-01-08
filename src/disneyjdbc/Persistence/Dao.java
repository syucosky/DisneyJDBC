package disneyjdbc.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Dao {
    protected Connection conn = null;
    protected Statement stmt = null;
    protected ResultSet resultado = null;
    
    private final String USER = "root";
    private final String PASS = "root";
    private final String NAMEBD = "disneyjdbc";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    public void coneccion() throws SQLException , ClassNotFoundException{
        try {
            Class.forName(DRIVER);
            String url = "jdbc:mysql://localhost:3306/"+NAMEBD+"?useSSL=false";
            conn = DriverManager.getConnection(url, USER, PASS);
            
        } catch(SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
    public void desconeccion() throws Exception{       
        try{
            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }
            if(resultado != null){
                resultado.close();
            }
        }catch(Exception ex){
            throw ex;
        }
    } 
    public void insertarModificarEliminar(String sql) throws Exception{
        try {   
            coneccion();
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            resultado = stmt.getResultSet();
            
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }finally{
            desconeccion();
        }
    }
    public void consultar(String sql) throws Exception{
        try {
            coneccion();
            stmt = conn.createStatement();
            resultado = stmt.executeQuery(sql);
            
            /* Acordarse de cerrar la connecion */
        
        } catch (Exception ex) {
            throw ex;
        }
    }
    
}
