package pl.javastart.beans;

public class MessageBean {
    
    private String message;
    
    public MessageBean() {
        long currentTime = System.currentTimeMillis();
        message = "MessageBean " + currentTime;
    }
    
    public String getMessage() {
        return message;
    }
}