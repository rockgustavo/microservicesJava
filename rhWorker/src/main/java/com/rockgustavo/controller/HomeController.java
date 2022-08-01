package com.rockgustavo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rockgustavo.model.User;

@RestController
public class HomeController {
	ModelAndView mv = new ModelAndView();

	@GetMapping("/")
	public ModelAndView index() {
		mv.setViewName("home/index");
		return mv;
	}

	@GetMapping("/logar")
	public ModelAndView index2() {
		mv.setViewName("home/index");
		return mv;
	}

	@PostMapping("/logar")
	public ModelAndView create(User user) {
		System.out.println("LOGIN: " + user.getName() + " - SENHA: " + user.getPassword());

		mv.setViewName("home/index");
		return mv;
	}

}