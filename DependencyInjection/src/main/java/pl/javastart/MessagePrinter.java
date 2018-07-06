package pl.javastart;

import javax.inject.Inject;

public class MessagePrinter {
	
	@Inject @FileMessage
	private MessageProducer messageProducer;
	
	public void printMessage() {
		String message = messageProducer.getMessage();
		System.out.println(message);
	}
}
