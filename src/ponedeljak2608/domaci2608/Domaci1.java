package ponedeljak2608.domaci2608;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        /*
        1. Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj (na primer, 5, 4, 3, 2, 1).
        Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem kljucu:
Ako je ocena 5, slovna ocena je "Odlican".
Ako je ocena 4, slovna ocena je "Vrlo dobar".
Ako je ocena 3, slovna ocena je "Dobar".
Ako je ocena 2, slovna ocena je "Dovoljan".
Ako je ocena 1, slovna ocena je "Nedovoljan".
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ocenu koju koju je dobio učenik (od 1 do 5)");
        int ocena = sc.nextInt();
        switch (ocena) {
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Odličan");
                break;
            default:
                System.out.println("Možete uneti samo ocene od 1 do 5!");
                break;
        }
    }
}
