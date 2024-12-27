package utorak2708.Domaci;

import java.util.Scanner;

public class zadatak3a {
    public static void main(String[] args) {
        /*
        2. Izbroj koliko se samoglasnika nalazi u unetom stringu (edited)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki tekst: ");
        String unetiTekst = sc.nextLine();
        int i = 0;
        int ukupnoSamoglasnika = 0;

        for (i = 0; i < unetiTekst.length(); i++) {
            // if (unetiTekst.toLowerCase().charAt(i) == 'a'){
          /*  switch (unetiTekst.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    ukupnoSamoglasnika++;
                default:
                    break;
            }*/
            switch (unetiTekst.toLowerCase().charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    ukupnoSamoglasnika++;
                    break;
                default:
            }
        }
        System.out.println("U tekstu koji ste uneli samoglasnici se javljaju  " + ukupnoSamoglasnika + " puta");
    }
}
