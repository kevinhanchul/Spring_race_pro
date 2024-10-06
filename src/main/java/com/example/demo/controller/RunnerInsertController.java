package com.example.demo.controller;

import com.example.demo.service.RunnerInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/runnerInfo")
public class RunnerInsertController {

    private final RunnerInfoService runnerInfoService;

    public RunnerInsertController(RunnerInfoService runnerInfoService) {
        this.runnerInfoService = runnerInfoService;
    }

    @GetMapping("/runnerInfo")
    private ModelAndView runnerInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("runnerInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/runnerInfo/getRunnerInfo")
    public void getRunnerInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        runnerInfoService.getRunnerInfo(paramMap);
    }
}
