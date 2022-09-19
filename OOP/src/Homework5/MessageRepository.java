package Homework5;


import Homework5.users.AbstractUser;
import Homework5.users.User;
import com.sun.source.tree.IfTree;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MessageRepository implements Repository<Message, AbstractUser> {

    @Override
    public void enterNewMessage(Message message) {
        Database.putData(message);
    }

    @Override
    public Message findMessage(String string) {
        return null;
    }

    @Override
    public void editMessage(AbstractUser user) {
        Message messageToEdit = Database.getDatabase().get(Database.getDatabase().size()-1);
        System.out.println(messageToEdit);

        if (messageToEdit.author.getName().equals(user.getName()) ||
            messageToEdit.author.getAccessRights().equals(AccessRights.READ_WRITE_BAN)){

            System.out.println("��������� ��� ��������������: " + messageToEdit.toString());
            System.out.println("�������������� ���������: \n");

            Scanner myScan = new Scanner(System.in);
            System.out.println(user.getName() + " : ");
            String currentText = myScan.nextLine();
            messageToEdit = new Message(currentText, LocalDateTime.now(),user);

            Database.getDatabase().get(Database.getDatabase().size()-1);


        }else {
            System.out.println("������������ ���� ��� ��������������!");
        }



    }
}

