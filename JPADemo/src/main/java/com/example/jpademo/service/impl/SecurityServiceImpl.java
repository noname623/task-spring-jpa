package com.example.jpademo.service.impl;

import com.example.jpademo.model.entity.Security;
import com.example.jpademo.repository.SecurityRepository;
import com.example.jpademo.service.SecurityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityServiceImpl implements SecurityService {

    public final SecurityRepository repository;

    public SecurityServiceImpl(SecurityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Security> get() {
        return repository.findAll();
    }

    @Override
    public Security get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void get(Security post) {
        repository.findByPost(post);
    }

    @Override
    public void create(Security security) {
        repository.save(security);
    }

    @Override
    public void update(Long id) {
        repository.updateById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
