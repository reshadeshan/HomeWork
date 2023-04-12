package Homework;

import java.util.Scanner;

public class ScannerNameAgeMobile {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("Enter your name");
        String n=name.next();
        Scanner phone=new Scanner(System.in);
        System.out.println("Enter your mobile number (please use xxx-xxx-xxxx format)");
        String phoneNumber= phone.next();
        Scanner a= new Scanner(System.in);
        System.out.println("Enter your age");
        int age= a.nextInt();

        System.out.println("Your name is "+n+" ,your age is "+ age+ " and your mobile number is "+phoneNumber);

    }
}
