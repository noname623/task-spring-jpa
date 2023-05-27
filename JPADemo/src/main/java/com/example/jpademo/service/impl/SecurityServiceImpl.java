package com.example.jpademo.service.impl;

import com.example.jpademo.mapper.SecurityMapper;
import com.example.jpademo.model.dto.SecurityDto;
import com.example.jpademo.model.dto.create.SecurityCreateDto;
import com.example.jpademo.model.dto.update.SecurityUpdateDto;
import com.example.jpademo.model.entity.Security;
import com.example.jpademo.model.exeption.ApplicationException;
import com.example.jpademo.model.exeption.ExceptionMessage;
import com.example.jpademo.repository.SecurityRepository;
import com.example.jpademo.service.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    public final SecurityRepository repository;
    private final SecurityMapper mapper;

    @Override
    public List<SecurityDto> get() {
        List<Security> sec = repository.findAll();
        List<SecurityDto> dto = mapper.toDto(sec);
        return dto;
    }

    @Override
    public SecurityDto get(Long id) {
        Security sec = repository.findById(id).orElseThrow(() -> new ApplicationException(ExceptionMessage.ID_NOT_FOUND));
        SecurityDto dto = mapper.toDto(sec);
        return dto;
    }

    @Override
    public SecurityDto get(Security post) {
        Security sec = repository.findByPost(post);
        SecurityDto dto = mapper.toDto(sec);
        return dto;
    }

    @Override
    public SecurityDto create(SecurityCreateDto dto) {
        Security security = mapper.toEntity(dto);
        System.out.println(security);
        Security securitySave = repository.save(security);
        System.out.println(securitySave);
        SecurityDto securityDto = mapper.toDto(securitySave);
        return securityDto;
    }

    @Override
    public SecurityDto update(Long id, SecurityUpdateDto dto) {
        SecurityDto securityDto = get(id);
        Security security = mapper.toEntity(securityDto);
        security.setName(dto.getName());
        Security securitySave = repository.save(security);
        SecurityDto dtoSave = mapper.toDto(securitySave);
        return dtoSave;
    }


    @Override
    public SecurityDto delete(Long id) {
        SecurityDto dto = get(id);
        repository.deleteById(id);
        return dto;
    }
}
