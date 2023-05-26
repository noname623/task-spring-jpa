package com.example.jpademo.mapper;

import com.example.jpademo.model.dto.HomeDto;
import com.example.jpademo.model.dto.SecurityDto;
import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.entity.Home;
import com.example.jpademo.model.entity.Security;
import com.example.jpademo.model.entity.User;
import org.springframework.stereotype.Service;

@Service
public class ProjectMapper {
    public UserDto mapUserToUserDto(User entity) {
        UserDto dto = new UserDto();
        dto.setName(entity.getUsername());
        dto.setAge(entity.getAge());
        dto.setEmail(entity .getEmail());
        return dto;
    }

    public User mapUserDtotoUser(UserDto dto){
        User entity = new User();
        entity.setUsername(dto.getName());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        return entity;
    }

    public SecurityDto mapSecurityDtoToSecurity(Security entity) {
        SecurityDto dto = new SecurityDto();
        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        dto.setPost(entity.getPost());
        return dto;
    }

    public Security mapSecurityToSecurityDto(SecurityDto dto) {
        Security entity = new Security();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setPost(dto.getPost());
        return entity;
    }

    public HomeDto mapHomeDtoToHome(Home entity) {
        HomeDto dto = new HomeDto();
        dto.setAddress(entity.getAddress());
        return dto;
    }

    public Home mapHomeToHomeDto(HomeDto dto) {
        Home entity = new Home();
        entity.setAddress(dto.getAddress());
        return entity;
    }
}
