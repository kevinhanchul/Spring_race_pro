package com.example.demo.service;

import com.example.demo.mapper.WinnerInsertMapper;
import org.springframework.stereotype.Service;

@Service
public class WinnerInsertService {

    private final WinnerInsertMapper winnerInsertMapper;

    public WinnerInsertService(WinnerInsertMapper winnerInsertMapper) {
        this.winnerInsertMapper = winnerInsertMapper;
    }

    public void getWinnerInsert(Long id) {
    	winnerInsertMapper.selWinnerInsert(id);
    }
}
