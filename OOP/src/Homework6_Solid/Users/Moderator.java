package Homework6_Solid.Users;

public class Moderator extends AbstractUser {
    public Moderator(String name, String password, Homework6_Solid.AccessRights accessRights) {
        super(name, password, accessRights);
    }
}
