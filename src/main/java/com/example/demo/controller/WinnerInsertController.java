package com.example.demo.controller;

import com.example.demo.service.WinnerInsertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/winnerInsert")
public class WinnerInsertController {

    private final WinnerInsertService winnerInsertService;

    public WinnerInsertController(WinnerInsertService winnerInsertService) {
        this.winnerInsertService = winnerInsertService;
    }

    @GetMapping("/getWinnerInsert")
    public void getWinnerInsert(@RequestParam Long id) {
        winnerInsertService.getWinnerInsert(id);
    }    
}
