/**
 *
 */
package com.voiturier.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.voiturier.dao.ex.ExceptionDao;
import com.voiturier.dao.util.AbstractJdbcMapper;
import com.voiturier.dao.util.UtilisateurJdbcMapper;
import com.voiturier.entity.IUtilisateurEntity;

/**
 * @author Aston
 *
 */
@Repository
public class UtilisateurDao extends AbstractDao<IUtilisateurEntity>implements IUtilisateurDao {

	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public UtilisateurDao() {

		super();
	}

	@Override
	public String getTableName() {
		return "utilisateur";
	}

	@Override
	public String getPkName() {
		return "id";
	}

	@Override
	public String getAllColumnNames() {
		return "id,nom,prenom,email,statut,motdepasse";
	}

	protected AbstractJdbcMapper<IUtilisateurEntity> getMapper1() {
		return new UtilisateurJdbcMapper();
	}

	@Override
	public IUtilisateurEntity insert(final IUtilisateurEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		try {
			PreparedStatementCreator psc = new PreparedStatementCreator() {
				@Override
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					PreparedStatement ps = connexion.prepareStatement(
							"insert into " + UtilisateurDao.this.getTableName()
									+ " (nom,prenom,email,statut,Mdp) values (?,?,?,?,?);",
							Statement.RETURN_GENERATED_KEYS);
					ps.setString(1, pUneEntite.getNom());
					ps.setString(2, pUneEntite.getPrenom());
					ps.setString(3, pUneEntite.getEmail());
					ps.setInt(4, pUneEntite.getStatut());

					ps.setString(5, pUneEntite.getMdp());

					return ps;
				}
			};
			KeyHolder kh = new GeneratedKeyHolder();
			this.getJdbcTemplate().update(psc, kh);
			pUneEntite.setId(Integer.valueOf(kh.getKey().intValue()));
		} catch (Throwable e) {
			throw new ExceptionDao(e);
		}

		return pUneEntite;
	}

	@Override
	public IUtilisateurEntity select(Object unId) throws ExceptionDao {

		if (unId == null) {
			return null;
		}
		IUtilisateurEntity result = null;

		try {
			if (unId instanceof Number) {
				result = this.getJdbcTemplate().queryForObject("select " + this.getAllColumnNames() + " from "
						+ this.getTableName() + " where " + this.getPkName() + "=?;", this.getMapper(),
						((Number) unId).intValue());
			} else {
				result = this.getJdbcTemplate().queryForObject(
						"select " + this.getAllColumnNames() + " from " + this.getTableName() + " where "
								+ this.getPkName() + "=?;",
						this.getMapper(), Integer.valueOf(unId.toString()).intValue());
			}

		} catch (Throwable e) {
			throw new ExceptionDao(e);
		}

		return result;
	}

	@Override
	public IUtilisateurEntity update(IUtilisateurEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		if (pUneEntite.getId() == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}
		boolean doCommit = false;

		PreparedStatement ps = null;
		return pUneEntite;
	}

	@Override
	public IUtilisateurEntity selectEmail(String pemail) throws ExceptionDao {
		List<IUtilisateurEntity> allLogin = this.selectAll("login='" + pemail + "'", null);
		if ((allLogin == null) || allLogin.isEmpty()) {
			return null;
		}
		// On retourne le premier
		return allLogin.iterator().next();
	}

	@Override
	protected AbstractJdbcMapper<IUtilisateurEntity> getMapper() {
		return new UtilisateurJdbcMapper();
	}

}
