/**
 *
 */
package com.voiturier.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.voiturier.dao.util.AbstractJdbcMapper;
import com.voiturier.entity.IEntity;

/**
 * @author Aston
 *
 */
public abstract class AbstractDao<T extends IEntity> implements Serializable, IDAO<T> {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	protected Log LOG = LogFactory.getLog(this.getClass());

	// @Override
	// public abstract String getTableName();
	//
	// @Override
	// public abstract String getPkName();
	//
	// @Override
	// public abstract String getAllColumnNames();

	public AbstractDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPkName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAllColumnNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T insert(T uneEntite) throws com.voiturier.dao.ex.ExceptionDao {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T uneEntite) throws com.voiturier.dao.ex.ExceptionDao {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T select(Object pUneClef) throws com.voiturier.dao.ex.ExceptionDao {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> selectAll(String pAWhere, String pAnOrderBy) throws com.voiturier.dao.ex.ExceptionDao {
		// TODO Auto-generated method stub
		return null;
	}

	protected abstract AbstractJdbcMapper<T> getMapper();

}
