package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import View.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DBConnection {
    
    static Connection conn = null;
   
    public static Connection getConnection(){
        try{
        Class.forName( "com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system", "root", "");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return conn;
    }
    
}
