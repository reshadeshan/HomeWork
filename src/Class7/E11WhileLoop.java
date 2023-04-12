package Class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        int counter=100;
        while (counter>=1) {

            System.out.print(counter+" ");
            counter--;
        }
        //if we used data type for the first one we don't need to use for the second

        counter=20;
        System.out.println();
        while (counter<=100){
            System.out.print(counter+" ");
            counter+=2;
        }
        counter=100;
        System.out.println();
        while (counter>=1){
            if (counter%2==1){
                System.out.print(counter+" ");
            }
            counter--;
        }


    }
}
