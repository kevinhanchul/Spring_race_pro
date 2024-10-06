package com.example.demo.controller;

import com.example.demo.service.RaceInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/raceInfo")
public class RaceInsertController {

    private final RaceInfoService raceInfoService;

    public RaceInsertController(RaceInfoService raceInfoService) {
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
    public void getRaceInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        raceInfoService.getRaceInfo(paramMap);
    }    
}
