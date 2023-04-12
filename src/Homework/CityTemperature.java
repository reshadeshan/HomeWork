package Homework;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {

        Scanner cityName = new Scanner(System.in);
        System.out.println("Please Enter the name of your city");
        String city = cityName.nextLine();
        Scanner Temp = new Scanner(System.in);
        System.out.println("Please Enter the temperature in F");
        double temperature= Temp.nextDouble();

        double c = ((temperature-32)*0.55);
        int temp=(int) c;
        System.out.println("The temperature in "+ city+" is "+temp);


    }
}
