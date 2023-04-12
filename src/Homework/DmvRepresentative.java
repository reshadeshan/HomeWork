package Homework;

import java.util.Scanner;

public class DmvRepresentative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please Enter Your Age:");
        int age= scan.nextInt();
        if (age >= 18){
            System.out.println("you are eligible to get drivers license");
        }else {
            System.out.println("You are only eligible to get a permit.");}
    }

}
