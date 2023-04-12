package Homework;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean booleanValue= scanner.nextBoolean();
        if (booleanValue=true){
            System.out.println("The value is true");

        }else {
            System.out.println("The value is false");
        }
    }

}
