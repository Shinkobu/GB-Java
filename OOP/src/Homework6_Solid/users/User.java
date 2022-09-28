package Homework6_Solid.users;

public class User extends AbstractUser {
    public User(String name, String password, Homework6_Solid.AccessRights accessRights) {
        super(name, password, accessRights);
    }
}
