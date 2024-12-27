package utorak2708.Domaci;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        /*
        1. Izbroj koliko puta se javlja slovo 'a' u unetom stringu.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki string: ");
        String unetiString = sc.nextLine();

        int brojA = 0;
        for (int i = 0; i < unetiString.length(); i++) {
            if (unetiString.charAt(i) == 'a') {
                brojA++;
            }
        }

        System.out.println("Karakter 'a' se pojavljuje " + brojA + " puta.");
    }
}
