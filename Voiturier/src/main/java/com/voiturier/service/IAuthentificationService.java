/**
 *
 */
package com.voiturier.service;

import com.voiturier.entity.IUtilisateurEntity;
import com.voiturier.service.ex.AuthentificationException;
import com.voiturier.service.ex.ErreurTechniqueException;

/**
 * @author Aston
 *
 */
public interface IAuthentificationService {
	/**
	 * Authentifie un utilisateur.
	 *
	 * @param pLogin
	 *            le login
	 * @param pPassword
	 *            le password
	 * @return l'utilisateur authentifie, leve une exception sinon
	 * @throws AuthentificationException
	 *             si un probleme survient
	 * @throws ErreurTechniqueException
	 *             si un probleme survient
	 * @throws NullPointerException
	 *             avec comme message le nom du parametre null
	 */
	public abstract IUtilisateurEntity authentifier(String pLogin, String pPassword)
			throws AuthentificationException, ErreurTechniqueException;

}
