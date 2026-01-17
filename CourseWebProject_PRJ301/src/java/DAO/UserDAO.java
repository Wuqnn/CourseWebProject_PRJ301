/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.catalina.User;
import utils.DatabaseUtils;

/**
 *
 * @author Windows
 */
public class UserDAO {
    //Ham kiem tra user
    //...
    //Them user (regis)
    public void insert(UserDTO user) throws SQLException, Exception{
        String sql = "INSERT INTO Users (username, password, email) "
           + "VALUES (?, ?, ?)";
        try(Connection connect = DatabaseUtils.getConnection(); PreparedStatement ps = connect.prepareStatement(sql)){
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            
            System.out.println("DAO called");
            int rows = ps.executeUpdate();
            System.out.println("Row: "+ rows);
            
            
        }
   

        
    }
    
    //Ham login user
    
}
