package br.com.unibave.bridge.backend.services;

import br.com.unibave.bridge.backend.dao.UserDao;
import br.com.unibave.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
