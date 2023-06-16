package br.com.unibave.mediator.translate.mediator;

import br.com.unibave.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
