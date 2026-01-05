package com.paulinhoschat.backend.dto;

import com.paulinhoschat.backend.model.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

    @NotEmpty
    @Size(min = 4, max = 50)
    private String username;

    @Email
    private String email;

    private UserType userType;
    private Long id;
}
