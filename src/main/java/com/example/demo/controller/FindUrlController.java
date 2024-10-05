package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class FindUrlController {
    
    @GetMapping("/numbers")
    private ModelAndView numbers() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("numbers");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/loginPage")
    private ModelAndView loginPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("loginPage");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/raceInfo")
    private ModelAndView raceInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("raceInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/runnerInfo")
    private ModelAndView runnerInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("runnerInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/sell")
    private ModelAndView sell() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sell");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/userInfo")
    private ModelAndView userInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @GetMapping("/winnerInfo")
    private ModelAndView winnerInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("winnerInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @GetMapping("/selfLimit")
    private ModelAndView selfLimit() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("selfLimit");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @GetMapping("/healthInfo")
    private ModelAndView healthInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("healthInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @GetMapping("/selfCheck")
    private ModelAndView selfCheck() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("selfCheck");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @GetMapping("/fepInfo")
    private ModelAndView fepInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("fepInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/userInsert")
    private ModelAndView userInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/winnerInsert")
    private ModelAndView winnerInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("winnerInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/sellInsert")
    private ModelAndView sellInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sellInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
/*
    @GetMapping("/selfCheckInsert")
    private ModelAndView selfCheckInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("selfCheckInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
*/
    @PostMapping("/add2")
    public Map<String, Integer> addNumbers(@RequestBody Map<String, String> numbers) throws Exception {
        Map<String, Integer> intNumbers = new HashMap<>();
        intNumbers.put("num1", Integer.parseInt(numbers.get("num1")));
        intNumbers.put("num2", Integer.parseInt(numbers.get("num2")));
        return intNumbers;
    }
}
