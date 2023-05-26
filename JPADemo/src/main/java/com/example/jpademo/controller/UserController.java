package com.example.jpademo.controller;

import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.entity.User;
import com.example.jpademo.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    private final UserServiceImpl service;

    public UserController(UserServiceImpl service) {
        this.service = service;
    }


    @GetMapping
    public List<UserDto> get() {
        return service.get();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/{age}")
    public List<UserDto> get(@RequestBody Integer age) {
        return service.lessThen(age);
    }

    @GetMapping("/{email}")
    public List<UserDto> get(@RequestBody String email) {
        return service.findByEmail(email);
    }

    @PostMapping
    public void create(@RequestBody User user) {
        service.create(user);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id) {
        service.update(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
