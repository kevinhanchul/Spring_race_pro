package com.example.demo.service;

import com.example.demo.mapper.SelfLimitMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SelfLimitInsertService {

    private final SelfLimitMapper selfLimitMapper;

    public SelfLimitInsertService(SelfLimitMapper selfLimitMapper) {
        this.selfLimitMapper = selfLimitMapper;
    }

    public List<Map<String, Object>> getSelfLimit(Map<String, Object> paramMap) {
        System.out.println(paramMap);
        return selfLimitMapper.selSelfLimit(paramMap);
    }
}
