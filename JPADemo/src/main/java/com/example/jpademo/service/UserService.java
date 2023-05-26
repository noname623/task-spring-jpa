package com.example.jpademo.service;

import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.entity.User;

import java.util.List;

public interface UserService {
    List<UserDto> get();
    List<UserDto> lessThen(Integer age);
    List<UserDto> findByEmail(String email);
    User get(Long id);
    void create(User user);
    void update(Long id);
    void delete(Long id);
}
