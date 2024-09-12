package com.mikkel.ecommerce.service.user;

import com.mikkel.ecommerce.dto.SingupDTO;
import com.mikkel.ecommerce.dto.UserDTO;

public interface UserService {
    UserDTO createUser(SingupDTO singupDTO);
}
