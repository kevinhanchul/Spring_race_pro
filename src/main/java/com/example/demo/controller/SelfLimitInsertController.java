package com.example.demo.controller;

import com.example.demo.service.SelfLimitService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/selfLimit")
public class SelfLimitInsertController {
    private final SelfLimitService selfLimitService;

    public SelfLimitInsertController(SelfLimitService selfLimitService) {
        this.selfLimitService = selfLimitService;
    }

    /*
    @GetMapping("/getSelfLimit")
    public Map<String, Object> getSelfLimit(@RequestParam Map<String, Object> paramMap) {
        System.out.println(paramMap);
        return selfLimitService.getSelfLimit(paramMap);
    }*/


    // POST 메서드도 사용할 수 있게 하려면 @PostMapping 추가
    @PostMapping("/getSelfLimit")
    public List<Map<String, Object>> getSelfLimit(@RequestBody Map<String, Object> paramMap) throws Exception {
        return selfLimitService.getSelfLimit(paramMap);
    }
}
