package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Uneti prvi broj preko skenera, zatim uneti drugi broj preko skenera i kao rezultat ispisati njihov zbir.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj preko skenera :");
        int broj1 = sc.nextInt();
        System.out.println("Unesite drugi broj preko skenera");
        int broj2 = sc.nextInt();
        int broj3 = broj1 + broj2;

        System.out.println("Zbir brojeva koje ste uneli je: " + broj3);
    }
}
