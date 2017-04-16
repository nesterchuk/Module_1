package Task_01_1;

import java.util.Scanner;

public class GreetingDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your name:");
        Greeting user = new Greeting(in.nextLine());
        user.hello();
    }
}
