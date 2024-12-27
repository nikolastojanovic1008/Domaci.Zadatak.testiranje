package utorak2708;

public class primerza1000 {
    public static void main(String[] args) {
        /*izlistaj sve proste brojeve do 1000*/

        for (int i = 2; i <= 1000; i++) {
            boolean prost = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    prost = false;
                    break;
                }
            }

            if (prost)
                System.out.println(i);
        }
    }
}