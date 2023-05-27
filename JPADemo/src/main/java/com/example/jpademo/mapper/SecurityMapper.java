package com.example.jpademo.mapper;

import com.example.jpademo.model.dto.SecurityDto;
import com.example.jpademo.model.dto.create.SecurityCreateDto;
import com.example.jpademo.model.dto.update.SecurityUpdateDto;
import com.example.jpademo.model.entity.Security;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SecurityMapper {
    public SecurityDto toDto(Security entity) {
        SecurityDto dto = new SecurityDto();
        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        dto.setPost(entity.getPost());
        return dto;
    }

    public Security toEntity(SecurityDto dto) {
        Security entity = new Security();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setPost(dto.getPost());
        return entity;
    }

    public Security toEntity(SecurityCreateDto dto) {
        Security entity = new Security();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setPost(dto.getPost());
        return entity;
    }

    public List<Security> toEntity(List<SecurityDto> dto) {
        return dto.stream().map(this::toEntity).collect(Collectors.toList());
    }

    public List<SecurityDto> toDto(List<Security> entity) {
        return entity.stream().map(this::toDto).collect(Collectors.toList());
    }
}
