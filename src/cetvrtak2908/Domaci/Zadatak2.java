package cetvrtak2908.Domaci;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        2. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca maksimalni element u nizu
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj celih brojeva u nizu: ");
        int n = sc.nextInt();
        int[] unetiNiz = new int[n];
        System.out.println("Unesite " + n + " brojeva");
        for (int i = 0; i < n; i++) {
            unetiNiz[i] = sc.nextInt();
        }
        System.out.println("Uneti niz elemenata je: ");
        System.out.println(Arrays.toString(unetiNiz));
        int maksimum = unetiNiz[0];
        for (int i = 1; i<n; i++){
            if (unetiNiz[i] > maksimum){
                maksimum = unetiNiz[i];
            }
        }
        System.out.println("Maksimalni element u nizu je: " + maksimum);

    }
}
