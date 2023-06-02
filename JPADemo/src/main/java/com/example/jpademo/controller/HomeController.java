package com.example.jpademo.controller;

import com.example.jpademo.model.dto.HomeDto;
import com.example.jpademo.model.dto.create.HomeCreateDto;
import com.example.jpademo.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/home")
@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService service;

    @GetMapping
    public List<HomeDto> get() {
        return service.get();
    }

    @GetMapping("/{id}")
    public HomeDto get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/{address}")
    public void get(@RequestBody String address) {
        service.get(address);
    }

    @PostMapping
    public void create(@RequestBody HomeCreateDto dto) {
        service.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
