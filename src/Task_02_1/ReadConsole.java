package Task_02_1;

import java.util.Scanner;

public  class ReadConsole {

    public static int[] readArrayInt() {
        System.out.print("Enter the length of array: ");
        Scanner in = new Scanner(System.in);
        int[] inputArray = new int[in.nextInt()];
        if (inputArray.length == 0){
            System.out.println("Only integers");
            ReadConsole.readArrayInt();
        }
        System.out.print("Enter array: ");
        in = new Scanner(System.in);
        for (int i = 0; i < inputArray.length; ++i) {
            if (in.hasNextInt()) {
                inputArray[i] = in.nextInt();
            }
            else {
                System.out.println("Only integers");
                ReadConsole.readArrayInt();
            }
        }
        return inputArray;
    }

    public static String readSring() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int readInt() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            return in.nextInt();
        } else{
            return 0;
        }
    }
}

