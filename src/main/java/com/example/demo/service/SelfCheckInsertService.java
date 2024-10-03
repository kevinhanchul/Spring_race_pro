package com.example.demo.service;

import com.example.demo.mapper.SelfCheckInsertMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SelfCheckInsertService {

    private final SelfCheckInsertMapper selfCheckInsertMapper;

    public SelfCheckInsertService(SelfCheckInsertMapper selfCheckInsertMapper) {
        this.selfCheckInsertMapper = selfCheckInsertMapper;
    }

    public void getSelfCheckInsert(Map<String, Object> paramMap) {
        System.out.println(paramMap);
        selfCheckInsertMapper.selSelfCheckInsert(paramMap);
    }
}
