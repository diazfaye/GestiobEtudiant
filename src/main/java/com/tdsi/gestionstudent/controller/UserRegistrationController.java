package com.tdsi.gestionstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tdsi.gestionstudent.controller.dto.UserRegistrationDto;
import com.tdsi.gestionstudent.service.UserService;

@Controller
@RequestMapping("/registration")

public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	
	/*
	 * @ModelAttribute("user") public UserRegistrationDto userRegistrationDto() {
	 * return new UserRegistrationDto();
	 * 
	 * }
	 */
	@GetMapping
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new UserRegistrationDto());
		return "registration";
	}
	@PostMapping
	public String registrationUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		
		userService.save(registrationDto);
		return "redirect:/registration?success";
		
	}
	

}
