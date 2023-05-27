package com.example.jpademo.service;

import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.dto.create.UserCreateDto;
import com.example.jpademo.model.dto.update.UserUpdateDto;

import java.util.List;

public interface UserService {
    List<UserDto> get();
    List<UserDto> lessThen(Integer age);
    List<UserDto> findByEmail(String email);
    UserDto get(Long id);
    UserDto create(UserCreateDto dto);
    UserDto update(Long id, UserUpdateDto dto);
    UserDto delete(Long id);
}
