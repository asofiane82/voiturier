/**
 *
 */
package com.voiturier.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.voiturier.entity.IUtilisateurEntity;

/**
 * @author Aston
 *
 */
public class UtilisateurJdbcMapper extends AbstractJdbcMapper<IUtilisateurEntity> {

	/**
	 *
	 */
	public UtilisateurJdbcMapper() {

	}

	// @Override
	@Override
	public IUtilisateurEntity mapRow(ResultSet rs, int id) throws SQLException {
		IUtilisateurEntity result = null;
		// new UtilisateurEntity();
		// result.setId(Integer.valueOf(rs.getInt("id")));
		// result.setNom(rs.getString("nom"));
		// result.setPrenom(rs.getString("prenom"));
		// result.setLogin(rs.getString("login"));
		// result.setPassword(rs.getString("password"));
		// result.setSex(Byte.valueOf(rs.getByte("sex")));
		// result.setDerniereConnection(rs.getTimestamp("derniereConnection"));
		return result;
	}

}
