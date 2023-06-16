package br.com.unibave.factory.apple.after.factory;

import br.com.unibave.factory.apple.after.model.IPhone;
import br.com.unibave.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
