package com.example.demo.controller;

import com.example.demo.service.FepInsertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/fepInsert")
public class FepInsertController {

    private final FepInsertService fepInsertService;

    public FepInsertController(FepInsertService fepInsertService) {
        this.fepInsertService = fepInsertService;
    }

    @GetMapping("/getFepInsert")
    public Map<String, Object> getFepInsert(@RequestParam Long id) {
        return fepInsertService.getFepInsert(id);
    }    
}
