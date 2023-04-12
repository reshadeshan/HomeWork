package Homework;

public class DoubleComparison {
    public static void main(String[] args) {
        double distanceToNy = 3600;
        double distanceToDc = 2800;

        if (distanceToNy > distanceToDc) {

            System.out.println(+distanceToNy + " is longer than " + distanceToDc);

        } else {
            System.out.println(+distanceToDc + " is shorter than " + distanceToNy);
        }
    }
}