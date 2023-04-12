package Homework;

import java.util.Scanner;
public class booleanInt {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny = scan1.nextBoolean();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("What is the temperature outside?");
        int temp = scan1.nextInt();
        if (isSunny =true) {
            System.out.println("It is a sunny day, I should go somewhere!");
        } else if (isSunny = false) {
            System.out.println("I stay home and practice Java");
        } else if (temp >= 85) {
        System.out.println("I am going to the beach");
        }else {
            System.out.println("I am going to the park");
            
        }
    }
}
