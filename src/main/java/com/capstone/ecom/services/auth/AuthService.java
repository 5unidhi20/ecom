package com.capstone.ecom.services.auth;

import com.capstone.ecom.dto.SignupRequest;
import com.capstone.ecom.dto.UserDto;

public interface AuthService {
    UserDto createdUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
