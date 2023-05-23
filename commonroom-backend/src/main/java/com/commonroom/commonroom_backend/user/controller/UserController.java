package com.commonroom.commonroom_backend.user.controller;

import com.commonroom.commonroom_backend.ApiResponse.ApiResponse;
import com.commonroom.commonroom_backend.Dto.LoginDto;
import com.commonroom.commonroom_backend.user.model.UsersModel;
import com.commonroom.commonroom_backend.user.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Getter
@Setter
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path ="/getAllUsers", method = RequestMethod.GET)
    public List<UsersModel> getAllUsers() {
        List<UsersModel> users = userService.listUsers();
        return users;
    }

    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }

}
