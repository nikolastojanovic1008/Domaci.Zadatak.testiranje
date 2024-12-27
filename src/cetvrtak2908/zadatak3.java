package cetvrtak2908;

import java.util.Arrays;

public class zadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti niz brojeva i prebrojati Koliko ima brojeva koji su deljivi sa 3.
         */
        int[] mojNiz = {1, 2, 3, 4, 5, 6, 33, 55, 63, 99};
        System.out.println("Dat je sledeci niz brojeva");
        System.out.println(Arrays.toString(mojNiz));
        int brojac = 0;
        for (int i = 0; i < mojNiz.length; i++) {
            if (mojNiz[i] % 3 == 0) {
                brojac++;
            }
        }
        System.out.println("Brojeva koji su deljivi sa 3 ima ukupno: " + brojac);
    }
}
