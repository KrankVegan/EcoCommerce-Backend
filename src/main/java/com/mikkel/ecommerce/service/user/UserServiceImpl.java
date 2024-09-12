package com.mikkel.ecommerce.service.user;

import com.mikkel.ecommerce.Repository.UserRepository;
import com.mikkel.ecommerce.dto.SingupDTO;
import com.mikkel.ecommerce.dto.UserDTO;
import com.mikkel.ecommerce.entity.User;
import com.mikkel.ecommerce.enums.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(SingupDTO singupDTO) {
        User user = new User();
        user.setName(singupDTO.getName());
        user.setEmail(singupDTO.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(singupDTO.getPassword()));
        user.setUserRole(UserRole.USER);
        userRepository.save(user);
        return user.mapUserToUserDTO();
    }
}
