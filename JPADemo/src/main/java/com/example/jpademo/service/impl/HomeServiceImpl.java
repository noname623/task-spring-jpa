package com.example.jpademo.service.impl;

import com.example.jpademo.mapper.HomeMapper;
import com.example.jpademo.model.dto.HomeDto;
import com.example.jpademo.model.dto.create.HomeCreateDto;
import com.example.jpademo.model.entity.Home;
import com.example.jpademo.model.exeption.ApplicationException;
import com.example.jpademo.model.exeption.ExceptionMessage;
import com.example.jpademo.repository.HomeRepository;
import com.example.jpademo.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {

    private final HomeRepository repository;
    private final HomeMapper mapper;

    @Override
    public List<HomeDto> get() {
        List<Home> home = repository.findAll();
        return mapper.toDto(home);
    }

    @Override
    public HomeDto get(Long id) {
        Home home = repository.findById(id).orElseThrow(() -> new ApplicationException(ExceptionMessage.ID_NOT_FOUND));
        return mapper.toDto(home);
    }

    @Override
    public HomeDto get(String address) {
        Home home = repository.findByAddress(address);
        return mapper.toDto(home);
    }

    @Override
    public HomeDto create(HomeCreateDto dto) {
        Home home = mapper.toEntity(dto);
        System.out.println(home);
        Home homeSave = repository.save(home);
        System.out.println(homeSave);
        return mapper.toDto(homeSave);
    }


    @Override
    public HomeDto delete(Long id) {
        HomeDto dto = get(id);
        repository.deleteById(id);
        return dto;
    }
}
