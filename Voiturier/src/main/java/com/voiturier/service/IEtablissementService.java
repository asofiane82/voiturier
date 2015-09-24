/**
 *
 */
package com.voiturier.service;

import com.voiturier.service.ex.ErreurTechniqueException;

/**
 * @author Aston
 *
 */

public interface IEtablissementService {

	public void inscription(VueEtablissement ve) throws NullPointerException, ErreurTechniqueException;

}
