package Homework4;

public class Description {

    String description;

    public Description(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
