package com.example.demo.controller;

import com.example.demo.service.HealthInsertService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/healthInsert")
public class HealthInsertController {

    private final HealthInsertService healthInsertService;

    public HealthInsertController(HealthInsertService healthInsertService) {
        this.healthInsertService = healthInsertService;
    }

    @GetMapping("/healthInsert")
    private ModelAndView healthInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("healthInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    @PostMapping("/healthInsert/getHealthInsert")
    public Map<String, Object> getHealthInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        return healthInsertService.getHealthInsert(paramMap);
    }    
}
