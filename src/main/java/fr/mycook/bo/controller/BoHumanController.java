package fr.mycook.bo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.mycook.bo.model.Human;
import fr.mycook.bo.service.HumanService;

@Controller
public class BoHumanController implements BoController{

    @Autowired
    HumanService humanService;

    @GetMapping(value = {"/human"})
    public String home(Model model) {
        List<Human> humans = humanService.findAll();
        model.addAttribute("humans", humans);
        return "bo/human";
    }
}