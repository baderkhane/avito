package org.serviceAvito1.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class actualite implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String datea;
	private String titre;
	private String auteur;
	private String htmlcode;
	private String image;
	public actualite(Long id, String datea, String titre, String auteur, String htmlcode, String image) {
		super();
		this.id = id;
		this.datea = datea;
		this.titre = titre;
		this.auteur = auteur;
		this.htmlcode = htmlcode;
		this.image = image;
	}
	public actualite(String datea, String titre, String auteur, String htmlcode, String image) {
		super();
		this.datea = datea;
		this.titre = titre;
		this.auteur = auteur;
		this.htmlcode = htmlcode;
		this.image = image;
	}
	public actualite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getHtmlcode() {
		return htmlcode;
	}
	public void setHtmlcode(String htmlcode) {
		this.htmlcode = htmlcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

}
