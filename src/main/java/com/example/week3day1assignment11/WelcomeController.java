package com.example.week3day1assignment11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")

public class WelcomeController {
    @GetMapping("/name")
    public String name(){
        return "My name is Abdulaziz";
    }
    @GetMapping("/age")
    public String age(){
        return "My age is 31";
    }
        @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping("/names")
    public String [] names(){
        String [] names ={"ahmed,salem,bader,saad"};
        return names;

    }




}
