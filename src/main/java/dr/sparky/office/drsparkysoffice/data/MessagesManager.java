package dr.sparky.office.drsparkysoffice.data;

import dr.sparky.office.drsparkysoffice.model.Message;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagesManager {

    private static final String MESSAGES_FILE = "database/messages.bin";
    private Map<String, List<Message>> messagesMap;

    public MessagesManager() {
        loadMessages();
    }

    private void loadMessages() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(MESSAGES_FILE))) {
            messagesMap = (Map<String, List<Message>>) ois.readObject();
        } catch (FileNotFoundException e) {
            messagesMap = new HashMap<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Failed to load messages", e);
        }
    }

    public void saveMessages() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(MESSAGES_FILE))) {
            oos.writeObject(messagesMap);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save messages", e);
        }
    }

    public void sendMessage(String receiverUsername, Message message) {
        List<Message> userMessages = messagesMap.getOrDefault(receiverUsername, new ArrayList<>());
        userMessages.add(message);
        messagesMap.put(receiverUsername, userMessages);
        saveMessages();
    }

    public List<Message> getMessages(String username) {
        return messagesMap.getOrDefault(username, new ArrayList<>());
    }

    public boolean markAsRead(String username, int messageIndex) {
        List<Message> userMessages = messagesMap.getOrDefault(username, new ArrayList<>());
        if (messageIndex >= 0 && messageIndex < userMessages.size()) {
            userMessages.get(messageIndex).setRead(true);
            saveMessages();
            return true;
        }
        return false;
    }

    public boolean deleteMessage(String username, int messageIndex) {
        List<Message> userMessages = messagesMap.getOrDefault(username, new ArrayList<>());
        if (messageIndex >= 0 && messageIndex < userMessages.size()) {
            userMessages.remove(messageIndex);
            saveMessages();
            return true;
        }
        return false;
    }
}

