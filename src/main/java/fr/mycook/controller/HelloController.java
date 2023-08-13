package fr.mycook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import fr.mycook.repository.HumanRepository;

@Controller
public class HelloController{

	@Autowired
	HumanRepository humanRepository;

	@GetMapping(value = "/")
	public String index() {
		
		return "hello";
	}

	@GetMapping(value = "/error")
	public String error() {
		return "error";
	}
}
