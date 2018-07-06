package pl.javastart.model;



import javax.enterprise.inject.Any;

import pl.javastart.qualifiers.Message.MessageType;
import pl.javastart.qualifiers.Message;

@Any
@Message(type = MessageType.FILE)
public class SimpleMessageProducer implements MessageProducer {

	@Override
	public String getMessage()  {
		return "Example message " + System.currentTimeMillis();
	}
}