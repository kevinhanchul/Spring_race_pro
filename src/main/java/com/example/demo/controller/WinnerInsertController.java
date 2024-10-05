package com.example.demo.controller;

import com.example.demo.service.WinnerInsertService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
//@RequestMapping("/winnerInsert")
public class WinnerInsertController {

    private final WinnerInsertService winnerInsertService;

    public WinnerInsertController(WinnerInsertService winnerInsertService) {
        this.winnerInsertService = winnerInsertService;
    }

    @GetMapping("/winnerInsert")
    private ModelAndView winnerInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("winnerInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/winnerInsert/getWinnerInsert")
    public void getWinnerInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        winnerInsertService.getWinnerInsert(paramMap);
    }    
}
