package Task_01_2;

import java.util.Arrays;

public class FiveNumbers {

    private int arrayOfFive[] = new int[5];

    public FiveNumbers(int[] array){
        arrayOfFive = array;
    }

    public String GetSortedNumbers(){
        int[] copyArray;
        copyArray = arrayOfFive.clone();
        Arrays.sort(copyArray);
        String ArrayInString = Arrays.toString(copyArray);
        return ArrayInString.substring(1,ArrayInString.length()-1);
    }

    public String GetInitialNumbers(){
        String ArrayInString = Arrays.toString(arrayOfFive) ;
        return ArrayInString.substring(1,ArrayInString.length()-1);
    }


}

