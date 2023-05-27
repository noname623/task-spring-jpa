package com.example.jpademo.mapper;

import com.example.jpademo.model.dto.HomeDto;
import com.example.jpademo.model.dto.create.HomeCreateDto;
import com.example.jpademo.model.entity.Home;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HomeMapper {
    public HomeDto toDto(Home entity) {
        HomeDto dto = new HomeDto();
        dto.setId(entity.getId());
        dto.setAddress(entity.getAddress());
        return dto;
    }

    public Home toEntity(HomeDto dto) {
        Home entity = new Home();
        entity.setAddress(dto.getAddress());
        return entity;
    }

    public Home toEntity(HomeCreateDto dto) {
        Home entity = new Home();
        entity.setAddress(dto.getAddress());
        return entity;
    }

    public List<HomeDto> toDto(List<Home> entity) {
        return entity.stream().map(this::toDto).collect(Collectors.toList());
    }

    public List<Home> toEntity(List<HomeDto> dto) {
        return dto.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
