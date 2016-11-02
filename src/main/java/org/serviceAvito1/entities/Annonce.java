package org.serviceAvito1.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

 
@Entity
public class Annonce implements Serializable {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long idAnonce;
	    private String titre;
		private String description;
		private String prix;
		private String qrcode;
		private String achteur;
		private String nbvue;
		
		@ManyToOne
		@JoinColumn(name="ID_Client")
		private Client clt;
		
		
		public Annonce() {
			super();
		}
		
		public String getTitre() {
			return titre;
		}
		
		public Annonce(String titre, String description, String prix, String qrcode, String achteur, String nbvue) {
			super();
			this.titre = titre;
			this.description = description;
			this.prix = prix;
			this.qrcode = qrcode;
			this.achteur = achteur;
			this.nbvue = nbvue;
		}

		public void setTitre(String titre) {
			this.titre = titre;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPrix() {
			return prix;
		}
		public void setPrix(String prix) {
			this.prix = prix;
		}
		public String getQrcode() {
			return this.qrcode;
		}
		public void setQrcode(String qrcode) {
			this.qrcode = qrcode;
		}
		public String getAchteur() {
			return this.achteur;
		}
		public void setAchteur(String achteur) {
			this.achteur = achteur;
		}
		public String getNbvue() {
			return nbvue;
		}
		public void setNbvue(String nbvue) {
			this.nbvue = nbvue;
		}

}
