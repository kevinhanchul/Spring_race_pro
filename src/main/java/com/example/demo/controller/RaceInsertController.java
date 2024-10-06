package com.example.demo.controller;

import com.example.demo.service.RaceInsertService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/raceInsert")
public class RaceInsertController {

    private final RaceInsertService raceInsertService;

    public RaceInsertController(RaceInsertService raceInsertService) {
        this.raceInsertService = raceInsertService;
    }

    @GetMapping("/raceInsert")
    private ModelAndView raceInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("raceInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/raceInsert/getRaceInsert")
    public void getRaceInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        raceInsertService.getRaceInsert(paramMap);
    }    
}
