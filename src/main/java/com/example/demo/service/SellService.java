package com.example.demo.service;

import com.example.demo.mapper.SellMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SellService {

    private final SellMapper sellMapper;

    public SellService(SellMapper sellMapper) {
        this.sellMapper = sellMapper;
    }

    public List<Map<String, Object>> getSell(Map<String, Object> paramMap) {
        System.out.println(paramMap);
    	return sellMapper.selSell(paramMap);
    }
}
