package dr.sparky.office.drsparkysoffice.model;

public class Message {

    private String contact;
    private String lastMessage;
    private String date;

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
}
