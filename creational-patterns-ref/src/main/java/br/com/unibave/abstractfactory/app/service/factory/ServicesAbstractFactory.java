package br.com.unibave.abstractfactory.app.service.factory;

import br.com.unibave.abstractfactory.app.service.services.CarService;
import br.com.unibave.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
