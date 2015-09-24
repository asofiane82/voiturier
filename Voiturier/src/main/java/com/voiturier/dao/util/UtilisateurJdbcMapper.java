/**
 *
 */
package com.voiturier.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.voiturier.entity.IUtilisateurEntity;
import com.voiturier.entity.UtilisateurEntity;

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
		IUtilisateurEntity result = new UtilisateurEntity();
		result.setId(Integer.valueOf(rs.getInt("idUtilisateur")));
		result.setNom(rs.getString("nom"));
		result.setPrenom(rs.getString("prenom"));
		result.setEmail(rs.getString("email"));
		result.setMdp(rs.getString("motdepasse"));
		result.setStatut(rs.getInt("statut"));
		return result;
	}

}
