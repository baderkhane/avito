package org.serviceAvito1.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(unique=true)
	private String login;
	private String password;
	private String Tel;
	private String cin;
	private String prenom;
	private String nom;
	private String verifier;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Client [login=" + login + ", password=" + password + ", Tel=" + Tel + ", cin=" + cin + ", prenom="
				+ prenom + ", nom=" + nom + ", verifier=" + verifier + "]";
	}

	public Client(String login, String password, String tel, String cin, String prenom, String nom, String verifier) {
		super();
		this.login = login;
		this.password = password;
		Tel = tel;
		this.cin = cin;
		this.prenom = prenom;
		this.nom = nom;
		this.verifier = verifier;
	}

	public Client(Long id, String login, String password, String tel, String cin, String prenom, String nom,
			String verifier) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		Tel = tel;
		this.cin = cin;
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

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
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
