package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308.Domaci;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        /*
2. Napisati progam koji za uneti broj poena (0-100) dodeljuje odgovarajucu ocenu (6, 7, 8, 9, 10) prema sledecem ranigiranju
51-60
61-70
71-80
81-90
91-100
Ako je broj poena manji od 51, ispisati poruku da je broj bodova nedovoljan za polaganje ispita.
         */
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite broj poena učenika: ");
        int ocena = skener.nextInt();

        if (ocena > 50 && ocena <= 60) {
            System.out.println("Učenik je dobio ocenu 6");
        } else if (ocena > 60 && ocena <= 70) {
            System.out.println("Učenik je dobio ocenu 7");
        } else if (ocena > 70 && ocena <= 80) {
            System.out.println("Učenik je dobio ocenu 8");
        } else if (ocena > 80 && ocena <= 90) {
            System.out.println("Učenik je dobio ocenu 9");
        } else if (ocena > 90 && ocena <= 100) {
            System.out.println("Učenik je dobio ocenu 10");
        } else if (ocena > 100) {
            System.out.println("Maksimalan broj poena koji učenik može da dobije je 100!");
        } else {
            System.out.println("Broj poena je nedovoljan za polaganje ispita!");
        }
    }
}
