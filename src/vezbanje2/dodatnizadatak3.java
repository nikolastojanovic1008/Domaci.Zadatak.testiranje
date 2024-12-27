package vezbanje2;

import java.util.Arrays;
import java.util.Scanner;

public class dodatnizadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti dva niza String-ova i proveriti da li su jednaki.
         */
        Scanner sc = new Scanner(System.in);

        String[] prviNiz = new String[3];
        String[] drugiNiz = new String[3];
        System.out.println("Unesite elemente prvog niza Stringova: ");
        for (int i = 0; i < prviNiz.length; i++) {
            prviNiz[i] = sc.nextLine();
        }
        System.out.println("Unesite elemente drugog niza Stringova: ");
        for (int j = 0; j < drugiNiz.length; j++) {
            drugiNiz[j] = sc.nextLine();
        }
        System.out.println(Arrays.toString(prviNiz));
        System.out.println(Arrays.toString(drugiNiz));
        boolean b = true;
        for (int k = 0; k < drugiNiz.length; k++) {
            if (prviNiz[k].equalsIgnoreCase(drugiNiz[k])) {
                b = true;
            } else {
                b = false;
            }
        }
        if (b) {
            System.out.println("Nizovi su jednaki");
        } else {
            System.out.println("Nizovi NISU jednaki");
        }
    }
}
