package com.example.jpademo.controller;

import com.example.jpademo.model.entity.Home;
import com.example.jpademo.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {

    private final HomeService service;

    @GetMapping
    public List<Home> get() {
        return service.get();
    }

    @GetMapping("/{address}")
    public void get(@RequestBody String address) {
        service.get(address);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
