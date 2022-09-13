package com.example.testboard.board.list.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/editor")
    public String editor(){
        return "editor";
    }

}
