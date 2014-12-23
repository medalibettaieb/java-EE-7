package services;

import javax.ejb.Remote;

import domain.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface AnibaRemote.
 */
@Remote
public interface AnibaRemote {

/**
 * Save.
 *
 * @param user the user
 * @return true, if successful
 */
boolean save(User user);
}
