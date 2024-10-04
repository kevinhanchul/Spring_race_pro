package com.example.demo.controller;

import com.example.demo.service.HealthInsertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/healthInsert")
public class HealthInsertController {

    private final HealthInsertService healthInsertService;

    public HealthInsertController(HealthInsertService healthInsertService) {
        this.healthInsertService = healthInsertService;
    }

    @GetMapping("/getHealthInsert")
    public Map<String, Object> getHealthInsert(@RequestParam Long id) {
        return healthInsertService.getHealthInsert(id);
    }    
}
