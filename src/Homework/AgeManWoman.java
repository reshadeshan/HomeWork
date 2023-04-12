package Homework;

import java.util.Scanner;

public class AgeManWoman {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender= scan.next();

        Scanner scan2= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scan2.nextInt();
        if (gender.equals("M") && age>25){
        System.out.println("Man");
        } else if (gender.equals("M")&& age<25) {
            System.out.println("boy");}
        else if (gender.equals("F") && age>25) {
            System.out.println("Woman");}
        else if (gender.equals("F") && age<25) {
            System.out.println("girl");

        }


    }
}
