package com.codeProject.ecommerce.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;

    private String password;

    private String name;

    public CharSequence getPassword() {
        return null;
    }

    public String getEmail() {
        return "";
    }

    public String getName() {
        return "";
    }
}
