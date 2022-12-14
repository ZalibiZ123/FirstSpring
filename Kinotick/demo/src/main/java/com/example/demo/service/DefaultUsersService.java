package com.example.demo.service;

import com.example.demo.dto.UsersDto;
import com.example.demo.entity.Users;
import com.example.demo.exception.ValidationException;
import com.example.demo.repo.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Objects.isNull;
@Service
@AllArgsConstructor
public class DefaultUsersService implements UsersService {
    private void validateUserDto(UsersDto usersDto) throws ValidationException {
        if (isNull(usersDto)) {
            throw new ValidationException("Object user is null");
        }
        if (isNull(usersDto.getLogin()) || usersDto.getLogin().isEmpty()) {
            throw new ValidationException("Login is empty");
        }
        if (isNull(usersDto.getPassword()) || usersDto.getPassword().isEmpty()) {
            throw new ValidationException("Password is empty");
        }
    }
    private final UsersRepository usersRepository;
    private final UsersConverter usersConverter;
    @Override
    public UsersDto saveUser(UsersDto usersDto) throws ValidationException {
        validateUserDto(usersDto);
        Users savedUser = usersRepository.save(usersConverter.fromUserDtoToUser(usersDto));
        return usersConverter.fromUserToUserDto(savedUser);
    }
    @Override
    public void deleteUser(Integer userId) {
        usersRepository.deleteById(userId);
    }
    @Override
    public UsersDto findByLogin(String login) {
        Users users = usersRepository.findByLogin(login);
        if (users != null) {
            return usersConverter.fromUserToUserDto(users);
        }
        return null;
    }
    @Override
    public List<UsersDto> findAll() {
        return usersRepository.findAll()
                .stream()
                .map(usersConverter::fromUserToUserDto)
                .collect(Collectors.toList());
    }
}
