package com.example.jpademo.controller;

import com.example.jpademo.model.dto.UserDto;
import com.example.jpademo.model.dto.create.UserCreateDto;
import com.example.jpademo.model.dto.update.UserUpdateDto;
import com.example.jpademo.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl service;

    @GetMapping
    public List<UserDto> get() {
        return service.get();
    }

    @GetMapping("/{id}")
    public UserDto get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/age")
    public List<UserDto> get(@RequestParam Integer age) {
        return service.lessThen(age);
    }

    @GetMapping("/email")
    public List<UserDto> get(@RequestParam String email) {
        return service.findByEmail(email);
    }

    @PostMapping
    public UserDto create(@RequestBody UserCreateDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public UserDto update(@PathVariable Long id, @RequestBody UserUpdateDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public UserDto delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
