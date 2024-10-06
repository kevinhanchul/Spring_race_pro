package com.example.demo.service;

import com.example.demo.mapper.SellInsertMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SellInsertService {

    private final SellInsertMapper sellInsertMapper;

    public SellInsertService(SellInsertMapper sellInsertMapper) {
        this.sellInsertMapper = sellInsertMapper;
    }

    public void getSellInsert(Map<String, Object> paramMap) {
        System.out.println(paramMap);

        //Map<String, Object> checkSell = sellInsertMapper.chkSell(paramMap);
        //System.out.println(checkSell);
        sellInsertMapper.selSellInsert(paramMap);
    }
}
