package dr.sparky.office.drsparkysoffice.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {

    private UserAccount sender;
    private UserAccount receiver;
    private String message;
    private boolean isRead;
    private LocalDateTime cratedAt;

    public Message(UserAccount sender, UserAccount receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        cratedAt = LocalDateTime.now();
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public LocalDateTime getCratedAt() {
        return cratedAt;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                ", message='" + message + '\'' +
                ", isRead=" + isRead +
                ", cratedAt=" + cratedAt +
                '}';
    }
}
