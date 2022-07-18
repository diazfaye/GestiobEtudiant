package com.tdsi.gestionstudent.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tdsi.gestionstudent.controller.dto.UserRegistrationDto;
import com.tdsi.gestionstudent.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto userRegistrationDto);

}
