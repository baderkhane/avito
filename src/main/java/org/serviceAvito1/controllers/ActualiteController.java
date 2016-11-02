package org.serviceAvito1.controllers;

import java.util.List;

import org.serviceAvito1.dao.IActualiteRepository;
import org.serviceAvito1.entities.actualite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ActualiteController {
	@Autowired
	private IActualiteRepository actualiteRepository;
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	@RequestMapping("/save")
	public actualite saveProduit(actualite  p){
		actualiteRepository.save(p);
		return p;
	}
	@RequestMapping("/all")
	public List<actualite> getProduits(){
		return actualiteRepository.findAll();
	}
	@RequestMapping("/produits")
	public Page<actualite> getProduits(int page){
		return actualiteRepository.findAll(new PageRequest(page, 5));
	}
	@RequestMapping("/produitsParMC")
	public Page<actualite> getProduits(String mc,int page){
		return actualiteRepository.produitParMC("%"+mc+"%", new PageRequest(page, 5));
	}

}
