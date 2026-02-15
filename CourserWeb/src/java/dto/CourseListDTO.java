/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.sql.Date;

/**
 *
 * @author Windows
 */
public class CourseListDTO {
    /*[InstructorID]
      ,[CategoryID]
      ,[Title]
      ,[Description]
      ,[Price]
      ,[ThumbnailURL]
      ,[Status]
      ,[CreatedAt]
      ,[UpdatedAt]
*/
    private String courseID;
    private String instructorID;
    private String categoryID;
    private String title;
    private String description;
    private Double price;
    private Date createdAt;
    private Date updateAt;
    private String status;

    public CourseListDTO(String courseID, String instructorID, String categoryID, String title, String description, Double price, Date createdAt, Date updateAt, String status) {
        this.courseID = courseID;
        this.instructorID = instructorID;
        this.categoryID = categoryID;
        this.title = title;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.status = status;
    }

    

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
       

    public String getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
