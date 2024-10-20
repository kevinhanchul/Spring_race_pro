package com.example.demo.service;

import com.example.demo.mapper.ChgSellMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ChgSellService {

    private final ChgSellMapper chgSellMapper;

    public ChgSellService(ChgSellMapper chgSellMapper) {
        this.chgSellMapper = chgSellMapper;
    }

    public void getChgSell(Map<String, Object> paramMap) {
        System.out.println("getChgSell : "+paramMap);
    	chgSellMapper.selChgSell(paramMap);
    }
}
