package Homework;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please Enter Your Age:");
        int age= scan.nextInt();
        if (age >= 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");}
    }
}
