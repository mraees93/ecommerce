package com.codeProject.ecommerce.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;

    private String password;

    public String getUsername() {
        return "";
    }

    public Object getPassword() {
        return null;
    }
}
