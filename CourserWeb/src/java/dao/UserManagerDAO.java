/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;
import utils.DBUtils;

/**
 *
 * @author Windows
 */
public class UserManagerDAO {

    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM Users";
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User(
                        rs.getInt("UserID"),
                        rs.getString("Email"),
                        rs.getString("PasswordHash"),
                        rs.getInt("RoleID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("PhoneNumber"),
                        rs.getString("AvatarUrl"),
                        rs.getBoolean("IsEmailVerified"),
                        rs.getBoolean("IsActive"),
                        rs.getObject("CreatedAt", java.time.LocalDateTime.class),
                        rs.getObject("LastLogin", java.time.LocalDateTime.class)
                );
                list.add(user);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    public User getUserByID(int id) {
        User user = null;
        String sql = "SELECT * FROM Users WHERE UserID=?";
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(
                        rs.getInt("UserID"),
                        rs.getString("Email"),
                        rs.getString("PasswordHash"),
                        rs.getInt("RoleID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("PhoneNumber"),
                        rs.getString("AvatarUrl"),
                        rs.getBoolean("IsEmailVerified"),
                        rs.getBoolean("IsActive"),
                        rs.getObject("CreatedAt", java.time.LocalDateTime.class),
                        rs.getObject("LastLogin", java.time.LocalDateTime.class)
                );

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public void addUser(User user) {
        String sql = "INSERT INTO Users(RoleID,Email,PhoneNumber,PasswordHash,FirstName,LastName,IsActive) VALUES(?,?,?,?,?,?,1)";
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareCall(sql)) {
            ps.setInt(1, user.getRoleID());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhoneNumber());
            ps.setString(4, user.getPasswordHash());
            ps.setString(5, user.getFirstName());
            ps.setString(6, user.getLastName());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        String sql = "UPDATE Users SET RoleID=?, Email=?, PhoneNumber=?, FirstName=?, LastName=?, IsActive=? WHERE UserID=?";
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, user.getRoleID());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhoneNumber());
            ps.setString(4, user.getFirstName());
            ps.setString(5, user.getLastName());
            ps.setBoolean(6, user.getActive());
            ps.setInt(7, user.getUserId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteUser(int id){
        String sql = "UPDATE Users SET IsActive=0 WHERE UserID=?";
        try(Connection cn = DBUtils.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

}
