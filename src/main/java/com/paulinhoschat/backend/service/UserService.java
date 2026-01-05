package com.paulinhoschat.backend.service;

import com.paulinhoschat.backend.dto.UserDTO;
import com.paulinhoschat.backend.model.User;
import com.paulinhoschat.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private UserDTO toDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setUserType(user.getUserType());
        return dto;
    }
    public void createUser(UserDTO dto){
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setUserType(dto.getUserType());
        userRepository.save(user);
    }
    private User toEntity(UserDTO dto){
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setUserType(dto.getUserType());
        return user;
    }



}
