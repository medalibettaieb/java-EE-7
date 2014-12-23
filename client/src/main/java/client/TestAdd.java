package client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import domain.User;
import services.AnibaRemote;

// TODO: Auto-generated Javadoc
/**
 * The Class TestAdd.
 */
public class TestAdd {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws NamingException the naming exception
	 */
	public static void main(String[] args) throws NamingException {
		Context  context=new InitialContext();
		AnibaRemote anibaRemote = (AnibaRemote) context
				.lookup("/bettaieb/Aniba!services.AnibaRemote");

		User user=new User();
		anibaRemote.save(user);
	}

}
