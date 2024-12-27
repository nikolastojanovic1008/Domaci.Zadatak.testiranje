package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308.Domaci;

import java.util.Scanner;

public class zadatak3a {
    public static void main(String[] args) {
        /*
3. Napisi jednostavan kalkulator koji trazi od korisnika da unese dva broja i operaciju (+ ili -).
Na osnovu izbora korisnika, program treba da izvrsi odgovarajucu operaciju.
 (char operacija = sc.next().charAt(0); -> za ucitavanje znaka)
*charAt(i) vraca karatker na i-tom mestu iz stringa, brojanje pocinje od 0 => charAt(0) -> vraca karakter na prvoj poziciji stringa
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        double broj1 = sc.nextDouble();
        System.out.println("Unesite znak '+' za sabiranje ili znak '-' za oduzimanje unetih brojeva: ");
        String operacija = sc.next();
        System.out.println("Unesite drugi broj:");
        double broj2 = sc.nextDouble();

        double zbir = broj1 + broj2;
        double razlika = broj1 - broj2;
        if (operacija.length() != 1) {
            System.out.println("Unos za matematičku operaciju može sadržati samo jedan karakter, pokušajte ponovo.");
        } else if (!operacija.equals("+") && !operacija.equals("-")) {
            System.out.println("Neispravan unos operacije, pokrenite program ponovo.");
        } else {
            if (operacija.equals("+")) {
                System.out.println("Zbir ova dva broja je: " + zbir);
            } else {
                System.out.println("Razlika ova dva broja je: " + razlika);
            }
        }
    }
}