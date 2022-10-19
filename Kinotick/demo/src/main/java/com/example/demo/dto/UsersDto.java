package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsersDto {

    private Integer id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;
}
