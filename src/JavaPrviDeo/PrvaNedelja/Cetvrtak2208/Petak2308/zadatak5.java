package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        /*
        Zadatak 5:
Napraviti program gde cete uneti koji je mesec u godini, u slucaju da su uneti "Jun" ili "Jul",
 ispisati poruku da su vrucine prevelike, u suprotnom ispisati da je temperatura stabilna.
         */
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite koji je mesec u godini :");
        String mesec = skener.nextLine();
        if (mesec.equalsIgnoreCase("Jun") || mesec.equalsIgnoreCase("Jul")) {
            System.out.println("Vrućine su prevelike!");
        }else {
            System.out.println("Temperatura je stabilna!");
        }

    }
}
