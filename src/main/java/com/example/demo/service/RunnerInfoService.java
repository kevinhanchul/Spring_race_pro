package com.example.demo.service;

import com.example.demo.mapper.RunnerInfoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RunnerInfoService {

    private final RunnerInfoMapper runnerInfoMapper;

    public RunnerInfoService(RunnerInfoMapper runnerInfoMapper) {
        this.runnerInfoMapper = runnerInfoMapper;
    }

    public Map<String, Object> getRunnerInfo(Map<String, Object> paramMap) {
    	return runnerInfoMapper.selRunnerInfo(paramMap);
    }
}
