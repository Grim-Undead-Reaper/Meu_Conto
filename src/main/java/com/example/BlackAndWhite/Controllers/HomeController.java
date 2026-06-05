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

    @PostMapping("/create")
    public String PostCreate() {
        return "create";
    }
    
    @GetMapping("/delete")
    public String Delete() {
        return "delete";
    }
    
    @GetMapping("/update")
    public String Update() {
        return "update";
    }

    @PostMapping("/update")
    public String PostUpdate() {
        return "update";
    }
    

}