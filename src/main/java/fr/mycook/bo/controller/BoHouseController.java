package fr.mycook.bo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.mycook.bo.model.House;
import fr.mycook.bo.model.Human;
import fr.mycook.bo.service.HouseService;

@Controller
public class BoHouseController implements BoController{

    @Autowired
    HouseService houseService;
    
    @GetMapping(value = {"/house"})
    public String home (Model model) {
        List<House> houses = houseService.findAll();
        model.addAttribute("houses", houses);
        return "bo/house";
    }
}
