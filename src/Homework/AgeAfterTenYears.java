package Homework;

import java.util.Scanner;

public class AgeAfterTenYears {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age= scanner.nextInt();
        System.out.println("Your age after 10 years is "+(age+10));
    }
}
