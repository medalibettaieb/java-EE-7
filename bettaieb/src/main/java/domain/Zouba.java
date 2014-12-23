package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * Entity implementation class for Entity: Zouba.
 */
@Entity
public class Zouba implements Serializable {

	/** The id. */
	private Integer id;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new zouba.
	 */
	public Zouba() {
		super();
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
	public Integer getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

}
