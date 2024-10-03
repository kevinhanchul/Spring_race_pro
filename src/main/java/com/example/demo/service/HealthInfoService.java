package com.example.demo.service;

//import com.example.demo.mapper.HealthInfoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HealthInfoService {

  //  private final HealthInfoMapper healthInfoMapper;

    /*public HealthInfoService(HealthInfoMapper healthInfoMapper) {
        this.healthInfoMapper = healthInfoMapper;
    }*/

    public Map<String, Object> getHealthInfo(Long id) {
        Map<String, Object> a = new HashMap<>();
        //return healthInfoMapper.selHealthInfo(id);
        return a;
    }
}
