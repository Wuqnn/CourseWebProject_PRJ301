package dto;

import java.sql.Date;

public class CourseListDTO {

    private int courseID;
    private int instructorID;
    private int categoryID;
    private String title;
    private String description;
    private double price;
    private String thumbnailURL;
    private Date createdAt;
    private Date updatedAt;
    private String status;

    public CourseListDTO() {
    }

    public CourseListDTO(int courseID, int instructorID, int categoryID,
            String title, String description, double price,
            String thumbnailURL, Date createdAt, Date updatedAt, String status) {

        this.courseID = courseID;
        this.instructorID = instructorID;
        this.categoryID = categoryID;
        this.title = title;
        this.description = description;
        this.price = price;
        this.thumbnailURL = thumbnailURL;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public CourseListDTO(int courseID, int instructorID, int categoryID, String title, String description, double price, String thumbnailURL, String status) {
        this.courseID = courseID;
        this.instructorID = instructorID;
        this.categoryID = categoryID;
        this.title = title;
        this.description = description;
        this.price = price;
        this.thumbnailURL = thumbnailURL;
        this.status = status;
    }
    
    

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
