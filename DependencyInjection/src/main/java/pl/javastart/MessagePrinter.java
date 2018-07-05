package pl.javastart;

public class MessagePrinter {
	
private MessageProducer messageProducer = new SimpleMessageProducer();
	
	public void printMessage() {
		String message = messageProducer.getMessage();
		System.out.println(message);
	}

}
