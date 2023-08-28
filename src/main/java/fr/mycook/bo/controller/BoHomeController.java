package fr.mycook.bo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "bo")
public class BoHomeController {
    @GetMapping(value = {"", "/", "/home"})
    public String home() {
        return "bo/home";
    }
}
