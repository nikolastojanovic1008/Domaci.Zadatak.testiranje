package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        /*
Zadatak 4:
Uneti preko skenera neki broj, ukoliko je taj broj veci od 10 i paran, smanjiti ga za 1, u suprotnom ga povecati za 1.
 */
        Scanner skener = new Scanner(System.in);
        System.out.println(" Unesite neki broj : ");
        int broj1 = skener.nextInt();
        if ((broj1>10) && (broj1%2==0)) {
            System.out.println(--broj1 + " Smanjili smo ga za jedan");
        }
        else {
            System.out.println(++broj1 + " Povecali smo ga za jedan");
        }



    }
}
