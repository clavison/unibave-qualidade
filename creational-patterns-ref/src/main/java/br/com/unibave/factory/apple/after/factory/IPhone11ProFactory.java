package br.com.unibave.factory.apple.after.factory;

import br.com.unibave.factory.apple.after.model.IPhone;
import br.com.unibave.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
