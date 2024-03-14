/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;
import edu.ijse.layered.db.DBConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author Home
 */
public class CrudUtil {
    
    private static PreparedStatement getPreparedStatement(String sql, Object... args) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
        if(args != null){
            for(int i = 0; i < args.length; i++){
                preparedStatement.setObject(i+1, args[i]);
            }
        }
        return preparedStatement;
    }
    
    public static boolean executeUpdate(String sql, Object... args) throws Exception{
         return getPreparedStatement(sql, args).executeUpdate() > 0;
    }
    
     public static ResultSet executeQuery(String sql, Object... args) throws Exception{
        return getPreparedStatement(sql, args).executeQuery();
    }
    
}
