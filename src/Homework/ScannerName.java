package Homework;

import java.util.Scanner;

public class ScannerName {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name= scan.next();
        System.out.println("Your name is "+name);
    }
}
