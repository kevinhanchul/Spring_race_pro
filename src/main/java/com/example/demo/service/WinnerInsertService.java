package com.example.demo.service;

import com.example.demo.mapper.WinnerInsertMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WinnerInsertService {

    private final WinnerInsertMapper winnerInsertMapper;

    public WinnerInsertService(WinnerInsertMapper winnerInsertMapper) {
        this.winnerInsertMapper = winnerInsertMapper;
    }

    public void getWinnerInsert(Map<String, Object> paramMap) {
    	System.out.println(paramMap);
        winnerInsertMapper.selWinnerInsert(paramMap);
    }
}
