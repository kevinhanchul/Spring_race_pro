package com.example.demo.service;

import com.example.demo.mapper.WinnerInfoMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WinnerInfoService {

    private final WinnerInfoMapper winnerInfoMapper;

    public WinnerInfoService(WinnerInfoMapper winnerInfoMapper) {
        this.winnerInfoMapper = winnerInfoMapper;
    }

    public Map<String, Object> getWinnerInfo(Map<String, Object> paramMap) {

//    	Map<String, Object> winner_result = winnerInfoMapper.selWinnerInfo(id);
        //Map<String, Object> resultMap = new HashMap<>();
        //resultMap.put("winner_result", winner_result);
        return winnerInfoMapper.selWinnerInfo(paramMap);
    }
}
