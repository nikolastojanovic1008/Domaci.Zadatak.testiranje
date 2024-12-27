package utorak2708;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        /*
        Zadatak 4:
Napraviti program gde cete preko Scanner-a unositi neki String sve dok ne unesete tacku, cim se unese tacka
treba kao rezultat vratiti sav prethodno uneti String.
         */
        Scanner sc = new Scanner(System.in);

        String text = "";
        String ispis = "";

        while (!text.equals(".")); {
            ispis = ispis + " " + text;
            text = sc.next();
        }
        System.out.println(ispis);
    }
}
