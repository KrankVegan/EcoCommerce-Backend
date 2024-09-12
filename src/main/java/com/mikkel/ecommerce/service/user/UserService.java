package com.mikkel.ecommerce.service.user;

import com.mikkel.ecommerce.dto.SignupDTO;
import com.mikkel.ecommerce.dto.UserDTO;

public interface UserService {
    UserDTO createUser(SignupDTO signupDTO);

    boolean hasUserWithEmail(String email);
}
