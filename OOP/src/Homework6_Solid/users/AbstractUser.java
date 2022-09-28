
package Homework6_Solid.users;

public abstract class AbstractUser {
    String name;
    String password;
    Homework6_Solid.AccessRights AccessRights;

    public AbstractUser(String name, String password, Homework6_Solid.AccessRights accessRights) {
        this.name = name;
        this.password = password;
        this.AccessRights = accessRights;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccessRights(Homework6_Solid.AccessRights accessRights) {
        AccessRights = accessRights;
    }

    public String getName() {
        return name;
    }

    public Homework6_Solid.AccessRights getAccessRights() {
        return AccessRights;
    }
}
