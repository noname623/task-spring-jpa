package com.example.jpademo.mapper;

import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.dto.create.UserCreateDto;
import com.example.jpademo.model.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {
    public UserDto toDto(User entity) {
        UserDto dto = new UserDto();
        dto.setName(entity.getUsername());
        dto.setAge(entity.getAge());
        dto.setEmail(entity .getEmail());
        return dto;
    }

    public User toEntity(UserDto dto) {
        User entity = new User();
        entity.setUsername(dto.getName());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        return entity;
    }


    public User toEntity(UserCreateDto dto) {
        User entity = new User();
        entity.setId(null);
        entity.setUsername(dto.getName());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        return entity;
    }

    public List<UserDto> toDto(List<User> entity) {
        return entity.stream().map(this::toDto).collect(Collectors.toList());
    }

    public List<User> toEntity(List<UserDto> dto) {
        return dto.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
