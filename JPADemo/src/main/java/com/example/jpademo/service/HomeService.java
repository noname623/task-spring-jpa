package com.example.jpademo.service;

import com.example.jpademo.model.entity.Home;

import java.util.List;

public interface HomeService {
    List<Home> get();
    void get(String address);
    void delete(Long id);
}
