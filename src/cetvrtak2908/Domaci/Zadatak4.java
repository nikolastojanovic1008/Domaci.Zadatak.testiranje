package cetvrtak2908.Domaci;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        /*
        2. Napisati program koji trazi od korisnika da unese niz celih brojeva,
        zatim vraca odgovor da li je veca apsolutna vrednost zbira pozitivnih brojeva ili apsolutna vrednost zbira negativnih brojeva.
        Funkcija za dobijanje apsoultne vrednosti broja je: Math.abs(broj).
         */
        Scanner sc = new Scanner(System.in);
        int[] unetiNiz = new int[5];
        int zbirPozitivnih = 0;
        int zbirNegativnih = 0;

        System.out.println("Unesite 5 celobrojnih brojeva: ");
        for (int i = 0; i < 5; i++) {
            unetiNiz[i] = sc.nextInt();
            if (unetiNiz[i] >= 0) {
                zbirPozitivnih += unetiNiz[i];
            } else {
                zbirNegativnih += unetiNiz[i];
            }
        }
        System.out.println("Zbir pozitivnih je: " + zbirPozitivnih);
        System.out.println("Zbir negativnih je: " + zbirNegativnih);
        int absZbirPozitivnih = Math.abs(zbirPozitivnih);
        int absZbirNegativnih = Math.abs(zbirNegativnih);
        if (absZbirPozitivnih > absZbirNegativnih) {
            System.out.println("Apsolutna vrednost pozitivnih je veca!");
        } else if (absZbirPozitivnih<absZbirNegativnih){
            System.out.println("Apsolutna vrednost negativnih je veca!");
        }else {
            System.out.println("Apsolutne vrednosti pozitivnih i negativnih su jednake!");
        }
    }
}
