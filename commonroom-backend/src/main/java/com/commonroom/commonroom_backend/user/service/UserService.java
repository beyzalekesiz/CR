package com.commonroom.commonroom_backend.user.service;

import com.commonroom.commonroom_backend.ApiResponse.ApiResponse;
import com.commonroom.commonroom_backend.Dto.LoginDto;
import com.commonroom.commonroom_backend.user.model.UsersModel;
import com.commonroom.commonroom_backend.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UsersModel> listUsers() {
        return userRepository.findAll();
    }

    public ApiResponse login(LoginDto loginDto) {
        UsersModel user = userRepository.findByEmail(loginDto.getEmail());
        if(user == null) {
            return new ApiResponse(false, "Invalid email address.");
        }
        if(!user.getPassword().equals(loginDto.getPassword())){
            return new ApiResponse(false, "Incorrect password, please try again.");
        }
        return new ApiResponse(true, "Login success");
    }
}


