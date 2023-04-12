package Homework;

import java.util.Scanner;

public class SmlNumbers {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a number");
        int number= scanner.nextInt();
        if (number>=0 && number <=10) {
            System.out.println("The number is small");
        } else if (number>=11 && number<=100) {
            System.out.println("The number is medium");
        } else if (number>=101 && number <=1000) {
            System.out.println("the number is large");}
        else {
            System.out.println("invalid number");

        }



    }
}
