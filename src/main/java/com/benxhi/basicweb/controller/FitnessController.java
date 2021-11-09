package com.benxhi.basicweb.controller;
import com.benxhi.basicweb.model.FitnessModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;

@Controller
public class FitnessController {

    ArrayList<FitnessModel> fitnessUsers = new ArrayList<>();
    @GetMapping("/addfitnessusers")
    public String getFitness(Model model) {
        model.addAttribute("fitnessUserModel", new FitnessModel());
        return "AddUsers";
    }
    @PostMapping("/viewfitnessusers")
    public String createUser(@ModelAttribute FitnessModel fitnessModel, Model model) {
        fitnessUsers.add(fitnessModel);
        model.addAttribute("fitnessUsers", fitnessUsers);
        return "ViewUsers";
    }
    @GetMapping("/viewfitnessusers")
    public String getViewUsers(){
        return "ViewUsers";
    }
}