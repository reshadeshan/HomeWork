package Class9;

public class E7Arrays {
    public static void main(String[] args) {
        boolean [] flags={true,false,true,false,false,true};

        int counters=0;
        for (int i=0;i<flags.length; i++){
            if (flags [i]==false){
                counters++;

            }
        }
        System.out.println(counters);
    }

}
