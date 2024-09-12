package com.mikkel.ecommerce.entity;

import com.mikkel.ecommerce.dto.UserDTO;
import com.mikkel.ecommerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")

public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole userRole;

    private byte [] img;

    public UserDTO mapUserToUserDTO() {
        return new UserDTO(id,email,name,userRole);
    }
}