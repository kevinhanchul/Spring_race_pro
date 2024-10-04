package com.example.demo.service;

import com.example.demo.mapper.RunnerInfoMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RunnerInsertService {

    private final RunnerInfoMapper runnerInfoMapper;

    public RunnerInsertService(RunnerInfoMapper runnerInfoMapper) {
        this.runnerInfoMapper = runnerInfoMapper;
    }

    public Map<String, Object> getRunnerInfo(Long id) {
    	return runnerInfoMapper.selRunnerInfo(id);
    }
}
