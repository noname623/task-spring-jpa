package com.example.jpademo.service;

import com.example.jpademo.model.dto.HomeDto;
import com.example.jpademo.model.dto.create.HomeCreateDto;

import java.util.List;

public interface HomeService {
    List<HomeDto> get();
    HomeDto get(Long id);
    HomeDto get(String address);
    HomeDto create(HomeCreateDto dto);
    HomeDto delete(Long id);
}
