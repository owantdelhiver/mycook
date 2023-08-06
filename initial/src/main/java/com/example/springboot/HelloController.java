package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = {"/", "/home"})
	public String index() {
		return "Salut c'est moi le plus beau !";
	}

}
