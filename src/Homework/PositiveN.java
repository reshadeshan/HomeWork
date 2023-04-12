package Homework;

import java.util.Scanner;

public class PositiveN {
    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            int num = inp.nextInt();
            if (num > 0) {
                System.out.println(num+ " is positive");
            } else if (num < 0) {
                System.out.println(num+ " is negative");
            } else if (num== 0){
                System.out.println("Entered number is equals to 0");{

                }
            }

    }

}
// int num1=10;
//        int num2=20;
//        boolean result=num1>num2; // false
//        System.out.println(result);
//        System.out.println(num1>num2); // false
//        System.out.println(num1<num2); // true