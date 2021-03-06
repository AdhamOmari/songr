package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloworld {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "name", required = false, defaultValue = "world") String name,
                             Model model) {
        model.addAttribute("name", name);
        return "helloWorld";
    }

    @GetMapping("/capitalize/{name}")
    public String capitalize( Model model, @PathVariable()  String name) {
        String uperCase = name.toUpperCase();

        model.addAttribute("name", uperCase);
        return "capitalize";
    }
}
