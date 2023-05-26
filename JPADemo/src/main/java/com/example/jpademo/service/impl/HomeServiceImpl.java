package com.example.jpademo.service.impl;

import com.example.jpademo.model.entity.Home;
import com.example.jpademo.repository.HomeRepository;
import com.example.jpademo.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    private final HomeRepository repository;

    public HomeServiceImpl(HomeRepository repository) {
        this.repository = repository;

    }

    @Override
    public List<Home> get() {
        return repository.findAll();
    }

    @Override
    public void get(String address) {
        repository.findByAddress(address);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
