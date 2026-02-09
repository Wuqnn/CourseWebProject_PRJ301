package dao;

import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.DBUtils;

public class RegisterDAO {

    public boolean insertRegister(User user) {
        String sql = "INSERT INTO Users([Email],[PasswordHash],[RoleID],[FullName] ,[PhoneNumber])"
                + "VALUES (?,?,?,?,?)";
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql);) {

            
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPasswordHash());
            ps.setInt(3, user.getRoleID());
            ps.setString(4, user.getFullName());
            ps.setString(5, user.getPhoneNumber());

            
            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            System.out.println("Error at insertRegister" + e.getMessage());
            return false;
        }
    }
    
    public boolean emailExist(String email) throws SQLException{
        String sql = "SELECT 1 FROM Users WHERE email = ?";
        try (Connection cn = DBUtils.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            return rs.next();
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return false;
        
        
        
    }
}
