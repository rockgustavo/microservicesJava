package com.rockgustavo.controller;

import org.springframework.web.servlet.ModelAndView;

//@RestController
//@RequestMapping("/")
public class HomeController {
	ModelAndView mv = new ModelAndView();

//	@GetMapping("/")
	public ModelAndView index() {
		mv.setViewName("home/index");
		return mv;
	}

//	@GetMapping("/logar")
	public ModelAndView index2() {
		mv.setViewName("home/index");
		return mv;
	}

//	@PostMapping("/logar")
	public ModelAndView create(String name, String password) {
		System.out.println("LOGIN: " + name + " - SENHA: " + password);

		mv.setViewName("home/index");
		return mv;
	}

}
