package dao;

import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.DBUtils;

public class RegisterDAO {

    public boolean insertRegister(User user) {
        String sql = "INSERT INTO Users([RoleID],[Email],[PhoneNumber], [PasswordHash],[FirstName], [LastName]) "
                + "VALUES (?,?,?,?,?,?)";
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql);) {

            // 1. Sửa INSERT TO -> INSERT INTO
            ps.setInt(1, user.getRoleID());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhoneNumber());
            ps.setString(4, user.getPasswordHash());
            ps.setString(5, user.getFirstName());
            ps.setString(6, user.getLastName());

            // 3. Check kết quả trả về
            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            System.out.println("Error at insertRegister" + e.getMessage());
            return false;
        }

    }
    public boolean emailExist(String email) throws SQLException {
        String sql = "SELECT 1 FROM Users WHERE email = ?";
        try (Connection cn = DBUtils.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            return rs.next();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
