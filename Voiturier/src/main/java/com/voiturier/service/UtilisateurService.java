/**
 *
 */
package com.voiturier.service;

import com.voiturier.dao.IUtilisateurDao;
import com.voiturier.dao.IUtilisateurDao;
import com.voiturier.dao.IUtilisateurDao;
import com.voiturier.dao.ex.ExceptionDao;
import com.voiturier.entity.IUtilisateurEntity;
import com.voiturier.entity.UtilisateurEntity;
import com.voiturier.service.ex.AuthentificationException;
import com.voiturier.service.ex.ErreurTechniqueException;
import com.voiturier.service.ex.UtilisateurInconnuException;
import com.voiturier.web.VueParticulierBean;

/**
 * @author Aston
 *
 */
public class UtilisateurService extends AbstractService implements IUtilisateurService {
	private IUtilisateurDao UtilisateurDao;

	public UtilisateurService() {
		super();
	}

	public IUtilisateurDao getUtilisateurDao() {
		return this.UtilisateurDao;
	}

	public void setUtilisateurDao(IUtilisateurDao utilisateurDao) {
		this.UtilisateurDao = utilisateurDao;
	}

	public void inscription(VueParticulierBean V)

	throws NullPointerException, com.voiturier.service.ex.ErreurTechniqueException {

		if (V.getNom() == null) {
			throw new NullPointerException("");
		}
		if (V.getPrenom() == null) {
			throw new NullPointerException("");
		}
		if (V.getEmail() == null) {
			throw new NullPointerException("");
		}
		if (V.getMdp() == null) {
			throw new NullPointerException("");
		}
		com.voiturier.entity.IUtilisateurEntity resultat = new UtilisateurEntity();
		resultat.setNom(V.getNom());
		resultat.setPrenom(V.getPrenom());
		resultat.setEmail(V.getEmail());
		resultat.setMdp(V.getMdp());

		try {
			resultat = this.getUtilisateurDao().insert(resultat);
		} catch (ExceptionDao e) {
			throw new ErreurTechniqueException(e);
		}

	}

	@Override
	public IUtilisateurEntity mdpoublier(String Email) throws AuthentificationException, ErreurTechniqueException {
		if ((Email == null) || (Email.trim().length() == 0)) {
			throw new NullPointerException("email");
		}

		IUtilisateurEntity resultat = null;
		try {
			// resultat = this.utilisateurDAO.selectLogin(pLogin, null);
			resultat = this.UtilisateurDao.selectEmail(Email);

		} catch (ExceptionDao e) {
			throw new ErreurTechniqueException(e);
		}
		if (resultat == null) {
			throw new UtilisateurInconnuException();
		}

		return resultat;
	}
}
