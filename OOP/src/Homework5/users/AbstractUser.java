
package Homework5.users;

import Homework5.AccessRights;

public abstract class AbstractUser {
    String name;
    String password;
    AccessRights AccessRights;

    public AbstractUser(String name, String password, Homework5.AccessRights accessRights) {
        this.name = name;
        this.password = password;
        this.AccessRights = accessRights;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccessRights(AccessRights accessRights) {
        AccessRights = accessRights;
    }

    public String getName() {
        return name;
    }

    public AccessRights getAccessRights() {
        return AccessRights;
    }
}
