package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.User;

// TODO: Auto-generated Javadoc
/**
 * Session Bean implementation class Aniba.
 */
@Stateless
public class Aniba implements AnibaRemote, AnibaLocal {
	
	/** The entity manager. */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public Aniba() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see services.AnibaRemote#save(domain.User)
	 */
	@Override
	public boolean save(User user) {
		boolean b = false;
		try {

			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

}
