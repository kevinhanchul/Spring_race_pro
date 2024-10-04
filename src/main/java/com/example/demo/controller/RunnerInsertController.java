package com.example.demo.controller;

import com.example.demo.service.RunnerInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/runnerInfo")
public class RunnerInsertController {

    private final RunnerInfoService runnerInfoService;

    public RunnerInsertController(RunnerInfoService runnerInfoService) {
        this.runnerInfoService = runnerInfoService;
    }

    @GetMapping("/getRunnerInfo")
    public Map<String, Object> getRunnerInfo(@RequestParam Long id) {
        return runnerInfoService.getRunnerInfo(id);
    }    
}
