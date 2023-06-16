package br.com.unibave.bridge.backend;

import br.com.unibave.bridge.backend.dao.UserMongoDao;
import br.com.unibave.bridge.backend.dao.UserMysqlDao;
import br.com.unibave.bridge.backend.dao.UserOracleDao;
import br.com.unibave.bridge.backend.dao.UserPostgresDao;
import br.com.unibave.bridge.backend.model.User;
import br.com.unibave.bridge.backend.services.UserEJB;
import br.com.unibave.bridge.backend.services.UserRest;
import br.com.unibave.bridge.backend.services.UserService;
import br.com.unibave.bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
