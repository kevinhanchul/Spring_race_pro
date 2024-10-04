package com.example.demo.service;

import com.example.demo.mapper.FepInsertMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FepInsertService {

    private final FepInsertMapper fepInsertMapper;

    public FepInsertService(FepInsertMapper fepInsertMapper) {
        this.fepInsertMapper = fepInsertMapper;
    }

    public Map<String, Object> getFepInsert(Map<String, Object> paramMap) {
        System.out.println(paramMap);
        return fepInsertMapper.selFepInsert(paramMap);

    }
    
}
