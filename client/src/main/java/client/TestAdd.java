package client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import domain.User;
import services.AnibaRemote;

public class TestAdd {

	public static void main(String[] args) throws NamingException {
		Context  context=new InitialContext();
		AnibaRemote anibaRemote = (AnibaRemote) context
				.lookup("/bettaieb/Aniba!services.AnibaRemote");

		User user=new User();
		anibaRemote.save(user);
	}

}
