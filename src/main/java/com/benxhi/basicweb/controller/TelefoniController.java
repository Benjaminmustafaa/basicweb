package com.benxhi.basicweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelefoniController {
    @GetMapping("/add-telefon")
    public String addTelefon(){
        return "";
    }


}
