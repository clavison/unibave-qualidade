package br.com.unibave.factory.apple.after.factory;

import br.com.unibave.factory.apple.after.model.IPhone;
import br.com.unibave.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
