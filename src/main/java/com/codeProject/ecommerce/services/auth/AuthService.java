package com.codeProject.ecommerce.services.auth;

import com.codeProject.ecommerce.dto.SignupRequest;
import com.codeProject.ecommerce.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
