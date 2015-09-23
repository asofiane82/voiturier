/**
 * 
 */
package com.voiturier.entity;

/**
 * @author Aston
 *
 */
public class EtablissementEntity extends AbstractEntity implements IEtablissementEntity {

	private static final long serialVersionUID = 1L;
	private String raisonSociale;
	private String type;
	private String telephone;
	private String siteWeb;
	private String contact;
	private String email;
	private String fonction;
	private String mdp;
	private String adresse;
	private String codePostal;
	private String ville;
	private String siret;
	private Integer idService;

	public EtablissementEntity() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getRaisonSociale()
	 */
	@Override
	public String getRaisonSociale() {
		return raisonSociale;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.voiturier.entity.IEtablissementEntity#setRaisonSociale(java.lang.
	 * String)
	 */
	@Override
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getType()
	 */
	@Override
	public String getType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#setType(java.lang.String)
	 */
	@Override
	public void setType(String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getTelephone()
	 */
	@Override
	public String getTelephone() {
		return telephone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.voiturier.entity.IEtablissementEntity#setTelephone(java.lang.String)
	 */
	@Override
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getSiteWeb()
	 */
	@Override
	public String getSiteWeb() {
		return siteWeb;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.voiturier.entity.IEtablissementEntity#setSiteWeb(java.lang.String)
	 */
	@Override
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getContact()
	 */
	@Override
	public String getContact() {
		return contact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.voiturier.entity.IEtablissementEntity#setContact(java.lang.String)
	 */
	@Override
	public void setContact(String contact) {
		this.contact = contact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getFonction()
	 */
	@Override
	public String getFonction() {
		return fonction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.voiturier.entity.IEtablissementEntity#setFonction(java.lang.String)
	 */
	@Override
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getMdp()
	 */
	@Override
	public String getMdp() {
		return mdp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#setMdp(java.lang.String)
	 */
	@Override
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getAdresse()
	 */
	@Override
	public String getAdresse() {
		return adresse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.voiturier.entity.IEtablissementEntity#setAdresse(java.lang.String)
	 */
	@Override
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getCodePostal()
	 */
	@Override
	public String getCodePostal() {
		return codePostal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.voiturier.entity.IEtablissementEntity#setCodePostal(java.lang.String)
	 */
	@Override
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getVille()
	 */
	@Override
	public String getVille() {
		return ville;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#setVille(java.lang.String)
	 */
	@Override
	public void setVille(String ville) {
		this.ville = ville;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getSiret()
	 */
	@Override
	public String getSiret() {
		return siret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#setSiret(java.lang.String)
	 */
	@Override
	public void setSiret(String siret) {
		this.siret = siret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.voiturier.entity.IEtablissementEntity#getIdService()
	 */
	@Override
	public Integer getIdService() {
		return idService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.voiturier.entity.IEtablissementEntity#setIdService(java.lang.Integer)
	 */
	@Override
	public void setIdService(Integer idService) {
		this.idService = idService;
	}

}
