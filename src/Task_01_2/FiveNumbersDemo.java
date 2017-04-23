package Task_01_2;

import java.util.Scanner;

public class FiveNumbersDemo {

    public static void main(String[] args) {
        int[] putNumbers = new int[5];
        for (int i = 0; i < 5 ; ++i ){
            System.out.println("Enter number " + (i + 1) + ":");
            Scanner in = new Scanner(System.in);
            if(in.hasNextInt()){
                putNumbers[i] = in.nextInt();
            }
            else {
                System.out.println("Only integers");
                i-=1;
            }
        }
        FiveNumbers dataOfUser = new FiveNumbers(putNumbers);
        System.out.println("Initial array: " + dataOfUser.GetInitialNumbers());
        System.out.println("Sorted array: " + dataOfUser.GetSortedNumbers());

    }
}
