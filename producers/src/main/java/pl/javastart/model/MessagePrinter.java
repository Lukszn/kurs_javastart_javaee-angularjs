package pl.javastart.model;

import javax.inject.Inject;

import pl.javastart.qualifiers.Message.MessageType;
import pl.javastart.qualifiers.Message;

public class MessagePrinter {
	
	@Inject @Message(type = MessageType.FILE)
	private MessageProducer messageProducer;
	
	public void printMessage() {
		String message = messageProducer.getMessage();
		System.out.println(message);
	}
}
