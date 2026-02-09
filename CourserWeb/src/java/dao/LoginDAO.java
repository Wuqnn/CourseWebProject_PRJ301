/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utils.DBUtils;

/**
 *
 * @author Windows
 */
public class LoginDAO {

    
    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM [Users] WHERE Email = ?";
        User user = null;
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(
                        rs.getInt("UserID"),
                        rs.getString("Email"),
                        rs.getString("PasswordHash"),
                        rs.getInt("RoleID"),
                        rs.getString("FullName"),
                        rs.getString("PhoneNumber"),
                        rs.getString("AvatarURL"),
                        rs.getBoolean("IsEmailVerified"),
                        rs.getBoolean("PasswordHash")
                );

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;

    }

    public User Login(String email, String passwordHash) {
        User u = getUserByEmail(email);
        if (u != null) {
            return u.getPasswordHash().equals(passwordHash) ? u : null;

        } else {
            return null;
        }

    }
}
