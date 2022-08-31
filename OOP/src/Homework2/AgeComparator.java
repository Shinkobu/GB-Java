package Homework2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o2.birthYear, o1.birthYear);
    }
}
