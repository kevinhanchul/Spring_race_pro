package com.example.demo.service;

import com.example.demo.mapper.TotalMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TotalService {

    private final TotalMapper totalMapper;

    public TotalService(TotalMapper totalMapper) {
        this.totalMapper = totalMapper;
    }

    public Map<String, Object> releaseFocus(Map<String, Object> paramMap) {
        System.out.println("releaseFocus : " + paramMap);
    	return totalMapper.releaseFocus(paramMap);
    }
}
