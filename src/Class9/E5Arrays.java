package Class9;

public class E5Arrays {
    public static void main(String[] args) {

        char [] chars={'A','B','C','D','E'};

        for(int i=0; i <chars.length; i+=2){
            if (i%2==0){
                System.out.println(chars[i]);
            }
        }

    }
}
