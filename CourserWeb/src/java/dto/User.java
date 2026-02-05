/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author admin
 */
import java.time.LocalDateTime; // Dùng cho DATETIME2
import java.time.LocalDate;     // Dùng cho DATE

public class User {
    // 1. Mapping các cột IDENTITY/PK
    protected Integer userId; // Dùng Integer thay vì int để cho phép null (khi chưa lưu DB)

    // 2. Authentication Info
    private String email;
    private String passwordHash; // Lưu ý: Field này nhạy cảm
    private int roleID;     // Mapping từ RoleID sang tên cho dễ dùng

    // 3. Shared Info (Thông tin chung)
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String avatarUrl;

    // 4. System Status
    private Boolean isEmailVerified;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin; 
public User(){}

    public User(Integer userId, String email, String passwordHash, int roleID, String firstName, String lastName, String phoneNumber, String avatarUrl, Boolean isEmailVerified, Boolean isActive, LocalDateTime createdAt, LocalDateTime lastLogin) {
        this.userId = userId;
        this.email = email;
        this.passwordHash = passwordHash;
        this.roleID = roleID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.avatarUrl = avatarUrl;
        this.isEmailVerified = isEmailVerified;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.lastLogin = lastLogin;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Boolean getEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }
}
