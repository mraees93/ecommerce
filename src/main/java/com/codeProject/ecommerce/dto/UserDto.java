package com.codeProject.ecommerce.dto;

import com.codeProject.ecommerce.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;

    private String email;

    private String name;

    private UserRole userRole;

    public void setId(boolean id) {
    }
}
