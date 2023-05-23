package com.commonroom.commonroom_backend.Dto;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@CrossOrigin(origins = "*")
public class LoginDto {

    private String password;

    private String email;
}
