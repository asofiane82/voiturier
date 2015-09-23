/**
 *
 */
package com.voiturier.dao;

import com.voiturier.dao.ex.ExceptionDao;
import com.voiturier.entity.IUtilisateurEntity;

/**
 * @author Aston
 *
 */
public interface IUtilisateurDao extends IDAO<IUtilisateurEntity> {

	public abstract IUtilisateurEntity selectLogin(String pLogin) throws ExceptionDao;

}
