package ponedeljak0209;

import java.util.Arrays;

public class zadatak5 {
    public static void main(String[] args) {
        /*
Zadatak 5:
Napraviti metodu koja prima dva niza istih duzina i sabire ih.
         */
        int[] niz1 = {0, 2, 3, 4};
        int[] niz2 = {3, 4, 5, 6};

        stampanje(noviniz(niz1, niz2));

    }

    public static int[] noviniz(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];

        }
        return c;
    }

    public static void stampanje(int[] niz) {
        for (int i = 0; i < niz.length; i++) {

        }
        System.out.println(Arrays.toString(niz));
    }
}
