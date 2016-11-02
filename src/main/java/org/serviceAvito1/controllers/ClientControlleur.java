package org.serviceAvito1.controllers;

import org.serviceAvito1.dao.IClientRepository;
import org.serviceAvito1.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Client")
public class ClientControlleur {
	@Autowired
	private IClientRepository clientRep;
	
	@RequestMapping(value ="/all",method = RequestMethod.GET, produces = "application/json")
	public List<Client> getProduits(){
		return clientRep.findAll();
	}
}
