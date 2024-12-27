package utorak2708.Domaci;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        /*
        2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program
treba da ispise rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja u slucaju
da je drugi broj jednak nuli.
         */
        Scanner sc = new Scanner(System.in);
        double a = 1;
        double b = 1;

        while (true) {
            System.out.print("Unesite prvi broj: ");
            a = sc.nextDouble();
            System.out.print("Unesite drugi broj: ");
            b = sc.nextDouble();
            double rezultat = a/b;
            System.out.println("Rezultat deljenja ova dva broja je: " + rezultat);
            if (b != 0) {
                break;
            }
        }
    }
}