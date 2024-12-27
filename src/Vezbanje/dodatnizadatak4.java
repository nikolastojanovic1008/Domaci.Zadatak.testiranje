package Vezbanje;

import java.util.Scanner;

public class dodatnizadatak4 {
    public static void main(String[] args) {
        /*
        Zadatak 4:
Pomocu for petlje proci kroz neku reci I izracunati broj pojavljivanja slova 'a'.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki string: ");
        String unos = sc.nextLine();
        int brojac = 0;

        for (int i = 0; i<unos.length(); i++){
            if (unos.toLowerCase().charAt(i) == 'a'){
                brojac++;
            }
        }
        System.out.println("Uneti string ima "+ brojac + " karaktera a");

    }
}
