package com.example.jpademo.service;

import com.example.jpademo.model.entity.Security;

import java.util.List;

public interface SecurityService {
    List<Security> get();
    Security get(Long id);
    void get(Security post);
    void create(Security security);
    void update(Long id);
    void delete(Long id);
}
