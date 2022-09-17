package Homework5;


public class MessageRepository implements Repository<Message> {

    @Override
    public void enterNewMessage(Message message) {
        Database.putData(message);
    }

    @Override
    public Message findMessage(String string) {
        return null;
    }

    @Override
    public void updateMessage(Message message) {

    }
}

