package com.example.jpademo.service.impl;

import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.entity.User;
import com.example.jpademo.repository.UserRepository;
import com.example.jpademo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private 

    @Override
    public List<UserDto> get() {
        return repository.findAll();
    }

    @Override
    public List<UserDto> lessThen(Integer age) {
        return repository.findByAgeLessThan(age);
    }

    @Override
    public List<UserDto> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public User get(Long id) {
        return repository.findById(id).orElse(new User(null, null, null, null));

    }

    @Override
    public void create(User user) {
        repository.save(user);
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
