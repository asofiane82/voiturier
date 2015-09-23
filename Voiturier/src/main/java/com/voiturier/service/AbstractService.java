/**
 *
 */
package com.voiturier.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 * @author Aston
 *
 */
@Service
public abstract class AbstractService {

	protected Log LOG = LogFactory.getLog(this.getClass());

	public AbstractService() {
		super();
	}

}
