package com.mikkel.ecommerce.dto;

import com.mikkel.ecommerce.enums.UserRole;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

}
