package com.example.demo.service;

import com.example.demo.mapper.RaceInfoMapper;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;
@Service
public class RaceInfoService {

    private final RaceInfoMapper raceInfoMapper;

    public RaceInfoService(RaceInfoMapper raceInfoMapper) {
        this.raceInfoMapper = raceInfoMapper;
    }

    public List<Map<String, Object>> getRaceInfo(Map<String, Object> paramMap) {
        return raceInfoMapper.selRaceInfo(paramMap);
    }
}
