package com.voiturier.entity;

public interface IUtilisateurEntity extends IEntity {

	/**
	 * @return the nom
	 */
	String getNom();

	/**
	 * @param nom
	 *            the nom to set
	 */
	void setNom(String nom);

	/**
	 * @return the prenom
	 */
	String getPrenom();

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	void setPrenom(String prenom);

	/**
	 * @return the email
	 */
	String getEmail();

	/**
	 * @param email
	 *            the email to set
	 */
	void setEmail(String email);

	/**
	 * @return the statut
	 */
	public Integer getStatut();

	/**
	 * @param statut
	 *            the statut to set
	 */
	public void setStatut(Integer statut);

	/**
	 * @return the mdp
	 */
	String getMdp();

	/**
	 * @param mdp
	 *            the mdp to set
	 */
	void setMdp(String mdp);

}