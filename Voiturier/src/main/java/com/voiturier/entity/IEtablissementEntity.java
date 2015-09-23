package com.voiturier.entity;

public interface IEtablissementEntity extends IEntity {

	/**
	 * @return the raisonSociale
	 */
	String getRaisonSociale();

	/**
	 * @param raisonSociale
	 *            the raisonSociale to set
	 */
	void setRaisonSociale(String raisonSociale);

	/**
	 * @return the type
	 */
	String getType();

	/**
	 * @param type
	 *            the type to set
	 */
	void setType(String type);

	/**
	 * @return the telephone
	 */
	String getTelephone();

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	void setTelephone(String telephone);

	/**
	 * @return the siteWeb
	 */
	String getSiteWeb();

	/**
	 * @param siteWeb
	 *            the siteWeb to set
	 */
	void setSiteWeb(String siteWeb);

	/**
	 * @return the contact
	 */
	String getContact();

	/**
	 * @param contact
	 *            the contact to set
	 */
	void setContact(String contact);

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
	 * @return the fonction
	 */
	String getFonction();

	/**
	 * @param fonction
	 *            the fonction to set
	 */
	void setFonction(String fonction);

	/**
	 * @return the mdp
	 */
	String getMdp();

	/**
	 * @param mdp
	 *            the mdp to set
	 */
	void setMdp(String mdp);

	/**
	 * @return the adresse
	 */
	String getAdresse();

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	void setAdresse(String adresse);

	/**
	 * @return the codePostal
	 */
	String getCodePostal();

	/**
	 * @param codePostal
	 *            the codePostal to set
	 */
	void setCodePostal(String codePostal);

	/**
	 * @return the ville
	 */
	String getVille();

	/**
	 * @param ville
	 *            the ville to set
	 */
	void setVille(String ville);

	/**
	 * @return the siret
	 */
	String getSiret();

	/**
	 * @param siret
	 *            the siret to set
	 */
	void setSiret(String siret);

	/**
	 * @return the idService
	 */
	Integer getIdService();

	/**
	 * @param idService
	 *            the idService to set
	 */
	void setIdService(Integer idService);

}