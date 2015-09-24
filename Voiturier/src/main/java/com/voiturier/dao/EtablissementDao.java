/**
 *
 */
package com.voiturier.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.voiturier.dao.ex.ExceptionDao;
import com.voiturier.dao.util.AbstractJdbcMapper;
import com.voiturier.dao.util.EtablissementJdbcMapper;
import com.voiturier.entity.IEtablissementEntity;

/**
 * @author Aston
 *
 */
@Repository
public class EtablissementDao extends AbstractDao<IEtablissementEntity>implements IEtablissementDao {

	public EtablissementDao() {

	}

	@Override
	public String getPkName() {
		return "idEtablissement";
	}

	@Override
	public String getAllColumnNames() {
		return "idEtablissement, raisonSocial, type, numerotelephone, siteweb, contact, email, fonction, motdepasse, adresse, code_postal, ville";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Etablissement";
	}

	@Override
	protected AbstractJdbcMapper<IEtablissementEntity> getMapper() {
		return new EtablissementJdbcMapper();
	}

	@Override
	public IEtablissementEntity select(Object pUneClef) throws ExceptionDao {
		if (pUneClef == null) {
			return null;
		}

		try {
			// ??? requette select par jdbctemplate

			String sql = "select " + this.getAllColumnNames() + " from " + this.getTableName() + " where "
					+ this.getPkName() + "=?;";

			return this.getJdbcTemplate().queryForObject(sql, this.getMapper(), pUneClef);

		} catch (Throwable e) {
			throw new ExceptionDao(e);
		}

	}

	@Override
	public IEtablissementEntity insert(IEtablissementEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}

		try {

			PreparedStatementCreator psc = new PreparedStatementCreator() {
				@Override
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					String sql = "insert into " + EtablissementDao.this.getTableName()
							+ " (raisonSocial, type, numerotelephone, siteweb, contact, email, fonction, motdepasse, adresse, code_postal, ville, Siret, Service_idService) values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
					PreparedStatement ps = connexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
					ps.setString(1, pUneEntite.getRaisonSociale());
					ps.setString(2, pUneEntite.getType());
					ps.setString(3, pUneEntite.getTelephone());
					ps.setString(4, pUneEntite.getSiteWeb());
					ps.setString(5, pUneEntite.getContact());
					ps.setString(6, pUneEntite.getEmail());
					ps.setString(7, pUneEntite.getFonction());
					ps.setString(8, pUneEntite.getMdp());
					ps.setString(9, pUneEntite.getAdresse());
					ps.setString(10, pUneEntite.getCodePostal());
					ps.setString(11, pUneEntite.getVille());
					ps.setString(12, pUneEntite.getSiret());
					ps.setInt(13, pUneEntite.getIdService().intValue());
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
	public IEtablissementEntity update(IEtablissementEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		if (pUneEntite.getId() == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}

		try {

			String sql = "update " + this.getTableName()
					+ " set raisonSocial=?, type=?, numerotelephone=?, siteweb=?, contact=?, email=?, fonction=?, motdepasse=?, adresse=?, code_postal=?, ville=?, Siret=?, Service_idService=? where "
					+ this.getPkName() + "=?;";
			this.getJdbcTemplate().update(sql, pUneEntite.getRaisonSociale(), pUneEntite.getType(),
					pUneEntite.getTelephone(), pUneEntite.getSiteWeb(), pUneEntite.getContact(), pUneEntite.getEmail(),
					pUneEntite.getFonction(), pUneEntite.getMdp(), pUneEntite.getAdresse(), pUneEntite.getCodePostal(),
					pUneEntite.getVille(), pUneEntite.getSiret(), pUneEntite.getIdService().intValue(),
					pUneEntite.getId().intValue());

		} catch (Throwable e) {
			throw new ExceptionDao(e);
		}
		return pUneEntite;
	}
}
