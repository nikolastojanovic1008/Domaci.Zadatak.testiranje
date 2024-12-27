package vezbanje2;

import java.util.Scanner;

public class dodatnizadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti niz String-ova i stampati sve stringove koji imaju duzinu manju od 5.
         */
        Scanner sc = new Scanner(System.in);
        String[] nizStringova = new String[5];
        String[] nizStringova2 = {"mec", "godina", "planina", "prvi", "dva"};
        System.out.println("Unesite 5 razlicitih stringova: ");
       /* for (int i = 0; i < nizStringova.length; i++) {
            nizStringova[i] = sc.nextLine();
            if (nizStringova[i].length() < 5) {
                System.out.println(nizStringova[i]);
            }
        }*/
        for (int j = 0; j < nizStringova2.length; j++) {
            if (nizStringova2[j].length() < 5) {
                System.out.println(nizStringova2[j]);
            }
        }
    }
}
