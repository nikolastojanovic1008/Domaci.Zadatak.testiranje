package utorak2708.Domaci;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        /*
        1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne
unese ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalozovana.
         */
        Scanner sc = new Scanner(System.in);
        String lozinka = "Ispravno12345";
        String proba;


        do {
            System.out.print("Unesite lozinku: ");
            proba = sc.nextLine();

            if (!proba.equals(lozinka)) {
                System.out.println("Lozinka nije ispravna. Pokušajte ponovo.");
            }

        } while (!proba.equals(lozinka));

        // Poruka nakon uspešnog unosa lozinke
        System.out.println("Lozinka je ispravna. Dobrodošli!");
    }
}
