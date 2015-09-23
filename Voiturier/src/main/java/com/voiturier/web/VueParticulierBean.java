package com.voiturier.web;

public class VueParticulierBean {
	private String prenom;
	private String nom;
	private String email;
	private String mdp;

	public VueParticulierBean(String prenom, String nom, String email, String mdp) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}
