package org.serviceAvito1.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany; 
@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(unique=true)
	private String login;
	private String password;
	private String tel; 
	private String prenom;
	private String nom;
	private String verifier;
	
	@Override
	public String toString() {
		return "Client [login=" + login + ", password=" + password + ", Tel=" + tel + ", prenom="
				+ prenom + ", nom=" + nom + ", verifier=" + verifier + "]";
	}	
	@OneToMany(mappedBy="clt",fetch=FetchType.LAZY)
	private Collection<Annonce> annonce;
	
	public Client() {
		super();
	}
	
	public Client( String tel,String prenom, String nom, String verifier ,String login,String password) {
		super(); 
		this.tel = tel;
		this.login = login;
		this.password = password; 
		this.prenom = prenom;
		this.nom = nom;
		this.verifier = verifier;
	}
 

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	public void setTel(String tel) {
		this.tel = tel; 
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVerifier() {
		return verifier;
	}
	public void setVerifier(String verifier) {
		this.verifier = verifier;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
 	
}
