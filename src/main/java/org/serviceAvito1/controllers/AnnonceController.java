package org.serviceAvito1.controllers;

import java.util.List;

import org.serviceAvito1.dao.IAnnonceRepository;
import org.serviceAvito1.entities.Annonce; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("Annonce")
public class AnnonceController {
	@Autowired
	private IAnnonceRepository annonceRep;
	@RequestMapping("/alla")
	public List<Annonce> getProduits(){
		return annonceRep.findAll();
	}
}
