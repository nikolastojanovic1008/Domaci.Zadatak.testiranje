package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308;

import java.util.Scanner;

public class skenerZadatak {
    public static void main(String[] args) {
      /*  Scanner skener = new Scanner(System.in) ;
        System.out.println("Unesite vase ime: ");
        String ime = skener.nextLine();
        System.out.println("Unesite vase prezime: ");
        String prezime = skener.nextLine();
        System.out.println("unesite Vas broj godina : ");
        int brojGodina = skener.nextInt();
        System.out.println(ime + " " + prezime + " " + brojGodina);
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
