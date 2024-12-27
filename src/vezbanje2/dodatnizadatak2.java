package vezbanje2;

import java.util.Arrays;
import java.util.Scanner;

public class dodatnizadatak2 {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Napraviti niz String-ova i definisati jos jedan String, ispisati poruku ukoliko se taj String nalazi u nizu.
         */
        Scanner sc = new Scanner(System.in);
        String[] nizStringova = new String[5];

        System.out.print("Unesite neki string: ");
        String nekiString = sc.nextLine();
        boolean b = false;
        System.out.println("Unesite niz String-ova: ");
        for (int i = 0; i < nizStringova.length; i++) {
            nizStringova[i] = sc.nextLine();
        }
        for (int i = 0; i < nizStringova.length; i++) {
            if (nizStringova[i].equalsIgnoreCase(nekiString)) {
                b = true;
                break;
            }
        }
        System.out.println("Uneti string");
        System.out.println(nekiString);
        System.out.println("Uneti NIZ stringova");
        System.out.println(Arrays.toString(nizStringova));

        if (b) {
            System.out.println("String se nalazi u nizu stringova!");
        } else {
            System.out.println("String se NE nalazi u nizu stringova!");
        }
    }
}
