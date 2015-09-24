/**
 *
 */
package com.voiturier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voiturier.dao.IEtablissementDao;
import com.voiturier.dao.ex.ExceptionDao;
import com.voiturier.entity.EtablissementEntity;
import com.voiturier.entity.IEtablissementEntity;
import com.voiturier.service.ex.ErreurTechniqueException;

/**
 * @author Aston
 *
 */
@Service
public class EtablissementService extends AbstractService implements IEtablissementService {

	/**
	 *
	 */
	@Autowired
	private IEtablissementDao etablissementDao;

	public EtablissementService() {
		// TODO Auto-generated constructor stub
	}

	public IEtablissementDao getEtablissementDao() {
		return this.etablissementDao;
	}

	public void setEtablissementDao(IEtablissementDao etablissementDao) {
		this.etablissementDao = etablissementDao;
	}

	@Override
	public void inscription(VueEtablissement ve) throws NullPointerException, ErreurTechniqueException {

		if (ve.getRaisonSocial() == null) {
			throw new NullPointerException("RaisonSocial");
		}
		if (ve.getType() == null) {
			throw new NullPointerException("Type");
		}

		if (ve.getNumerotelephone() == null) {
			throw new NullPointerException("numerotelephone");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("siteweb");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("contact");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("email");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("fonction");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("motdepasse");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("adresse");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("code_postal");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("ville");
		}

		if (ve.getType() == null) {
			throw new NullPointerException("Siret");
		}

		IEtablissementEntity resultat = new EtablissementEntity();
		resultat.setRaisonSociale(ve.getRaisonSocial());
		resultat.setType(ve.getType());
		resultat.setTelephone(ve.getNumerotelephone());
		resultat.setAdresse(ve.getAdresse());
		resultat.setSiteWeb(ve.getSiteweb());
		resultat.setContact(ve.getContact());
		resultat.setEmail(ve.getEmail());
		resultat.setFonction(ve.getFonction());
		resultat.setMdp(ve.getMotdepasse());
		resultat.setAdresse(ve.getAdresse());
		resultat.setCodePostal(ve.getCode_postal());
		resultat.setVille(ve.getVille());
		resultat.setSiret(ve.getSiret());
		resultat.setIdService(ve.getService_idService());

		try {
			resultat = this.getEtablissementDao().insert(resultat);
		} catch (ExceptionDao e) {
			throw new ErreurTechniqueException(e);
		}
	}

}
