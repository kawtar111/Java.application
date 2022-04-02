package com.code.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Article {

	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="NomArticle")
	String NomArticle;
	
	@Column(name="NomAuteur")
	String NomAuteur;
	
	@Column(name="DatePub")
	 Date DatePub; 
	
	
	@Column(name="texte_Article")
	String texte_Article;
	
	@Column(name="photo")
	String photo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomArticle() {
		return NomArticle;
	}
	public void setNomArticle(String nomArticle) {
		NomArticle = nomArticle;
	}
	public String getNomAuteur() {
		return NomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		NomAuteur = nomAuteur;
	}
	public Date getDatePub() {
		return DatePub;
	}
	public void setDatePub(Date datePub) {
		DatePub = datePub;
	}
	public String getTexte_Article() {
		return texte_Article;
	}
	public void setTexte_Article(String texte_Article) {
		this.texte_Article = texte_Article;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
}
