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
        String sql = "SELECT * FROM Courses WHERE status = 'ACTIVE'";

        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CourseListDTO course = new CourseListDTO(
                        rs.getInt("courseID"),
                        rs.getInt("instructorID"),
                        rs.getInt("categoryID"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getString("thumbnailURL"),
                        rs.getDate("createdAt"),
                        rs.getDate("updatedAt"),
                        rs.getString("status")
                );
                list.add(course);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
        return list;
    }

    public List<CourseListDTO> getAllCoursesAdmin() throws SQLException, ClassNotFoundException {
        List<CourseListDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM Courses";

        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CourseListDTO course = new CourseListDTO(
                        rs.getInt("courseID"),
                        rs.getInt("instructorID"),
                        rs.getInt("categoryID"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getString("thumbnailURL"),
                        rs.getDate("createdAt"),
                        rs.getDate("updatedAt"),
                        rs.getString("status")
                );
                list.add(course);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
        return list;
    }

    public CourseListDTO getCourseByID(int id) {
        CourseListDTO courseDTO = null;
        String sql = "SELECT * FROM Courses WHERE CourseID = ? AND Status='ACTIVE'";
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                courseDTO = new CourseListDTO(
                        rs.getInt("CourseID"),
                        rs.getInt("InstructorID"),
                        rs.getInt("CategoryID"),
                        rs.getString("Title"),
                        rs.getString("Description"),
                        rs.getDouble("Price"),
                        rs.getString("ThumbnailURL"),
                        rs.getString("Status")
                );

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return courseDTO;
    }
    
    public CourseListDTO getCourseByIDAdmin(int id) {
        CourseListDTO courseDTO = null;
        String sql = "SELECT * FROM Courses WHERE CourseID = ?";
        try ( Connection cn = DBUtils.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                courseDTO = new CourseListDTO(
                        rs.getInt("CourseID"),
                        rs.getInt("InstructorID"),
                        rs.getInt("CategoryID"),
                        rs.getString("Title"),
                        rs.getString("Description"),
                        rs.getDouble("Price"),
                        rs.getString("ThumbnailURL"),
                        rs.getString("Status")
                );

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return courseDTO;
    }

    public boolean addCourse(CourseListDTO course) throws Exception {

        String sql = "INSERT INTO Courses (InstructorID, CategoryID, Title, Description, Price, ThumbnailURL, Status, CreatedAt) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, GETDATE())";

        try ( Connection con = DBUtils.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, course.getInstructorID());
            ps.setInt(2, course.getCategoryID());
            ps.setString(3, course.getTitle());
            ps.setString(4, course.getDescription());
            ps.setDouble(5, course.getPrice());
            ps.setString(6, course.getThumbnailURL());
            ps.setString(7, course.getStatus());

            return ps.executeUpdate() > 0;
        }
    }

    public boolean updateCourse(CourseListDTO course) throws Exception {

        String sql = "UPDATE Courses "
                + "SET InstructorID=?, CategoryID=?, Title=?, Description=?, Price=?, ThumbnailURL=?, Status=?, UpdatedAt=GETDATE() "
                + "WHERE CourseID=?";

        try ( Connection con = DBUtils.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, course.getInstructorID());
            ps.setInt(2, course.getCategoryID());
            ps.setString(3, course.getTitle());
            ps.setString(4, course.getDescription());
            ps.setDouble(5, course.getPrice());
            ps.setString(6, course.getThumbnailURL());
            ps.setString(7, course.getStatus());
            ps.setInt(8, course.getCourseID());

            return ps.executeUpdate() > 0;
        }
    }

    public boolean deleteCourse(int courseID) throws Exception {

        String sql = "UPDATE Courses SET Status='INACTIVE' WHERE CourseID=?";

        try ( Connection con = DBUtils.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, courseID);

            return ps.executeUpdate() > 0;
        }
    }
}
