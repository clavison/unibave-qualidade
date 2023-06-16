package br.com.unibave.abstractfactory.apple.factory.abstractFactory;

import br.com.unibave.abstractfactory.apple.model.certificate.Certificate;
import br.com.unibave.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
