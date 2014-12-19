package domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Zouba
 *
 */
@Entity

public class Zouba implements Serializable {

	
	private Integer id;
	private static final long serialVersionUID = 1L;

	public Zouba() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
   
}
