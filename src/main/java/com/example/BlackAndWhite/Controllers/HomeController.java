package com.example.BlackAndWhite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/homepage")
public class HomeController {

    @GetMapping
    public String getMethodName() {
        return "index";
    }
    

}