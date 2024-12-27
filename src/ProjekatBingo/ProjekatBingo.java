package ProjekatBingo;

import java.util.Arrays;
import java.util.Scanner;

public class ProjekatBingo {
    public static void main(String[] args) {
        /*
        Projekat:
Bingo Projekat
Napraviti program koji se sastoji od tri metode:
-unesiBrojeve() -> metoda vraca niz od 6 brojeva, to mogu biti brojevi
koji su odmah definisani, ubaceni preko skenera ili ubaceno preko Math.random().
Ovih 6 brojeva ce biti brojevi koji ce korisnik pogadjati.
-generisi() -> vraca nam niz od 30 nasumnicnih brojeva(nije bitno ako ima duplikata).
-bingo(int[] niz1,int[] niz2) -> prethodno dva izgenerisana niza proslednjujemo ovoj metodi i proveravamo
Koliko se nashi brojeva nalazi u izgenerisanom nizu, ispisati poruku ako korisnik pogodi bingo!
**Ukoliko ima potrebe za neke modifikacije metoda u smislu da dodate nesto, napravite pomocnu metodu i to,
to je sve dozvoljno
         */
        Scanner sc = new Scanner(System.in);
        //int[] niz = unesiBrojeve(sc);

        //System.out.println("Izvučeni su sledeći brojevi: " + Arrays.toString(generisi(30, 1, 48)));
        //bingo(unesiBrojeve(sc), generisi(30, 1, 48));
        int rezultatSvega = bingo(unesiBrojeve(sc), generisi(30, 1, 48));
        if (rezultatSvega >= 0) {
            System.out.println("Imate ukupno " + rezultatSvega + " pogodaka");
        }
        if (rezultatSvega == 6) {
            System.out.println("BINGO!");
        }
        // System.out.println("Broj pogodaka je " + bingo(unesiBrojeve(sc), generisi(30, 1, 48)));


    }

    public static int[] unesiBrojeve(Scanner sc) {
        sc = new Scanner(System.in);
        int[] niz = new int[6];
        System.out.println("Unesite 6 različitih brojeva od 1 do 48: ");
        for (int i = 0; i < 6; i++) {

            niz[i] = sc.nextInt();
            if (niz[i] > 48 || niz[i] <= 0) {
                System.out.println("Možete unositi brojeve samo do 48!");
                break;
            }
        }
        System.out.println("Izabrali ste sledeće brojeve" + Arrays.toString(niz));
        return niz;
    }

    public static int[] generisi(int brojElemenata, int minimum, int maksimum) {
        // int brojElemenata = 30;
        // int minimum = 1;
        // int maksimum = 48;
        int[] izvučeniBrojevi = new int[brojElemenata];
        for (int i = 0; i < brojElemenata; i++) {
            izvučeniBrojevi[i] = (int) (Math.random() * (maksimum - minimum + 1) + minimum);
        }
        System.out.println("Izvučeni su sledeći brojevi: " + Arrays.toString(izvučeniBrojevi));
        return izvučeniBrojevi;

    }

    public static int bingo(int[] niz1, int[] niz2) {
        //niz1 = new int[6];
        //niz2 = new int[30];
        int brojPogodaka = 0;
        int mojBroj = 0;
        for (int i = 0; i < niz1.length; i++) {
            mojBroj = niz1[i];
            for (int j = 0; j < niz2.length; j++) {
                if (mojBroj == niz2[j]) {
                    brojPogodaka++;
                    break;
                }
            }
        }
        return brojPogodaka;
        //System.out.println("Imate ukupno " + brojPogodaka + " pogodaka");
        // if (brojPogodaka == 6) {
        //     System.out.println("BINGO");
        // }
    }

}

