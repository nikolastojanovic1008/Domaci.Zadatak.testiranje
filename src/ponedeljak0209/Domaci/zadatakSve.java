package ponedeljak0209.Domaci;

import java.util.Scanner;

public class zadatakSve {
    public static void main(String[] args) {
        /*
        1. Napisati program koji omogucava korisniku da unese niz celih brojeva. Program treba da ima sledeće metode:
- Metoda za unos niza
- Metoda za stampanje niza
- Metoda za racunanje srednje vredsnoti brojeva u nizu
- Metoda za sabiranje svih dvocifrenih brojeva
- Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza
Dodatni:
Napisati metodu za vracanje niza sa obrnutim redosledom elemenata niza
Napisati metodu za vracanje broja brojeva vecih od proseka
         */
        Scanner sc = new Scanner(System.in);
        int[] niz1 = {1, 2, -2, 4, 21};
        // int[] niz = unosNiza(sc);
        // stampanjeNiza(niz);
        // System.out.println("Srednja vrednost unetog niza je: " + srednjavrednost(niz));
        //System.out.println(zbirDvocifrenih(niz1));
        System.out.println(srednjavrednost(niz1));
    }

    public static int[] unosNiza(Scanner sc) {
        System.out.print("Unesite velicinu niza: ");
        int velicina = sc.nextInt();

        int[] niz = new int[velicina];

        System.out.println("Unesite " + velicina + " elemenata");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    public static void stampanjeNiza(int[] niz) {
        for (int i = 0; i < niz.length; i++)
            System.out.println(niz[i]);
    }

    public static double srednjavrednost(int[] niz) {
        double suma = 0;
        double srednjaVrednost = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];

        }
        srednjaVrednost = suma / niz.length;
        return srednjaVrednost;
    }

    public static int zbirDvocifrenih(int[] niz) {
        int sumaDvocifrenih = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > 9) {
                sumaDvocifrenih += niz[i];
            }
        }
        return sumaDvocifrenih;
    }

    public static int razlikaMinimumMaksimum(int[] niz) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < niz.length; i++) {
            if (max < niz[i]) {
                max = niz[i];
            }
            if (min > niz[i]) {
                min = niz[i];
            }
        }
        int rezultat = max - min;
        return rezultat;
    }


}
