package Task_02_1;

import java.awt.*;
import java.util.Scanner;

public  class ReadConsole {

    public static int[] readArrayInt() {
        int lengthArray;
        int[] inputArray;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter length of array: ");
            String inputString = in.next();
            try {
                Integer.parseInt(inputString);
            } catch (Exception e) {
                System.out.println(" You enter not an integer");
                continue;
            }
            lengthArray = Integer.parseInt(inputString);
            inputArray = new int[lengthArray];
            int flag = 0;
            while (flag != lengthArray){
                in = new Scanner(System.in);
                System.out.print("Enter array: ");
                for (int i = 0; i < inputArray.length; ++i) {
                    inputString = in.next();
                    try {
                        Integer.parseInt(inputString);
                    } catch (Exception e) {
                        flag = 0;
                        System.out.println(" You enter not an integer");
                        break;
                    }
                    inputArray[i] = Integer.parseInt(inputString);
                    ++flag;
                }
            }
            break;
        }
        return inputArray;
    }

    public static String readSring() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int readValue() {
        String inputString;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter value: ");
            inputString = in.next();
            try{
                Integer.parseInt(inputString);
            } catch (Exception e){
                System.out.println(" You enter not an integer");
                continue;
            }
            break;
        }
        return Integer.parseInt(inputString);
    }
}

