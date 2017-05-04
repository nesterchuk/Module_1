package Task_02_1;

import java.awt.*;
import java.util.Scanner;

public  class ReadConsole {

    public static int[] readArrayInt() {
        int lengthArray;
        boolean ifRead = false;
        while (true){
            System.out.print("Enter length of array: ");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()){
                lengthArray = in.nextInt();
                break;
            }
            System.out.println("Not an integer");
        }
        int[] inputArray = new int[lengthArray];

        loop: while (true) {
            System.out.print("Enter array: ");
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < inputArray.length; ++i) {
                if (in.hasNextInt()){
                    inputArray[i] = in.nextInt();
                }
                else {
                    System.out.println("Enter " + lengthArray + " integers");
                    continue loop;
                }
            }
            return inputArray;
        }

    }

    public static String readSring() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int readValue() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter value: ");
            if (in.hasNextInt()) {
                return in.nextInt();
            } else {
                System.out.println("Not an integer");
            }

        }
    }
}

