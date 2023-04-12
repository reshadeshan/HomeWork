package Class5;

import java.util.Scanner;

public class E4NestedIF {
    public static void main(String[] args) {

        int money = 20000;
        String day = "Sunday";
        if (money > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping");
            } else {
                System.out.println("lets wait for sunday");
            }
        }

    }
}
