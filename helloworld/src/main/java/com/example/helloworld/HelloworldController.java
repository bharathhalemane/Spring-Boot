package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloworldController{

    @GetMapping("/")
    public String getWelcomeText(){
        return "Hello World";
    }

    @GetMapping("/name")
    public String getName(){
        return "Bharath";
    }

    @GetMapping("/date")
    public String plusDays(){
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(100);
        DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return futureDate.format(formater);
    }
}