package com.example.demo.service;

import com.example.demo.mapper.HealthInsertMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HealthInsertService {

    private final HealthInsertMapper healthInsertMapper;

    public HealthInsertService(HealthInsertMapper healthInsertMapper) {
        this.healthInsertMapper = healthInsertMapper;
    }

    public void getHealthInsert(Map<String, Object> paramMap) {
        healthInsertMapper.selHealthInsert(paramMap);

    }
}
