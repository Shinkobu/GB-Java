package Homework6_Solid;


import Homework6_Solid.users.AbstractUser;

import java.util.Scanner;

import static Homework5.Controller.formattedTime;

public class MessageRepository implements Repository<Message, AbstractUser> {

    @Override
    public void enterNewMessage(Message message) {
        Database.putDataToMessagesDB(message);
    }

    @Override
    public void findMessage() {

        System.out.println("Введите выражение для поиска: \n");

        Scanner myScan = new Scanner(System.in);
        String newText = myScan.nextLine();
        int isFound = 0;

        for (Message m : Database.getDatabase()) {
            if (m.text.contains(newText)){
                isFound++;
                if (isFound==1) {
                    System.out.println("Результаты поиска");
                }
                System.out.println(m.toString());
            }

        }
        if (isFound==0){
            System.out.println("Выражение не найдено");
        }
    }

    @Override
    public void editMessage(AbstractUser user) {
        Message messageToEdit = Database.getDatabase().get(Database.getDatabase().size()-1);
        String oldTime = messageToEdit.time;

        if (messageToEdit.author.getName().equals(user.getName()) ||
            user.getAccessRights().equals(AccessRights.READ_WRITE_EDIT) ||
            user.getAccessRights().equals(AccessRights.READ_WRITE_EDIT_DELETE)){

            System.out.println("Сообщение для редактирования: " + messageToEdit.toString());
            System.out.println("Отредактируйте сообщение: \n");

            Scanner myScan = new Scanner(System.in);
            System.out.println(user.getName() + " : ");
            String newText = myScan.nextLine();

            messageToEdit = new Message(newText, oldTime, messageToEdit.author, formattedTime(),user,false);

            Database.editLastMessage(messageToEdit);

        }else {
            System.out.println("Недостаточно прав для редактирования!");
        }
    }

    public void deleteMessage(AbstractUser user) {

        if (user.getAccessRights().equals(AccessRights.READ_WRITE_EDIT_DELETE)){

            System.out.println("Выберите сообщение для удаления по номеру индекса: \n");
            Database.showDBWithIndex();

            Scanner myScan = new Scanner(System.in);
            int index = 0;
            index = Integer.parseInt(myScan.nextLine());

            System.out.println("Будет удалено сообщение, Y?: \n");
            System.out.println(Database.getDatabase().get(index).toString());
            Message tempMessage = Database.getDatabase().get(index);

            String choice2 = myScan.nextLine();
            if (choice2.equals("Y") ||
                choice2.equals("Yes") ||
                choice2.equals("y") ||
                choice2.equals("yes")){

                Database.editMessage(new Message(tempMessage.text,tempMessage.time, tempMessage.author,formattedTime(), user, true),index);
                System.out.println("Сообщение удалено");

            }else {
                System.out.println("Операция не подтверждена");
            }

//
////            System.out.println("Сообщение для редактирования: " + messageToEdit.toString());
//            System.out.println("Отредактируйте сообщение: \n");
//

//
////            messageToEdit = new Message(newText, oldTime, messageToEdit.author,Controller.formattedTime(),user);
//
////            Database.editLastMessage(messageToEdit);
//
//        }else {
//            System.out.println("Недостаточно прав для редактирования!");
//        }
//        Message messageToEdit = Database.getDatabase().get(Database.getDatabase().size()-1);
//        String oldTime = messageToEdit.time;
//
//        if (messageToEdit.author.getName().equals(user.getName()) ||
//                user.getAccessRights().equals(AccessRights.READ_WRITE_EDIT_BAN) ||
//                user.getAccessRights().equals(AccessRights.READ_WRITE_EDIT_BAN_DELETE)){
//
//            System.out.println("Сообщение для редактирования: " + messageToEdit.toString());
//            System.out.println("Отредактируйте сообщение: \n");
//
//            Scanner myScan = new Scanner(System.in);
//            System.out.println(user.getName() + " : ");
//            String newText = myScan.nextLine();
//
//            messageToEdit = new Message(newText, oldTime, messageToEdit.author,Controller.formattedTime(),user);
//
//            Database.editLastMessage(messageToEdit);
//
//        }else {
//            System.out.println("Недостаточно прав для редактирования!");
        }
    }
}

