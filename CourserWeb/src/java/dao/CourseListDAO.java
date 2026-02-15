/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.CourseListDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.DBUtils;

/**
 *
 * @author Windows
 */
public class CourseListDAO {

    public List<CourseListDTO> getAllCourses() throws SQLException, ClassNotFoundException {
        List<CourseListDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM Course WHERE status = 'OPEN'";

        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CourseListDTO course = new CourseListDTO(
                        rs.getString("courseID"),
                        rs.getString("instructorID"),
                        rs.getString("categoryID"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getDate("startDate"),
                        rs.getDate("endDate"),
                        rs.getString("status")
                );
                list.add(course);
            }
        }
        return list;
    }
}
