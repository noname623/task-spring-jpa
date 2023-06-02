package com.example.jpademo.service.impl;

import com.example.jpademo.mapper.UserMapper;
import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.dto.create.UserCreateDto;
import com.example.jpademo.model.dto.update.UserUpdateDto;
import com.example.jpademo.model.entity.User;
import com.example.jpademo.model.exeption.ApplicationException;
import com.example.jpademo.model.exeption.ExceptionMessage;
import com.example.jpademo.repository.UserRepository;
import com.example.jpademo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public List<UserDto> get() {
        List<User> users = repository.findAll();
        return mapper.toDto(users);
    }

    @Override
    public List<UserDto> lessThen(Integer age) {
        List<User> users = repository.findByAgeLessThan(age);
        return mapper.toDto(users);
    }

    @Override
    public List<UserDto> findByEmail(String email) {
        List<User> users = repository.findByEmail(email);
        return mapper.toDto(users);
    }

    @Override
    public UserDto get(Long id) {
        User user = repository.findById(id).orElseThrow(() -> new ApplicationException(ExceptionMessage.ID_NOT_FOUND));
        return mapper.toDto(user);
    }

    @Override
    public UserDto create(UserCreateDto dto) {
        User user = mapper.toEntity(dto);
        System.out.println(user.toString());
        User userSave = repository.save(user);
        System.out.println(userSave);
        return mapper.toDto(userSave);
    }

    @Override
    public UserDto update(Long id, UserUpdateDto dto) {
        UserDto userDto = get(id);
        User user = mapper.toEntity(userDto);
        user.setUsername(dto.getUsername());
        User userSave = repository.save(user);
        delete(id);
        return mapper.toDto(userSave);
    }


    @Override
    public UserDto delete(Long id) {
        UserDto dto = get(id);
        repository.deleteById(id);
        return dto;
    }
}
