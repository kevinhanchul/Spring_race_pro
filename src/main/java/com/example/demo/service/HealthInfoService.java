package com.example.demo.service;

import com.example.demo.mapper.HealthInfoMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HealthInfoService {

    private final HealthInfoMapper healthInfoMapper;

    public HealthInfoService(HealthInfoMapper healthInfoMapper) {
        this.healthInfoMapper = healthInfoMapper;
    }

    public Map<String, Object> getHealthInfo(Long id) {
    	return healthInfoMapper.selHealthInfo(id);
    }
}