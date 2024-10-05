package com.example.demo.controller;

import com.example.demo.service.WinnerInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/winnerInfo")
public class WinnerInfoController {

    private final WinnerInfoService winnerInfoService;

    public WinnerInfoController(WinnerInfoService winnerInfoService) {
        this.winnerInfoService = winnerInfoService;
    }

    @GetMapping("/winnerInfo")
    private ModelAndView winnerInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("winnerInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/winnerInfo/getWinnerInfo")
    public Map<String, Object> getWinnerInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        return winnerInfoService.getWinnerInfo(paramMap);
    }    
}
