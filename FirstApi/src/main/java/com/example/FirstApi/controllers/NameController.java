package com.example.FirstApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/")
    public String getName(){

        return "Alessio";
    }

    @PostMapping("/")
    public String getNameContr(){

        return "oissela";
    }

}


