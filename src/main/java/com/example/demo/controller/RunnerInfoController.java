package com.example.demo.controller;

import com.example.demo.service.RunnerInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/runnerInfo")
public class RunnerInfoController {

    private final RunnerInfoService runnerInfoService;

    public RunnerInfoController(RunnerInfoService runnerInfoService) {
        this.runnerInfoService = runnerInfoService;
    }

    @GetMapping("/runnerInfo")
    private ModelAndView runnerInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("runnerInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/runnerInfo/runnerBaseInfo")
    public List<Map<String, Object>> runnerBaseInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        return runnerInfoService.runnerBaseInfo(paramMap);
    }

    @PostMapping("/runnerInfo/getRunnerInfo")
    public List<Map<String, Object>> getRunnerInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        return runnerInfoService.getRunnerInfo(paramMap);
    }    
}
