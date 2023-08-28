package fr.mycook.bo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoHomeController implements BoController{
    @GetMapping(value = {"", "/", "/home"})
    public String home() {
        return "bo/home";
    }
}