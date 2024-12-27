package Vezbanje;

import java.util.Scanner;

public class dodatnizadatak2 {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Napraviti program gde cete uneti neki mesec, pomocu Swtich-a napraviti
ispis o tome Koliko taj mesec ima dana.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki mesec: ");
        String mesec = sc.next();

        switch (mesec.trim().toLowerCase()) {
            case "januar", "mart", "maj", "jul", "avgust", "oktobar", "decembar":
                System.out.println(mesec + " ima 31 dana");
                break;
            case "april", "jun", "septembar", "novembar":
                System.out.println(mesec + " ima 30 dana");
                break;
            case "februar":
                System.out.println(mesec + " ima 28 ili 29 dana");
                break;
            default:
                break;
        }
    }
}
