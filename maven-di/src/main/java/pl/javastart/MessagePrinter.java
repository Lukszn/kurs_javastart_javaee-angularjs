package pl.javastart;

import javax.inject.Inject;

public class MessagePrinter {

    private MessageProducer messageProducer;

    @Inject
    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}