package Homework6_Solid.Users;

public class User extends AbstractUser {
    public User(String name, String password, Homework6_Solid.AccessRights accessRights) {
        super(name, password, accessRights);
    }
}
