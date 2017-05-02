package Task_02_1;

import java.util.Arrays;

public class ArrayHolder {
    private int array[];
    public ArrayHolder(int[] a){
        this.array = a;
    }
    public void sortArray(){
        Arrays.sort(array);
    }
    public String search (int value){
        String index = "";
        for (int i = 0; i < array.length; ++i){
            if (array[i] == value) index = index + i + " ";
        }
        return index;
    }
    public int[] get(){
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
