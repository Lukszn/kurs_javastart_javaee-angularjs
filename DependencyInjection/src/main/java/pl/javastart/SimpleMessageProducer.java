package pl.javastart;



import pl.javastart.Message.MessageType;


@Message(type = MessageType.FILE)
public class SimpleMessageProducer implements MessageProducer {

	@Override
	public String getMessage()  {
		return "Example message " + System.currentTimeMillis();
	}
}