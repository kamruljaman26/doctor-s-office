package dr.sparky.office.drsparkysoffice.model;

import java.io.Serializable;

public class Message implements Serializable {

    private String contact;
    private String lastMessage;
    private String date;
    private boolean isRead;

    public Message(String contact, String lastMessage, String date) {
        this.contact = contact;
        this.lastMessage = lastMessage;
        this.date = date;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "contact='" + contact + '\'' +
                ", lastMessage='" + lastMessage + '\'' +
                ", date='" + date + '\'' +
                ", isRead=" + isRead +
                '}';
    }
}
