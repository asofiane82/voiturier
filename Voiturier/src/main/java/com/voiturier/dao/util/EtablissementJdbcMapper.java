/**
 *
 */
package com.voiturier.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.voiturier.entity.IEtablissementEntity;

/**
 * @author Aston
 *
 */
public class EtablissementJdbcMapper extends AbstractJdbcMapper<IEtablissementEntity> {

	/**
	 *
	 */
	public EtablissementJdbcMapper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IEtablissementEntity mapRow(ResultSet rs, int id) throws SQLException {
		IEtablissementEntity result = null;
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
