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
public interface IUtilisateurService {
	public abstract IUtilisateurEntity mdpoublier(String email)
			throws AuthentificationException, ErreurTechniqueException;

}
