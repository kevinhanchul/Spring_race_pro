package com.example.demo.service;

import com.example.demo.mapper.RunnerInsertMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RunnerInsertService {

    private final RunnerInsertMapper runnerInsertMapper;

    public RunnerInsertService(RunnerInsertMapper runnerInsertMapper) {
        this.runnerInsertMapper = runnerInsertMapper;
    }

    public void getRunnerInsert(Long id) {
    	runnerInsertMapper.selRunnerInsert(id);
    }
}
