package org.serviceAvito1.controllers;

import org.serviceAvito1.dao.IUserRepository;
import org.serviceAvito1.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	private IUserRepository userRepository;
	@RequestMapping("/teste")
	public String test(){
		return "teste User";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public Client loginUser(@RequestParam("login") String login,@RequestParam("password") String password){
		Client existe=userRepository.findByLogin(login);
		if(existe != null)
			return existe;
		return null;
	}
}
