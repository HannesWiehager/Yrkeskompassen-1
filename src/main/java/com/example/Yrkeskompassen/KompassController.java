package com.example.Yrkeskompassen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class KompassController {
    @Autowired
    FrågeRepository repository;

    @GetMapping("/test")
    public String Start (){
        return "test";
    }

}
