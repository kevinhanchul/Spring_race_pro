package com.example.demo.controller;

import com.example.demo.service.HealthInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/healthInfo")
public class HealthInsertController {

    private final HealthInfoService healthInfoService;

    public HealthInsertController(HealthInfoService healthInfoService) {
        this.healthInfoService = healthInfoService;
    }

    @GetMapping("/getHealthInfo")
    public Map<String, Object> getHealthInfo(@RequestParam Long id) {
        return healthInfoService.getHealthInfo(id);
    }    
}
