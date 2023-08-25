package fr.mycook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController{

	@GetMapping(value = "/")
	public String index() {
		return "hello";
	}

	@GetMapping(value = "/error")
	public String error() {
		return "error";
	}
}
