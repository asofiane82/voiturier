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
	 * Recupere l'id de l'entit�.
	 *
	 * @return l'id du l'entit�.
	 */
	public abstract Integer getId();

	/**
	 * Fixe l'id du l'entit�.
	 *
	 * @param unId
	 *            l'id du l'entit�.
	 */
	public abstract void setId(Integer unId);

}
