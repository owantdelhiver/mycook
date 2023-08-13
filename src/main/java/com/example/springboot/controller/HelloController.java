package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Human;
import com.example.springboot.repository.HumanRepository;

@RestController
public class HelloController {

	@Autowired
	HumanRepository humanRepository;

	@GetMapping(value = {"/", "/home"})
	public String index() {
		List<Human> humans = humanRepository.findAll();

		String string = "";
		for (Human human : humans) {
			string += human.getName() + " ";
		}
		
		return string;
	}

}
