/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Công dụng: Cung cấp phương thức kết nối tới DB
 * Khác gì với lớp DAO? Lớp DAO chứa các phương thức thao tác với bảng trong DB
 * Còn lớp DBUtils chỉ cung cấp phương thức kết nối DB chung cho tất cả các lớp DAO sử dụng
 * @author user
 */
public class DBUtils {
    //    Do not change this code
    private static final String DB_NAME = "COURSE_WEB";
    private static final String DB_USER_NAME = "SA";
    private static final String DB_PASSWORD = "12345";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
        return conn;
    }
}
