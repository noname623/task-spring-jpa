package com.example.jpademo.controller;

import com.example.jpademo.model.entity.Security;
import com.example.jpademo.service.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/sec")
@RestController
@RequiredArgsConstructor
public class SecurityController {

    public final SecurityService service;

   @GetMapping
    public List<Security> get() {
        return service.get();
    }

    @GetMapping("/{id}")
    public Security get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/{post}")
    public void get(@RequestBody Security post) {
        service.get(post);
    }

    @PostMapping
    public void create(@RequestBody Security security) {
        service.create(security);
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
