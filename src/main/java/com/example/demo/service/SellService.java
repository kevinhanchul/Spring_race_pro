package com.example.demo.service;

import com.example.demo.mapper.SellMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SellService {

    private final SellMapper sellMapper;

    public SellService(SellMapper sellMapper) {
        this.sellMapper = sellMapper;
    }

    public Map<String, Object> getSell(Map<String, Object> paramMap) {
    	return sellMapper.selSell(paramMap);
    }
}
