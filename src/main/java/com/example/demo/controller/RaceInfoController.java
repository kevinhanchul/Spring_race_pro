package com.example.demo.controller;

import com.example.demo.service.RaceInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/raceInfo")
public class RaceInfoController {

    private final RaceInfoService raceInfoService;

    public RaceInfoController(RaceInfoService raceInfoService) {
        this.raceInfoService = raceInfoService;
    }

    @GetMapping("/raceInfo")
    private ModelAndView raceInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("raceInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/raceInfo/getRaceInfo")
    public Map<String, Object> getRaceInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        return raceInfoService.getRaceInfo(paramMap);
    }    
}
