package br.com.unibave.factory.app.dbadapter.after.factory;

import br.com.unibave.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
