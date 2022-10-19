package com.example.demo.service;

import com.example.demo.dto.UsersDto;
import com.example.demo.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {
    public UsersDto fromUserToUserDto(Users users) {
        return UsersDto.builder()
                .id(users.getId())
                .email(users.getEmail())
                .login(users.getLogin())
                .password(users.getPassword())
                .name(users.getName())
                .surname(users.getSurname())
                .build();
    }

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setEmail(usersDto.getEmail());
        users.setName(usersDto.getName());
        users.setSurname(usersDto.getSurname());
        users.setLogin(usersDto.getLogin());
        users.setPassword(usersDto.getPassword());
        return users;
    }
}
