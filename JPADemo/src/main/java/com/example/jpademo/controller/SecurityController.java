package com.example.jpademo.controller;

import com.example.jpademo.model.dto.SecurityDto;
import com.example.jpademo.model.dto.create.SecurityCreateDto;
import com.example.jpademo.model.dto.update.SecurityUpdateDto;
import com.example.jpademo.model.entity.Security;
import com.example.jpademo.service.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/sec")
@RestController
@RequiredArgsConstructor
public class SecurityController {

    private final SecurityService service;

   @GetMapping
    public List<SecurityDto> get() {
        return service.get();
    }

    @GetMapping("/{id}")
    public SecurityDto get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/{post}")
    public void get(@RequestBody Security post) {
        service.get(post);
    }

    @PostMapping
    public void create(@RequestBody SecurityCreateDto dto) {
        service.create(dto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody SecurityUpdateDto dto) {
       service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
       service.delete(id);
    }
}
