package com.codeProject.ecommerce.entity;

import com.codeProject.ecommerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole role;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getEmail() {
        return "";
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getPassword() {
        return "";
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean getId() {
        return false;
    }

    public void setRole(UserRole newRole) {
        this.role = newRole;
    }

    public boolean getRole() {
        return false;
    }
}
