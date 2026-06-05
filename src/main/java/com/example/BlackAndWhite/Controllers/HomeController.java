package com.example.BlackAndWhite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/BlackAndWhite")
public class HomeController {

    @GetMapping
    public String Homepage() {
        return "index";
    }

    @GetMapping("/create")
    public String Create() {
        return "create";
    }
    
    @GetMapping("/delete")
    public String Delete() {
        return "delete";
    }
    
    @PostMapping("/update")
    public String Update() {
        return "update";
    }
    

}