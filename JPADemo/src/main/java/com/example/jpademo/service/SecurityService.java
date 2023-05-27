package com.example.jpademo.service;

import com.example.jpademo.model.dto.HomeDto;
import com.example.jpademo.model.dto.SecurityDto;
import com.example.jpademo.model.dto.create.SecurityCreateDto;
import com.example.jpademo.model.dto.update.SecurityUpdateDto;
import com.example.jpademo.model.entity.Security;

import java.util.List;

public interface SecurityService {
    List<SecurityDto> get();
    SecurityDto get(Long id);
    SecurityDto get(Security post);
    SecurityDto create(SecurityCreateDto dto);
    SecurityDto update(Long id, SecurityUpdateDto dto);
    SecurityDto delete(Long id);
}
