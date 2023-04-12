package Homework;

import java.util.Scanner;

public class EnterFandLName {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter First Name");
        String firstName= scan.next();
        Scanner scan1= new Scanner (System.in);
        System.out.println("Please Enter Last Name");
        String lastName= scan1.next();
        System.out.println(firstName+" "+lastName);


    }


}
