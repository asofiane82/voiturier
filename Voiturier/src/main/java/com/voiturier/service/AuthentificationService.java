/**
 *
 */
package com.voiturier.service;

import com.voiturier.dao.IUtilisateurDao;
import com.voiturier.dao.ex.ExceptionDao;
import com.voiturier.entity.IUtilisateurEntity;
import com.voiturier.service.ex.AuthentificationException;
import com.voiturier.service.ex.ErreurTechniqueException;
import com.voiturier.service.ex.MauvaisMotdepasseException;
import com.voiturier.service.ex.UtilisateurInconnuException;

/**
 * @author Aston
 *
 */
public class AuthentificationService extends AbstractService implements IAuthentificationService {
	private IUtilisateurDao utilisateurDAO;

	/**
	 *
	 */
	public AuthentificationService() {
		// TODO Auto-generated constructor stub
	}

	public IUtilisateurDao getUtilisateurDAO() {
		return this.utilisateurDAO;
	}

	public void setUtilisateurDAO(IUtilisateurDao utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}

	public IUtilisateurEntity authentifier(String anEmail, String pPassword)
			throws AuthentificationException, ErreurTechniqueException {
		if ((anEmail == null) || (anEmail.trim().length() == 0)) {
			throw new NullPointerException("email");
		}
		if ((pPassword == null) || (pPassword.trim().length() == 0)) {
			throw new NullPointerException("password");
		}
		IUtilisateurEntity resultat = null;
		try {
			// resultat = this.utilisateurDAO.selectLogin(pLogin, null);
			resultat = this.utilisateurDAO.selectEmail(anEmail);
		} catch (ExceptionDao e) {
			throw new ErreurTechniqueException(e);
		}
		if (resultat == null) {
			throw new UtilisateurInconnuException();
		}
		if (!pPassword.equals(resultat.getMdp())) {
			throw new MauvaisMotdepasseException();
		}

		return resultat;
	}

}
