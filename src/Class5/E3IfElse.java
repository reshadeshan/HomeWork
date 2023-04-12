package Class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("what is your age?");

        int age= scan.nextInt();
        if (age>=18){
            System.out.println("you are good to go");
        }else {
            System.out.println("you can't drive");}

    }
}
