package Task2;

public class ChildBirth extends Tasks {

    @Override
    public int prioritet() {
        return 4;
    }

    @Override
    public long time() {
        return 3;
    }

    @Override
    public String name() {
        return "ChildBirth";
    }
}
