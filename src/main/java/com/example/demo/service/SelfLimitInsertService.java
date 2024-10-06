package com.example.demo.service;

import com.example.demo.mapper.SelfLimitInsertMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SelfLimitInsertService {

    private final SelfLimitInsertMapper selfLimitInsertMapper;

    public SelfLimitInsertService(SelfLimitInsertMapper selfLimitInsertMapper) {
        this.selfLimitInsertMapper = selfLimitInsertMapper;
    }

    public void getSelfLimitInsert(Map<String, Object> paramMap) {
        System.out.println(paramMap);
        selfLimitInsertMapper.selSelfLimitInsert(paramMap);
    }
}
