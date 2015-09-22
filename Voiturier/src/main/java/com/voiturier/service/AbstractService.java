/**
 *
 */
package com.voiturier.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Aston
 *
 */
public abstract class AbstractService {

	protected Log LOG = LogFactory.getLog(this.getClass());

	public AbstractService() {
		super();
	}

}
