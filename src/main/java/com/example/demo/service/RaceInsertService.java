package com.example.demo.service;

import com.example.demo.mapper.RaceInsertMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RaceInsertService {

    private final RaceInsertMapper raceInsertMapper;

    public RaceInsertService(RaceInsertMapper raceInsertMapper) {
        this.raceInsertMapper = raceInsertMapper;
    }

    public void getRaceInsert(Map<String, Object> paramMap) {
        raceInsertMapper.selRaceInsert(paramMap);
    }
}
