package Homework6_Solid.Users;

public class Admin extends AbstractUser {
    public Admin(String name, String password, Homework6_Solid.AccessRights accessRights) {
        super(name, password, accessRights);
    }
}
