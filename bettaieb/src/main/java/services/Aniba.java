package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.User;

/**
 * Session Bean implementation class Aniba
 */
@Stateless
public class Aniba implements AnibaRemote, AnibaLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public Aniba() {
		// TODO Auto-generated constructor stub
	}

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
