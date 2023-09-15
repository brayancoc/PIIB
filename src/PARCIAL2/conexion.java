/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL2;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author braya
 */
public class conexion {
   
   Connection con;
    
    public conexion(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/producto","root","");
        System.out.println("CONECTADO");
    }catch(Exception e){
        System.out.println("Error no conectado"+ e);
    }//fin catch
    }//fin conexion
    
    
    public Connection getConnection(){
    return con;
    }
    
    
}
 
    
    

