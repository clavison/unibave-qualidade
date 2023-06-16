package br.com.unibave.mediator.translate;

import br.com.unibave.mediator.translate.mediator.ChatMediator;
import br.com.unibave.mediator.translate.mediator.Mediator;
import br.com.unibave.mediator.translate.mediator.TranslatorMediator;
import br.com.unibave.mediator.translate.model.EnglishUser;
import br.com.unibave.mediator.translate.model.PortugueseUser;
import br.com.unibave.mediator.translate.model.User;

public class Client {

	public static void main(String[] args) {
		 //Mediator chatRoom = new ChatMediator();
		Mediator chatRoom = new TranslatorMediator();
		
		User alan = new EnglishUser("Alan", chatRoom);
		User jose = new PortugueseUser("Jose", chatRoom);
		User sue = new EnglishUser("Sue", chatRoom);
		User maria = new PortugueseUser("Maria", chatRoom);
		
		chatRoom.addUser(alan);
		chatRoom.addUser(sue);
		chatRoom.addUser(maria);
		
		alan.sendMessage("Hello");
		maria.sendMessage("Oi", alan);
		
		chatRoom.removeUser(sue);
		
		alan.sendMessage("How are you?", maria);
		maria.sendMessage("Estou bem, obrigado.", alan);
		
		chatRoom.addUser(jose);
		
		jose.sendMessage("Oi");
		
		chatRoom.removeUser(maria);
	}
	
}