package Class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter you name");
        String name = scanner.next();

        if (name.equals("Reshad")) {
            System.out.println("Mac User");
        } else if (name.equals("Safyan")) {
            System.out.println("Naughty");
        } else if (name.equals("Hali")) {
            System.out.println("Best");

        } else {
            System.out.println("None");
        }

    }
}