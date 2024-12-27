package Vezbanje;

import java.util.Scanner;

public class dodatnizadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti program za Biblioteku, kao atribut imate clanarinu koja je 1000,
zatim unesite vas status ("student","penzioner" ili "zaposlen).
Penzioneri imaju 20% popusta na clanarinu dok studenti imaju 10%.
Zaposleni nemaju nikakav popust.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite vas status (student, penzioner ili zaposlen): ");
        String status = sc.nextLine();
        int clanarina = 1000;

        if (status.trim().equalsIgnoreCase("student")) {
            System.out.println("Vasa clanarina je :" + clanarina * 0.9);
        } else if (status.trim().equalsIgnoreCase("penzioner")) {
            System.out.println("Vasa clanarina je :" + clanarina * 0.8);
        } else if (status.trim().equalsIgnoreCase("zaposlen")) {
            System.out.println("Vasa clanarina je :" + clanarina);
        } else {
            System.out.println("Niste uneli ispravan status!");
        }


    }
}
