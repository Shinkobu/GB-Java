package Seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusList<T> {

    private Object[] array;
    private int index;

    public PlusList(int size) {
        array = new Object[size];
    }

    public PlusList() {
        this(10);
    }

    public void plusAdd(T value) {
        array[index] = value;
        index++;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < this.index; i++) {
            if (i == this.index-1){
                str += " " + array[i] + "]";
            }else {
                str += " " + array[i] + ",";
            }
        }
        return str;

    }

    public T getByIndex(int i) {
        return (T) array[i];
    }

    public void removeByIndex(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        this.index--;
    }

    public void removeByElement(T value){
        boolean isFound = false;
        int i = 0;
        while (!isFound && i < array.length-1){
            if(array[i] == value){
                isFound = true;
                removeByIndex(i);
            }
            i++;
        }








    }
}


