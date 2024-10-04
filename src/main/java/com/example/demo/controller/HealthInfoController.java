package com.example.demo.controller;

import com.example.demo.service.HealthInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@RestController
@RequestMapping("/healthInfo")
public class HealthInfoController {

    private final HealthInfoService healthInfoService;

    public HealthInfoController(HealthInfoService healthInfoService) {
        this.healthInfoService = healthInfoService;
    }

    @GetMapping("/healthInfo")
    private ModelAndView healthInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("healthInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/healthInfo/getHealthInfo")
    public Map<String, Object> getHealthInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        return healthInfoService.getHealthInfo(paramMap);
    }    
}
