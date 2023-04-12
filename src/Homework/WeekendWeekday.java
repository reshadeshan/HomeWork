package Homework;

import java.util.Scanner;

public class WeekendWeekday {
    public static void main(String[] args) {
        Scanner noDay=new Scanner(System.in);
        System.out.println("please Enter the day in number");
        int result= noDay.nextInt();
        if(result>=1 && result<=5){
        System.out.println("It is a weekday");
        } else if (result>=6 && result<=7) {
            System.out.println("It is a weekend");
        } else System.out.println("Invalid day");
    }
}

