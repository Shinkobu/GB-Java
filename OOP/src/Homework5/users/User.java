package Homework5.users;

import Homework5.AccessRights;
import Homework5.users.AbstractUser;

public class User extends AbstractUser {
    public User(String name, String password, Homework5.AccessRights accessRights) {
        super(name, password, accessRights);
    }
}
