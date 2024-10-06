package com.example.demo.controller;

import com.example.demo.service.RunnerInsertService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/runnerInsert")
public class RunnerInsertController {

    private final RunnerInsertService runnerInsertService;

    public RunnerInsertController(RunnerInsertService runnerInsertService) {
        this.runnerInsertService = runnerInsertService;
    }

    @GetMapping("/runnerInsert")
    private ModelAndView runnerInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("runnerInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/runnerInsert/getRunnerInsert")
    public void getRunnerInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        runnerInsertService.getRunnerInsert(paramMap);
    }
}
