package Seminar6;

import java.util.Iterator;
import java.util.Stack;

public class StackOfShapes<S> {

    Stack<S> stackOfFigures = new Stack<>();


    public void add(S s) {
        stackOfFigures.add(s);
    }


}
