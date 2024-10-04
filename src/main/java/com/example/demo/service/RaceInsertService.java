package com.example.demo.service;

import com.example.demo.mapper.RaceInfoMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RaceInsertService {

    private final RaceInfoMapper raceInfoMapper;

    public RaceInsertService(RaceInfoMapper raceInfoMapper) {
        this.raceInfoMapper = raceInfoMapper;
    }

    public Map<String, Object> getRaceInfo(Long id) {
        return raceInfoMapper.selRaceInfo(id);
    }
}
