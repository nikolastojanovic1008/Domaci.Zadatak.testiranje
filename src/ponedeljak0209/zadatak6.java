package ponedeljak0209;

import java.util.Arrays;

public class zadatak6 {
    public static void main(String[] args) {
        /*
        Zadatak 6:
Napraviti metodu koja prima dva niza razlicitih duzina i sabire ih.
         */
        int[] niz1 = {15, 2, 3, 22, 12};
        int[] niz2 = {0, -11, -4};
        stampanje(treci(niz1, niz2));

    }

    public static int[] treci(int[] niz1, int[] niz2) {
        int[] manjiNiz;
        int[] veciNiz;

        if (niz1.length > niz2.length) {
            manjiNiz = niz2;
            veciNiz = niz1;
        } else {
            manjiNiz = niz1;
            veciNiz = niz2;
        }

        int[] niz3 = new int[veciNiz.length];
        for (int i = 0; i < veciNiz.length; i++) {
            if (i < manjiNiz.length) {
                niz3[i] = veciNiz[i] + manjiNiz[i];
            } else {
                niz3[i] = veciNiz[i];
            }

        }
        return niz3;
    }

    public static void stampanje(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
        }
        System.out.println(Arrays.toString(niz));
    }

}
