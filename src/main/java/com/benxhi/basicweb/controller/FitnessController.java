package com.benxhi.basicweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FitnessController {
    @GetMapping("/Fitness")
    public String getFitness(){
        return "FitnessApp";
    }
}
