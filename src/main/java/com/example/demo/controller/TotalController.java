package com.example.demo.controller;

import com.example.demo.service.TotalService;
import com.example.demo.service.TotalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/chgHealth")
public class TotalController {

    private final TotalService totalService;

    public TotalController(TotalService totalService) {
        this.totalService = totalService;
    }
    
    @PostMapping("/getTotal/releaseFocus")
    public Map<String, Object> releaseFocus(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println("releaseFocus : "+paramMap);
        return totalService.releaseFocus(paramMap);
    }

    @PostMapping("/getTotal/noticePopup")
    public Map<String, Object> noticePopup(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println("noticePopup : "+paramMap);
        return totalService.noticePopup(paramMap);
    }

    @PostMapping("/getTotal/noticePopupLimit")
    public Map<String, Object> noticePopupLimit(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println("noticePopupLimit : "+paramMap);
        return totalService.noticePopupLimit(paramMap);
    }
}
