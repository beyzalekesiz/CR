package com.commonroom.commonroom_backend.user.service;

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


}
