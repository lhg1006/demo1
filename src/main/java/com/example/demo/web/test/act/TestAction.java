package com.example.demo.web.test.act;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestAction {
    @RequestMapping("/test")
    public String testPage(){
        return "/test/index";
    }
}
