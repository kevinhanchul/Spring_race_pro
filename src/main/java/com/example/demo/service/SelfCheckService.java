package com.example.demo.service;

import com.example.demo.mapper.SelfCheckMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SelfCheckService {

    private final SelfCheckMapper selfCheckMapper;

    public SelfCheckService(SelfCheckMapper selfCheckMapper) {
        this.selfCheckMapper = selfCheckMapper;
    }

    public Map<String, Object> getSelfCheck(Map<String, Object> paramMap) {
        return selfCheckMapper.selSelfCheck(paramMap);
    }
}
