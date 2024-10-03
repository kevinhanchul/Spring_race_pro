package com.example.demo.controller;

import com.example.demo.service.SellInsertService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/sellInsert")
public class SellInsertController {

    private final SellInsertService sellInsertService;

    public SellInsertController(SellInsertService sellInsertService) {
        this.sellInsertService = sellInsertService;
    }

    @PostMapping("/getSellInsert")
    public void getSellInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        sellInsertService.getSellInsert(paramMap);
    }    
}
