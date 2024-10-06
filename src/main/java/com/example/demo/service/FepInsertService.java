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

    public void getFepInsert(Map<String, Object> paramMap) {
        System.out.println(paramMap);
        fepInsertMapper.selFepInsert(paramMap);

    }
    
}
