package Homework6_Solid.users;

public class Admin extends AbstractUser {
    public Admin(String name, String password, Homework6_Solid.AccessRights accessRights) {
        super(name, password, accessRights);
    }
}
