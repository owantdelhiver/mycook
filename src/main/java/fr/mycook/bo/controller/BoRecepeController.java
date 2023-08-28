package fr.mycook.bo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoRecepeController implements BoController{
    @GetMapping(value = {"/recepe"})
    public String home() {
        return "bo/recepe";
    }
}
