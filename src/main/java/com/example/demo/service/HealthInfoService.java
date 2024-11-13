package com.example.demo.service;

import com.example.demo.mapper.HealthInfoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HealthInfoService {

    private final HealthInfoMapper healthInfoMapper;

    public HealthInfoService(HealthInfoMapper healthInfoMapper) {
        this.healthInfoMapper = healthInfoMapper;
    }

    public List<Map<String, Object>> getHealthInfo(Map<String, Object> paramMap) {
        return healthInfoMapper.selHealthInfo(paramMap);
    }
}
