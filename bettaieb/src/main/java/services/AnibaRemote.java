package services;

import javax.ejb.Remote;

import domain.User;

@Remote
public interface AnibaRemote {
boolean save(User user);
}
