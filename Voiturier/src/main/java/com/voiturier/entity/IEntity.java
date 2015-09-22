/**
 *
 */
package com.voiturier.entity;

/**
 * @author Aston
 *
 */
public interface IEntity {

	/**
	 * Recupere l'id de l'entité.
	 *
	 * @return l'id du l'entité.
	 */
	public abstract Integer getId();

	/**
	 * Fixe l'id du l'entité.
	 *
	 * @param unId
	 *            l'id du l'entité.
	 */
	public abstract void setId(Integer unId);

}
