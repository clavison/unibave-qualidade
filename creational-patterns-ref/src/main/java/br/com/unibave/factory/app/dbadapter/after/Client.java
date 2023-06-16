package br.com.unibave.factory.app.dbadapter.after;

import br.com.unibave.factory.app.dbadapter.after.db.DB;
import br.com.unibave.factory.app.dbadapter.after.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB db = new PostgresFactory().getDatabase();
		//DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
