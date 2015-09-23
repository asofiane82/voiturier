/**
 * 
 */
package com.voiturier.entity;

/**
 * @author Aston
 *
 */
public class UtilisateurEntity extends AbstractEntity implements IUtilisateurEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String email;
	private Integer statut;
	private String mdp;

	public UtilisateurEntity() {
	}

	/**
	 * @return the statut
	 */
	@Override
	public Integer getStatut() {
		return statut;
	}

	/**
	 * @param statut
	 *            the statut to set
	 */
	@Override
	public void setStatut(Integer statut) {
		this.statut = statut;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IUtilisateurEntity#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IUtilisateurEntity#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IUtilisateurEntity#getPrenom()
	 */
	@Override
	public String getPrenom() {
		return prenom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IUtilisateurEntity#setPrenom(java.lang.String)
	 */
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IUtilisateurEntity#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IUtilisateurEntity#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IUtilisateurEntity#getMdp()
	 */
	@Override
	public String getMdp() {
		return mdp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IUtilisateurEntity#setMdp(java.lang.String)
	 */
	@Override
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}
