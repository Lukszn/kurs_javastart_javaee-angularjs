package pl.javastart;

import javax.inject.Inject;

import pl.javastart.Message.MessageType;

public class MessagePrinter {
	
	@Inject @Message(type = MessageType.FILE)
	private MessageProducer messageProducer;
	
	public void printMessage() {
		String message = messageProducer.getMessage();
		System.out.println(message);
	}
}
